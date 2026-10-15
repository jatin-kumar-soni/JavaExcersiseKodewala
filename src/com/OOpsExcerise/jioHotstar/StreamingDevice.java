package com.OOpsExcerise.jioHotstar;

import java.util.Scanner;

abstract class StreamingDevice {
	protected String deviceName;
	protected double temp;

	public StreamingDevice(String deviceName) {
		super();
		this.deviceName = deviceName;
	}
	abstract void turnOn();
	abstract void turnOff();
	abstract Boolean device(String device);
	
}
class JioHotstarTV extends StreamingDevice
{


	public JioHotstarTV(String deviceName, double temp) {
		super(deviceName);
		this.temp = temp;
	}
	Boolean device(String device)
	{
		if(this.deviceName.equalsIgnoreCase(device))
		{
			System.out.println("Device: "+this.deviceName);
			System.out.println("Temprature: "+this.temp+" C");
			return true;
		}
		return false;
	
	}
	void turnOn()
	{
		System.out.println(this.deviceName+ "is Turned On");
	}
	void turnOff()
	{
		System.out.println(this.deviceName+ " is shutdown");
	}
}
