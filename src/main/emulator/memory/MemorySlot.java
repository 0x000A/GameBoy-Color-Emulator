package main.emulator.memory;

public class MemorySlot  {
	private int baseAddress;
	private Memory memory;
	
	public MemorySlot(int baseAddress, Memory memory) {
		this.baseAddress = baseAddress;
		this.memory = memory;
	}

	public int getBaseAddress() {
		return baseAddress;
	}

	public Memory getMemory() {
		return memory;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MemorySlot))
			return false;
		
		MemorySlot o = (MemorySlot) obj;
		return (baseAddress == o.baseAddress) && (memory == o.memory);
	}
}
