package main.emulator.memory;

public abstract class AbstractMemory implements Memory {
	private byte[] data;
	
	public AbstractMemory(int size, byte init) {
		if (size < 0)
			throw new IllegalArgumentException("Negative memory size");
		
		data = new byte[size];
		
		for (int i = 0; i < size; i++) {
			data[i] = init;
		}
	}
	
	@Override
	public int size() {
		return data.length;
	}
	
	@Override
	public byte read(int addr) {
		if (addr < 0 || addr > size())
			throw new IllegalArgumentException("Invalid address");
		
		return data[addr];
	}
	
	@Override
	public void write(int addr, byte val) {
		if (addr < 0 || addr > size())
			throw new IllegalArgumentException("Invalid address");
		
		data[addr] = val;
	}

}
