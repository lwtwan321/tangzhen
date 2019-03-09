#include <jni.h>
#include <string>





extern "C"
JNIEXPORT jstring JNICALL
Java_com_shanghai_tangzhen_ui_main_MainActivity_stringFromJNI(JNIEnv *env, jobject instance) {

    std::string hello = "Hello from Ding";
    return env->NewStringUTF(hello.c_str());


}