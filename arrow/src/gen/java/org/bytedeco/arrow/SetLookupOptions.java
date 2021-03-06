// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Options for IsIn and IndexIn functions */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SetLookupOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SetLookupOptions(Pointer p) { super(p); }

  public SetLookupOptions(@ByVal Datum value_set, @Cast("bool") boolean skip_nulls/*=false*/) { super((Pointer)null); allocate(value_set, skip_nulls); }
  private native void allocate(@ByVal Datum value_set, @Cast("bool") boolean skip_nulls/*=false*/);
  public SetLookupOptions(@ByVal Datum value_set) { super((Pointer)null); allocate(value_set); }
  private native void allocate(@ByVal Datum value_set);

  /** The set of values to look up input values into. */
  
  ///
  public native @ByRef Datum value_set(); public native SetLookupOptions value_set(Datum setter);
  /** Whether nulls in {@code value_set} count for lookup.
   * 
   *  If true, any null in {@code value_set} is ignored and nulls in the input
   *  produce null (IndexIn) or false (IsIn) values in the output.
   *  If false, any null in {@code value_set} is successfully matched in
   *  the input. */
  public native @Cast("bool") boolean skip_nulls(); public native SetLookupOptions skip_nulls(boolean setter);
}
