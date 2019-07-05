package com.yuntu.explore;

public class JNIDemo {
    public native void sayHello();

    public static void main(String[] args) {
        System.loadLibrary("JNIDemo");
        JNIDemo jniDemo = new JNIDemo();
        jniDemo.sayHello();
    }
}
