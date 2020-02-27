#include <jni.h>

JNIEXPORT jstring JNICALL
Java_project_wgtech_openastrospace_util_ApiUtil_getNasaKey(JNIEnv *env, jobject instance) {
    return (*env) -> NewStringUTF(env, "");
}

JNIEXPORT jstring JNICALL
Java_project_wgtech_openastrospace_util_ApiUtil_getUnsplashAccessKey(JNIEnv *env, jobject instance) {
    return (*env) -> NewStringUTF(env, "");
}

JNIEXPORT jstring JNICALL
Java_project_wgtech_openastrospace_util_ApiUtil_getUnsplashSecretKey(JNIEnv *env, jobject instance) {
    return (*env) -> NewStringUTF(env, "");
}