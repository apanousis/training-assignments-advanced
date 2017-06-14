package com.jme3.export;

import java.io.IOException;

public interface LongInputCapsule {
    long readLong(String name, long defVal) throws IOException;

    long[] readLongArray(String name, long[] defVal) throws IOException;

    long[][] readLongArray2D(String name, long[][] defVal) throws IOException;
}
