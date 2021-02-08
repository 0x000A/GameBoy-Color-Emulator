package main.emulator.memory;

public class AddressMask implements Memory {
	private Memory memory;
	private int size;
	private int mask;
	
	public AddressMask(Memory memory, int size, int mask) {
		this.memory = memory;
		this.size = size;
		this.mask = mask;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public byte read(int addr) {
		return memory.read(addr & mask);
	}

	@Override
	public void write(int addr, byte val) {
		memory.write(addr & mask, val);
	}
}
