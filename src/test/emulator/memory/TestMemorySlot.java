package test.emulator.memory;

import static org.junit.Assert.*;

import org.junit.Test;

import main.emulator.memory.Memory;
import main.emulator.memory.MemorySlot;
import main.emulator.memory.RAM;

public class TestMemorySlot {

	@Test
	public void test() {
		Memory ram = new RAM(10, (byte) 0);
		MemorySlot slot = new MemorySlot(100, ram);
		assertEquals(100, slot.getBaseAddress());
		assertEquals(ram, slot.getMemory());
	}

}
