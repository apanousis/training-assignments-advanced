package com.jme3.export;

import java.io.IOException;

public interface IntegerInputCapsule {
    int readInt(String name, int defVal) throws IOException;

    int[] readIntArray(String name, int[] defVal) throws IOException;

    int[][] readIntArray2D(String name, int[][] defVal) throws IOException;
}
