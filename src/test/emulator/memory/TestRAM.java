package test.emulator.memory;

import static org.junit.Assert.*;

import org.junit.Test;

import main.emulator.memory.Memory;
import main.emulator.memory.RAM;

public class TestRAM {
	
	@Test
	public void normalBehaviour() {
		Memory mem = new RAM(2, (byte) 3);
		assertEquals(2, mem.size());
		assertEquals(3, mem.read(0));
		mem.write(0, (byte) 10);
		assertEquals(10, mem.read(0));
	}
	
	
	@Test (expected = IllegalArgumentException.class)
	public void negativeSize_expectIllegalArgumentException() {
		Memory mem = new RAM(-1, (byte) 3);
		mem.write(-1, (byte) 10);
		mem.read(-10);
	}

}
