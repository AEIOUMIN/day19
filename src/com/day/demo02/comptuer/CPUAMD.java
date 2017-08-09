package com.day.demo02.comptuer;

import com.day.demo02.impl.CPU;

public class CPUAMD implements CPU{

	@Override
	public String getBrand() {
		
		return "AMD";
	}

	@Override
	public double getFrequency() {
		
		return 3.5;
	}
	
}
