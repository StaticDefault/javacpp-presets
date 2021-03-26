// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;



/**
 * \struct _NVENC_EXTERNAL_ME_HINT
 * External Motion Vector hint structure.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NVENC_EXTERNAL_ME_HINT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NVENC_EXTERNAL_ME_HINT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NVENC_EXTERNAL_ME_HINT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NVENC_EXTERNAL_ME_HINT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NVENC_EXTERNAL_ME_HINT position(long position) {
        return (NVENC_EXTERNAL_ME_HINT)super.position(position);
    }
    @Override public NVENC_EXTERNAL_ME_HINT getPointer(long i) {
        return new NVENC_EXTERNAL_ME_HINT((Pointer)this).position(position + i);
    }

    /** [in]: Specifies the x component of integer pixel MV (relative to current MB) S12.0. */
    public native @Cast("int32_t") @NoOffset int mvx(); public native NVENC_EXTERNAL_ME_HINT mvx(int setter);
    /** [in]: Specifies the y component of integer pixel MV (relative to current MB) S10.0 .*/
    public native @Cast("int32_t") @NoOffset int mvy(); public native NVENC_EXTERNAL_ME_HINT mvy(int setter);
    /** [in]: Specifies the reference index (31=invalid). Current we support only 1 reference frame per direction for external hints, so \p refidx must be 0. */
    public native @Cast("int32_t") @NoOffset int refidx(); public native NVENC_EXTERNAL_ME_HINT refidx(int setter);
    /** [in]: Specifies the direction of motion estimation . 0=L0 1=L1.*/
    public native @Cast("int32_t") @NoOffset int dir(); public native NVENC_EXTERNAL_ME_HINT dir(int setter);
    /** [in]: Specifies the block partition type.0=16x16 1=16x8 2=8x16 3=8x8 (blocks in partition must be consecutive).*/
    public native @Cast("int32_t") @NoOffset int partType(); public native NVENC_EXTERNAL_ME_HINT partType(int setter);
    /** [in]: Set to 1 for the last MV of (sub) partition  */
    public native @Cast("int32_t") @NoOffset int lastofPart(); public native NVENC_EXTERNAL_ME_HINT lastofPart(int setter);
    /** [in]: Set to 1 for the last MV of macroblock. */
    public native @Cast("int32_t") @NoOffset int lastOfMB(); public native NVENC_EXTERNAL_ME_HINT lastOfMB(int setter);
}
