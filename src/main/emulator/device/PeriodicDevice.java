package main.emulator.device;

public abstract class PeriodicDevice implements Device {
	private int period;
	private int count;
	
	public PeriodicDevice(int period) {
		this.period = period;
		count = period;
	}
	
	@Override
	public void tick(int time) {
		count -= time;
		
		while (count <= 0) {
			count += period;
			action();
		}
	}
	
	public abstract void action();
}
