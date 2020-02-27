package project.wgtech.openastrospace.base

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import project.wgtech.openastrospace.R
import project.wgtech.openastrospace.astro.view.AstroFragment
import project.wgtech.openastrospace.astro.viewmodel.AstroViewModel
import project.wgtech.openastrospace.city.CityFragment
import project.wgtech.openastrospace.databinding.FragmentAstroBinding
import project.wgtech.openastrospace.databinding.FragmentHomeBinding
import project.wgtech.openastrospace.etc.EtcFragment
import project.wgtech.openastrospace.nature.NatureFragment
import java.lang.IllegalArgumentException

class HomeFragment : Fragment(R.layout.fragment_home) {
    private val TAG = HomeFragment::class.simpleName

    private lateinit var b: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_main, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var parentActivity : AppCompatActivity = activity as AppCompatActivity
        b = DataBindingUtil.setContentView(parentActivity,
            R.layout.fragment_home
        )

        val tabLayout : TabLayout = b.tabLayoutMain
        val selectedTab : TabLayout.Tab = tabLayout.getTabAt(0)!!
        val viewPager : ViewPager2 = b.viewPagerMain
        viewPager.adapter = TabsAdapter(
            childFragmentManager,
            lifecycle
        )
        viewPager.isUserInputEnabled = false

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = getString(R.string.menu_astro)
                1 -> tab.text = getString(R.string.menu_nature)
                2 -> tab.text = getString(R.string.menu_city)
                3 -> tab.text = getString(R.string.menu_etc)
                else -> throw IllegalArgumentException()
            }
        }.attach()
        tabLayout.selectTab(selectedTab, true)
    }

}


class TabsAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    private val TAG = TabsAdapter::class.simpleName

    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment
        when (position) {
            0 -> fragment =
                AstroFragment<FragmentAstroBinding, AstroViewModel>()
            1 -> fragment = NatureFragment()
            2 -> fragment = CityFragment()
            3 -> fragment = EtcFragment()
            else -> throw IllegalArgumentException()
        }

        return fragment
    }

    override fun getItemCount(): Int = 4

}