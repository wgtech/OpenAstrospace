package project.wgtech.openastrospace.astro.model

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaInterface {

    @GET("/planetary/apod")
    fun getApod(
        @Query("api_key") apiKey: String
    ): Call<ResponseBody>
}