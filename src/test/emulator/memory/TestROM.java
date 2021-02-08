package test.emulator.memory;

import static org.junit.Assert.*;

import org.junit.Test;

import main.emulator.memory.Memory;
import main.emulator.memory.ROM;

public class TestROM {

	@Test
	public void normalBehaviour() {
		byte data[] = { 1, 2, 3 };
		Memory mem = new ROM(data);
		assertEquals(3, mem.size());
		assertEquals(1, mem.read(0));

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void negativeAddress_expectIllegalArgumentException() {
		byte data[] = { 1, 2, 3 };
		Memory mem = new ROM(data);
		mem.read(-2);
	}
	
	@Test (expected = UnsupportedOperationException.class)
	public void write_expectUnsupportedOperationException() {
		byte data[] = { 1, 2, 3 };
		Memory mem = new ROM(data);
		mem.write(1, (byte) 5);
	}

}
