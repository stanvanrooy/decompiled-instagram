package p000X;

import android.os.Handler;

/* renamed from: X.DPS */
public final class DPS implements DKT {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKT A01;
    public final /* synthetic */ C30053DOi A02;
    public final /* synthetic */ DQ6 A03;

    public DPS(C30053DOi dOi, DQ6 dq6, DKT dkt, Handler handler) {
        this.A02 = dOi;
        this.A03 = dq6;
        this.A01 = dkt;
        this.A00 = handler;
    }

    public final void B2m(Throwable th) {
        this.A02.A07.A00("prepare_recording_audio_failed", th, "high");
        DKO.A03(this.A01, this.A00, th);
    }

    public final void onSuccess() {
        DQ6 dq6 = this.A03;
        int i = dq6.A00 - 1;
        dq6.A00 = i;
        if (i == 0) {
            DKO.A02(this.A01, this.A00);
        }
    }
}
