package main.emulator;

import java.util.ArrayList;
import java.util.List;

import main.emulator.cpu.CPU;
import main.emulator.device.Device;

public class EmulatorLoop {
	private CPU cpu;
	private List<Device> devices = new ArrayList<>();
	
	public EmulatorLoop(CPU cpu) {
		this.cpu = cpu;
	}
	
	public void addDevice(Device device) {
		devices.add(device);
	}
	
	public void run(int time) {
		int count = 0;
		cpu.reset();
		
		while(count < time) {
			int cycles = cpu.execute();
			
			for (Device device : devices) {
				device.tick(cycles);
			}
			
			count += cycles;
		}
	}
}
