package com.leo.helloworld;

import java.lang.System;
import java.util.StringTokenizer;

public class Helloworld {

	public Helloworld() {
		// TODO Auto-generated constructor stub
	}

	public native String getPrint();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//java.libary.path = .:/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java
		String property = System.getProperty("java.library.path");
		StringTokenizer parser = new StringTokenizer(property, ";");
		while (parser.hasMoreTokens()) {
		    System.err.println(parser.nextToken());
		    }
		
//solution1:
		System.loadLibrary("helloworld");
//solution2:
//		System.load("/Users/milliyang/Documents/workspace/helloworldjni/jnicode/libhelloworld.jnilib");
		
//invalid format
//		System.load("/Users/milliyang/Documents/workspace/helloworldjni/libs/armeabi/libhelloworld.so");
		System.out.printf("this is java's printf function\n");
		System.out.printf("this is jni's printf function:%s\n", new Helloworld().getPrint());
		
	}
	


}
