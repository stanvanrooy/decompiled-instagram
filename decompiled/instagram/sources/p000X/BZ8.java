package p000X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.BZ8 */
public final /* synthetic */ class BZ8 implements Runnable {
    public final CameraCaptureSession.StateCallback A00;
    public final CameraCaptureSession A01;

    public BZ8(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.A00 = stateCallback;
        this.A01 = cameraCaptureSession;
    }

    public final void run() {
        this.A00.onConfigured(this.A01);
    }
}
