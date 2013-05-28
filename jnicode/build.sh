#!/bin/bash
#cc -I/usr/lib/jvm/java-6-sun/include/linux/ 
#   -I/usr/lib/jvm/java-6-sun/include/
#       -fPIC -shared -o libHelloworld.so Helloworld.c
g++ -dynamiclib -o libhelloworld.jnilib Helloworld.c  -framework JavaVM -I/System/Library/Frameworks/JavaVM.framework/Headers

