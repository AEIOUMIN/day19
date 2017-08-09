package com.day.demo02.test;

import com.day.demo02.comptuer.CPUAMD;
import com.day.demo02.comptuer.Computer;
import com.day.demo02.comptuer.EMS2000;
import com.day.demo02.comptuer.HardDisk4GB;
import com.day.demo02.impl.CPU;
import com.day.demo02.impl.EMS;
import com.day.demo02.impl.HardDisk;

public class Test {
	public static void main(String[] args) {
		CPU cpu;
		EMS ems;
		HardDisk hardDisk;
		cpu = new CPUAMD();
		ems = new EMS2000();
		hardDisk = new HardDisk4GB();
		Computer computer = new Computer(cpu, ems, hardDisk);
		computer.print();
	}
}
