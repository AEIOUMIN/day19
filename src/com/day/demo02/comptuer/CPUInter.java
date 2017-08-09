package com.day.demo02.comptuer;

import com.day.demo02.impl.CPU;

public class CPUInter implements CPU{

	@Override
	public String getBrand() {
		
		return "Intel";
	}

	@Override
	public double getFrequency() {
		
		return 2.5;
	}
	
}
