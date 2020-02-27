package project.wgtech.openastrospace.common.util

import okhttp3.OkHttpClient
import project.wgtech.openastrospace.astro.model.NasaInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitUtil {

    private val r = Retrofit.Builder()
                            .client(OkHttpClient.Builder()
                                .connectTimeout(1, TimeUnit.MINUTES)
                                .callTimeout(1, TimeUnit.MINUTES).build())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()

    fun getInstance(): NasaInterface = r.create(
        NasaInterface::class.java)
}