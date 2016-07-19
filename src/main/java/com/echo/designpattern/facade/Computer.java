package com.echo.designpattern.facade;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

	public void startup() {
		System.out.println("Computer is starting up");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("Computer has completely started up.");
	}

	public void execute() {
		System.out.println("Computer is running");
	}

	public void shundown() {
		disk.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("Computer has completely shutdown.");
	}
}
