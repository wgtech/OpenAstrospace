package project.wgtech.openastrospace.astro.view

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import project.wgtech.openastrospace.R

class AstroFragment<VB: ViewDataBinding, VM:ViewModel> : Fragment(R.layout.fragment_astro) {
    private val TAG = AstroFragment::class.simpleName

    private lateinit var binding: VB
    private lateinit var viewModel: VM

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }




}