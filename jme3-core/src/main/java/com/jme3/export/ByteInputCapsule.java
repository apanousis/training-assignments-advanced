package com.jme3.export;

import java.io.IOException;

public interface ByteInputCapsule {
    byte readByte(String name, byte defVal) throws IOException;
    byte[] readByteArray(String name, byte[] defVal) throws IOException;
    byte[][] readByteArray2D(String name, byte[][] defVal) throws IOException;
}
