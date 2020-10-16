// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


    /** \addtogroup ximgproc_fourier
     *  \{
    <p>
    /** \brief Class for ContourFitting algorithms.
    ContourFitting match two contours {@code  z_a } and {@code  z_b } minimizing distance
    <pre>{@code \[ d(z_a,z_b)=\sum (a_n - s  b_n e^{j(n \alpha +\phi )})^2 \]}</pre> where {@code  a_n } and {@code  b_n } are Fourier descriptors of {@code  z_a } and {@code  z_b } and s is a scaling factor and  {@code  \phi } is angle rotation and {@code  \alpha } is starting point factor adjustement
    */
    @Namespace("cv::ximgproc") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class ContourFitting extends Algorithm {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ContourFitting(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public ContourFitting(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public ContourFitting position(long position) {
            return (ContourFitting)super.position(position);
        }
        @Override public ContourFitting getPointer(long i) {
            return new ContourFitting(this).position(position + i);
        }
    
        /** \brief Fit two closed curves using fourier descriptors. More details in \cite PersoonFu1977 and \cite BergerRaghunathan1998
        <p>
        * @param ctr number of Fourier descriptors equal to number of contour points after resampling.
        * @param fd Contour defining second shape (Target).
        */
        public ContourFitting(int ctr/*=1024*/,int fd/*=16*/) { super((Pointer)null); allocate(ctr, fd); }
        private native void allocate(int ctr/*=1024*/,int fd/*=16*/);
        public ContourFitting() { super((Pointer)null); allocate(); }
        private native void allocate();
        /** \brief Fit two closed curves using fourier descriptors. More details in \cite PersoonFu1977 and \cite BergerRaghunathan1998
        <p>
        @param src Contour defining first shape.
        @param dst Contour defining second shape (Target).
        @param alphaPhiST : {@code  \alpha }=alphaPhiST(0,0), {@code  \phi }=alphaPhiST(0,1) (in radian), s=alphaPhiST(0,2), Tx=alphaPhiST(0,3), Ty=alphaPhiST(0,4) rotation center
        @param dist distance between src and dst after matching.
        @param fdContour false then src and dst are contours and true src and dst are fourier descriptors.
        */
        public native void estimateTransformation(@ByVal Mat src, @ByVal Mat dst, @ByVal Mat alphaPhiST, DoublePointer dist/*=0*/, @Cast("bool") boolean fdContour/*=false*/);
        public native void estimateTransformation(@ByVal Mat src, @ByVal Mat dst, @ByVal Mat alphaPhiST);
        public native void estimateTransformation(@ByVal Mat src, @ByVal Mat dst, @ByVal Mat alphaPhiST, DoubleBuffer dist/*=0*/, @Cast("bool") boolean fdContour/*=false*/);
        public native void estimateTransformation(@ByVal Mat src, @ByVal Mat dst, @ByVal Mat alphaPhiST, double[] dist/*=0*/, @Cast("bool") boolean fdContour/*=false*/);
        public native void estimateTransformation(@ByVal UMat src, @ByVal UMat dst, @ByVal UMat alphaPhiST, DoublePointer dist/*=0*/, @Cast("bool") boolean fdContour/*=false*/);
        public native void estimateTransformation(@ByVal UMat src, @ByVal UMat dst, @ByVal UMat alphaPhiST);
        public native void estimateTransformation(@ByVal UMat src, @ByVal UMat dst, @ByVal UMat alphaPhiST, DoubleBuffer dist/*=0*/, @Cast("bool") boolean fdContour/*=false*/);
        public native void estimateTransformation(@ByVal UMat src, @ByVal UMat dst, @ByVal UMat alphaPhiST, double[] dist/*=0*/, @Cast("bool") boolean fdContour/*=false*/);
        public native void estimateTransformation(@ByVal GpuMat src, @ByVal GpuMat dst, @ByVal GpuMat alphaPhiST, DoublePointer dist/*=0*/, @Cast("bool") boolean fdContour/*=false*/);
        public native void estimateTransformation(@ByVal GpuMat src, @ByVal GpuMat dst, @ByVal GpuMat alphaPhiST);
        public native void estimateTransformation(@ByVal GpuMat src, @ByVal GpuMat dst, @ByVal GpuMat alphaPhiST, DoubleBuffer dist/*=0*/, @Cast("bool") boolean fdContour/*=false*/);
        public native void estimateTransformation(@ByVal GpuMat src, @ByVal GpuMat dst, @ByVal GpuMat alphaPhiST, double[] dist/*=0*/, @Cast("bool") boolean fdContour/*=false*/);
        /** \brief Fit two closed curves using fourier descriptors. More details in \cite PersoonFu1977 and \cite BergerRaghunathan1998
        <p>
        @param src Contour defining first shape.
        @param dst Contour defining second shape (Target).
        @param alphaPhiST : {@code  \alpha }=alphaPhiST(0,0), {@code  \phi }=alphaPhiST(0,1) (in radian), s=alphaPhiST(0,2), Tx=alphaPhiST(0,3), Ty=alphaPhiST(0,4) rotation center
        @param dist distance between src and dst after matching.
        @param fdContour false then src and dst are contours and true src and dst are fourier descriptors.
        */
        public native void estimateTransformation(@ByVal Mat src, @ByVal Mat dst, @ByVal Mat alphaPhiST, @ByRef DoublePointer dist);
        public native void estimateTransformation(@ByVal Mat src, @ByVal Mat dst, @ByVal Mat alphaPhiST, @ByRef DoubleBuffer dist);
        public native void estimateTransformation(@ByVal Mat src, @ByVal Mat dst, @ByVal Mat alphaPhiST, @ByRef double[] dist);
        public native void estimateTransformation(@ByVal UMat src, @ByVal UMat dst, @ByVal UMat alphaPhiST, @ByRef DoublePointer dist);
        public native void estimateTransformation(@ByVal UMat src, @ByVal UMat dst, @ByVal UMat alphaPhiST, @ByRef DoubleBuffer dist);
        public native void estimateTransformation(@ByVal UMat src, @ByVal UMat dst, @ByVal UMat alphaPhiST, @ByRef double[] dist);
        public native void estimateTransformation(@ByVal GpuMat src, @ByVal GpuMat dst, @ByVal GpuMat alphaPhiST, @ByRef DoublePointer dist);
        public native void estimateTransformation(@ByVal GpuMat src, @ByVal GpuMat dst, @ByVal GpuMat alphaPhiST, @ByRef DoubleBuffer dist);
        public native void estimateTransformation(@ByVal GpuMat src, @ByVal GpuMat dst, @ByVal GpuMat alphaPhiST, @ByRef double[] dist);
        /** \brief set number of Fourier descriptors used in estimateTransformation
        <p>
        @param n number of Fourier descriptors equal to number of contour points after resampling.
        */
        public native void setCtrSize(int n);
        /** \brief set number of Fourier descriptors when estimateTransformation used vector<Point>
        <p>
        @param n number of fourier descriptors used for optimal curve matching.
        */
        public native void setFDSize(int n);
        /**
        @return number of fourier descriptors
        */
        public native int getCtrSize();
        /**
        @return number of fourier descriptors used for optimal curve matching
        */
        public native int getFDSize();
    }