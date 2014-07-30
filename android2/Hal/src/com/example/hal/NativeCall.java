package com.example.hal;

public class NativeCall {
	// define load library
	static {
		System.loadLibrary("DeviceControl");
	}
	
	// define using JNI functions
	public native String stringFromJNI();
	public native int CameraOn();
	public native int CameraOff();
	public native int MicrophoneOn();
	public native int MicrophoneOff();
	public native int SDCardOn();
	public native int SDCardOff();
	public native int GPSOn();
	public native int GPSOff();
	public native int MobileOn();
	public native int MobileOff();
	public native int WifiOn();
	public native int WifiOff();
	public native int BluetoothOn();
	public native int BluetoothOff();
}