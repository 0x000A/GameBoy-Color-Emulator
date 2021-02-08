package test.emulator.memory;

import static org.junit.Assert.*;

import org.junit.Test;

import main.emulator.memory.AddressMask;
import main.emulator.memory.Memory;
import main.emulator.memory.ROM;

public class TestAddressMask {

	@Test
	public void test() {
		Memory r = new ROM(new byte [] { 1,2,3,4 });
		Memory a = new AddressMask(r,  100,  3);
		assertEquals(1, a.read(4));
		assertEquals(2, a.read(5));
		assertEquals(3, a.read(6));
		assertEquals(4, a.read(7));
	}

}
