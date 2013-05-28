#include <jni.h>
#include <stdio.h>
#include "HelloWorld.h"

JNIEXPORT jstring JNICALL 
Java_com_leo_helloworld_Helloworld_getPrint (JNIEnv *env, jobject obj)
{
        printf("Hello World! in jnl\n haha!!\n ok\n");
}
