/*
 * Copyright (c) 2009-2012 jMonkeyEngine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jme3.export;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Map;

import com.jme3.util.IntMap;

/**
 * @author Joshua Slack
 */
public interface InputCapsule extends IntegerInputCapsule, ByteInputCapsule, FloatInputCapsule, DoubleInputCapsule {

    int getSavableVersion(Class<? extends Savable> clazz);

    short readShort(String name, short defVal) throws IOException;

    short[] readShortArray(String name, short[] defVal) throws IOException;

    short[][] readShortArray2D(String name, short[][] defVal) throws IOException;


    // boolean primitive

    boolean readBoolean(String name, boolean defVal) throws IOException;

    boolean[] readBooleanArray(String name, boolean[] defVal) throws IOException;

    boolean[][] readBooleanArray2D(String name, boolean[][] defVal) throws IOException;


    // String

    String readString(String name, String defVal) throws IOException;

    String[] readStringArray(String name, String[] defVal) throws IOException;

    String[][] readStringArray2D(String name, String[][] defVal) throws IOException;


    // BitSet

    public BitSet readBitSet(String name, BitSet defVal) throws IOException;


    // BinarySavable

    Savable readSavable(String name, Savable defVal) throws IOException;

    Savable[] readSavableArray(String name, Savable[] defVal) throws IOException;

    Savable[][] readSavableArray2D(String name, Savable[][] defVal) throws IOException;


    // ArrayLists

    ArrayList readSavableArrayList(String name, ArrayList defVal) throws IOException;

    ArrayList[] readSavableArrayListArray(String name, ArrayList[] defVal) throws IOException;

    ArrayList[][] readSavableArrayListArray2D(String name, ArrayList[][] defVal) throws IOException;

    ArrayList<FloatBuffer> readFloatBufferArrayList(String name, ArrayList<FloatBuffer> defVal) throws IOException;

    ArrayList<ByteBuffer> readByteBufferArrayList(String name, ArrayList<ByteBuffer> defVal) throws IOException;


    // Maps

    Map<? extends Savable, ? extends Savable> readSavableMap(String name, Map<? extends Savable, ? extends Savable> defVal) throws IOException;

    Map<String, ? extends Savable> readStringSavableMap(String name, Map<String, ? extends Savable> defVal) throws IOException;

    IntMap<? extends Savable> readIntSavableMap(String name, IntMap<? extends Savable> defVal) throws IOException;

    // NIO BUFFERS
    // float buffer

    public FloatBuffer readFloatBuffer(String name, FloatBuffer defVal) throws IOException;


    // int buffer

    public IntBuffer readIntBuffer(String name, IntBuffer defVal) throws IOException;


    // byte buffer

    public ByteBuffer readByteBuffer(String name, ByteBuffer defVal) throws IOException;


    // short buffer

    public ShortBuffer readShortBuffer(String name, ShortBuffer defVal) throws IOException;


    // enums

    public <T extends Enum<T>> T readEnum(String name, Class<T> enumType, T defVal) throws IOException;

}