package main.emulator.memory;

public class ROM extends AbstractMemory {

	public ROM(byte[] data) {
		super(data.length, (byte) 0);
		
		for (int i = 0; i < data.length; i++) {
			super.write(i, data[i]);
		}
	}

	@Override
	public void write(int addr, byte val) {
		throw new UnsupportedOperationException("Read only memory");
	}
	
}
