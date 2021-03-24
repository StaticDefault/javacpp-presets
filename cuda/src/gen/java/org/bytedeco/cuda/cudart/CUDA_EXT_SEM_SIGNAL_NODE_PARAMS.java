// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Semaphore signal node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_EXT_SEM_SIGNAL_NODE_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS position(long position) {
        return (CUDA_EXT_SEM_SIGNAL_NODE_PARAMS)super.position(position);
    }
    @Override public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS getPointer(long i) {
        return new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS((Pointer)this).position(position + i);
    }

    public native @ByPtrPtr CUextSemaphore_st extSemArray(); public native CUDA_EXT_SEM_SIGNAL_NODE_PARAMS extSemArray(CUextSemaphore_st setter);
    public native @Const CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS paramsArray(); public native CUDA_EXT_SEM_SIGNAL_NODE_PARAMS paramsArray(CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS setter);
    public native @Cast("unsigned int") int numExtSems(); public native CUDA_EXT_SEM_SIGNAL_NODE_PARAMS numExtSems(int setter);
}
