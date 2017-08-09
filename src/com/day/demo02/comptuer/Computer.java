package com.day.demo02.comptuer;

import com.day.demo02.impl.CPU;
import com.day.demo02.impl.EMS;
import com.day.demo02.impl.HardDisk;

public class Computer {
	CPU cpu;
	EMS ems;
	HardDisk hradDisk;
	public Computer(CPU cpu, EMS ems, HardDisk hradDisk) {
		this.cpu = cpu;
		this.ems = ems;
		this.hradDisk = hradDisk;
	}
	
	public void print(){
		System.out.println("计算机的信息如下：");
		System.out.println("计算机的品牌是："+cpu.getBrand()+"\t主频是："+cpu.getFrequency()+"Hz");
		System.out.println("计算机的内存是："+ems.getEMS()+"GB");
		System.out.println("计算机的缓存是："+hradDisk.getHradDisk()+"GB");
	}
}
