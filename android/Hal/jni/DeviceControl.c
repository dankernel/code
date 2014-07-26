#include "DeviceControl.h"
#include "hardware.h"
#include "vibrator.h"
#include <dlfcn.h>

JNIEXPORT jstring JNICALL Java_com_example_hal_NativeCall_stringFromJNI(JNIEnv *env, jobject obj)
{
    return (*env)->NewStringUTF(env, "Native C, Message");
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_CameraOn(JNIEnv *env, jobject obj)
{
    void *handle;
    struct hw_module_t *hmi;

	if((handle = dlopen("/system/lib/libhardware.so", RTLD_NOW)) == NULL){
		return -1;
	}

	const char *sym = HAL_MODULE_INFO_SYM_AS_STR;

	hmi = (struct hw_module_t *)dlsym(handle, sym);

	//hmi->methods->hw_get_module(NULL, 3000);

	return 10;

	//hw_module_t const *module;
    // char *device_path = "/sys/class/timed_output/vibrator/enable";
	//return hw_get_module("vibrator", &module);
	/*
    int fd;
    char second[20];
    int length;

    // 퍼미션 때문에 안되는것 같다. 실제 돌리면 에러.
    // 문제는... ndk로 한다고 해서 장치(진동기)를 제어할수 있는 퍼미션이 주어지는게 아니다.
    // 메니페스트파일에 슈퍼유저를 준다고 해도, 제어할수 없어...
    // 한마디로, 장치를 직접 제어하는것은 불가능하다. 루팅이라도 하지 않는한.
    // 시스템에서 기본적으로 제공하는 library(libhardware 같은) 공유라이브러리를 사용해야 할듯.

    if((fd = open(device_path, O_WRONLY | O_NONBLOCK)) < 0){
        return fd;
    }

    length = snprintf(second, sizeof(second), "%u\n", 3000);

    if(write(fd, second, length) <= 0){
        return -22;
    }

    close(fd);
	*/
    // 파기 코드, 진동기는 모듈을 가져오지 않아도 된다.
    /* hw_module_t const *module; */
    /* vibrator_device_t *dev; */
    /* hw_get_module(VIBRATOR_HARDWARE_MODULE_ID, &module); */
    /* vibrator_open(module, &dev); */
    /* vibrator_close(dev); */
    
    //return 1;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_CameraOff(JNIEnv *env, jobject obj)
{
    return 2;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_MicrophoneOn(JNIEnv *env, jobject obj)
{
    return 3;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_MicrophoneOff(JNIEnv *env, jobject obj)
{
    return 4;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_SDCardOn(JNIEnv *env, jobject obj)
{
    return 5;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_SDCardOff(JNIEnv *env, jobject obj)
{
    return 6;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_GPSOn(JNIEnv *env, jobject obj)
{
    return 7;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_GPSOff(JNIEnv *env, jobject obj)
{
    return 8;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_MobileOn(JNIEnv *env, jobject obj)
{
    return 9;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_MobileOff(JNIEnv *env, jobject obj)
{
    return 10;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_WifiOn(JNIEnv *env, jobject obj)
{
    return 11;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_WifiOff(JNIEnv *env, jobject obj)
{
    return 12;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_BluetoothOn(JNIEnv *env, jobject obj)
{
    return 13;
}

JNIEXPORT jint JNICALL Java_com_example_hal_NativeCall_BluetoothOff(JNIEnv *env, jobject obj)
{
    return 14;
}
