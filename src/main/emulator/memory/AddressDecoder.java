package main.emulator.memory;

import java.util.ArrayList;
import java.util.List;

public class AddressDecoder implements Memory {
	private List<MemorySlot> banks = new ArrayList<>();
	private int size;
	
	public AddressDecoder(int size) {
		this.size = size;
	}
	
	public void add(MemorySlot memory) {
		banks.add(memory);
	}
	
	public void remove(MemorySlot memory) {
		banks.remove(memory);
	}
	
	private MemorySlot getBlock(int addr) {
		for (MemorySlot bank : banks) {
			if (addr >= bank.getBaseAddress() && addr < bank.getBaseAddress() + bank.getMemory().size())
				return bank;
		}
		
		throw new IllegalArgumentException("Invalid bus address");
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public byte read(int addr) {
		MemorySlot bank = getBlock(addr);
		return bank.getMemory().read(addr - bank.getBaseAddress());
	}

	@Override
	public void write(int addr, byte val) {
		MemorySlot bank = getBlock(addr);
		bank.getMemory().write(addr - bank.getBaseAddress(), val);
	}
	
	
}
