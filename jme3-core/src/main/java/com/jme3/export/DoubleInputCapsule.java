package com.jme3.export;

import java.io.IOException;

public interface DoubleInputCapsule {
    double readDouble(String name, double defVal) throws IOException;

    double[] readDoubleArray(String name, double[] defVal) throws IOException;

    double[][] readDoubleArray2D(String name, double[][] defVal) throws IOException;
}
