// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA launch parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaLaunchParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaLaunchParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaLaunchParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaLaunchParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaLaunchParams position(long position) {
        return (cudaLaunchParams)super.position(position);
    }
    @Override public cudaLaunchParams getPointer(long i) {
        return new cudaLaunchParams((Pointer)this).position(position + i);
    }

    /** Device function symbol */
    public native Pointer func(); public native cudaLaunchParams func(Pointer setter);
    /** Grid dimentions */
    public native @ByRef dim3 gridDim(); public native cudaLaunchParams gridDim(dim3 setter);
    /** Block dimentions */
    public native @ByRef dim3 blockDim(); public native cudaLaunchParams blockDim(dim3 setter);
    /** Arguments */
    public native Pointer args(int i); public native cudaLaunchParams args(int i, Pointer setter);
    public native @Cast("void**") PointerPointer args(); public native cudaLaunchParams args(PointerPointer setter);
    /** Shared memory */
    public native @Cast("size_t") long sharedMem(); public native cudaLaunchParams sharedMem(long setter);
    /** Stream identifier */
    public native CUstream_st stream(); public native cudaLaunchParams stream(CUstream_st setter);
}
