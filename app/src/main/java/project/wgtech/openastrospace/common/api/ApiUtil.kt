package project.wgtech.openastrospace.common.api

object ApiUtil {
    init {
        System.loadLibrary("api")
    }

    private external fun getNasaKey(): String
    private external fun getUnsplashAccessKey(): String
    private external fun getUnsplashSecretKey(): String

    public fun getNasaApiKey(): String {
        return getNasaKey()
    }

    public fun getUnsplashApiAccessKey(): String {
        return getUnsplashAccessKey()
    }

    public fun getUnsplashApiSecretKey(): String {
        return getUnsplashSecretKey()
    }
}