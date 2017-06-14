package com.jme3.util;

import java.nio.FloatBuffer;

import com.jme3.math.Vector4f;

public class Vector4fBufferUtils {
    /**
     * Generate a new FloatBuffer using the given array of Vector4 objects. The
     * FloatBuffer will be 4 * data.length long and contain the vector data.
     *
     * @param data
     *            array of Vector4 objects to place into a new FloatBuffer
     */
    public static FloatBuffer createFloatBuffer(Vector4f... data) {
        if (data == null) {
            return null;
        }
        FloatBuffer buff = BufferUtils.createFloatBuffer(4 * data.length);
        for (int x = 0; x < data.length; x++) {
            if (data[x] != null) {
                buff.put(data[x].getX()).put(data[x].getY()).put(data[x].getZ()).put(data[x].getW());
            } else {
                buff.put(0).put(0).put(0).put(0);
            }
        }
        buff.flip();
        return buff;
    }

    /**
     * Sets the data contained in the given vector4 into the FloatBuffer at the
     * specified index.
     *
     * @param vec
     *            the {@link Vector4f} to insert
     * @param buf
     *            the buffer to insert into
     * @param index
     *            the position to place the data; in terms of vector4 not floats
     */
    public static void setInBuffer(Vector4f vec, FloatBuffer buf, int index) {
        buf.position(index * 4);
        buf.put(vec.getX());
        buf.put(vec.getY());
        buf.put(vec.getZ());
        buf.put(vec.getW());
    }

    /**
     * Updates the values of the given vector from the specified buffer at the
     * index provided.
     *
     * @param vector
     *            the vector to set data on
     * @param buf
     *            the buffer to read from
     * @param index
     *            the position (in terms of vectors, not floats) to read from
     *            the buf
     */
    public static void populateFromBuffer(Vector4f vector, FloatBuffer buf, int index) {
        vector.x = buf.get(index * 4);
        vector.y = buf.get(index * 4 + 1);
        vector.z = buf.get(index * 4 + 2);
        vector.w = buf.get(index * 4 + 3);
    }
}
