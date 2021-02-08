package main.emulator.memory;

public interface Memory {
	public int size();
	public byte read(int addr);
	public void write(int addr, byte val);
}
