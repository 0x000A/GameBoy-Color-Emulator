package test.emulator.memory;

import static org.junit.Assert.*;

import org.junit.Test;

import main.emulator.memory.AddressDecoder;
import main.emulator.memory.Memory;
import main.emulator.memory.MemorySlot;
import main.emulator.memory.RAM;

public class TestAddressDecoder {

	@Test
	public void test() {
		Memory ram = new RAM(10, (byte) 0);
		MemorySlot slot = new MemorySlot(100, ram);
		AddressDecoder addressDecoder = new AddressDecoder(200);
		addressDecoder.add(slot);
		ram.write(5, (byte) 99);
		assertEquals(99, addressDecoder.read(105));
	}

}
