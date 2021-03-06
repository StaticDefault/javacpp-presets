// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUmemPoolPtrExportData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUmemPoolPtrExportData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUmemPoolPtrExportData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmemPoolPtrExportData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUmemPoolPtrExportData position(long position) {
        return (CUmemPoolPtrExportData)super.position(position);
    }
    @Override public CUmemPoolPtrExportData getPointer(long i) {
        return new CUmemPoolPtrExportData((Pointer)this).position(position + i);
    }

    public native @Cast("unsigned char") byte reserved(int i); public native CUmemPoolPtrExportData reserved(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer reserved();
}
