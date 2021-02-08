package main.emulator.cpu;

public interface Opcode<T> {
    public int execute(T state);
}
