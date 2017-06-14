package com.jme3.export;

import java.io.IOException;

public interface FloatInputCapsule {
    float readFloat(String name, float defVal) throws IOException;

    float[] readFloatArray(String name, float[] defVal) throws IOException;

    float[][] readFloatArray2D(String name, float[][] defVal) throws IOException;
}
