package p000X;

import android.content.Intent;

/* renamed from: X.BOX */
public final class BOX implements C25584BQq {
    public final /* synthetic */ BO6 A00;

    public BOX(BO6 bo6) {
        this.A00 = bo6;
    }

    public final C25521BOf ADg() {
        BO6 bo6 = this.A00;
        Intent intent = bo6.A00;
        if (intent != null) {
            return bo6.A09(intent.getBooleanExtra("battery_low", false));
        }
        return bo6.A05(Constants.A0C);
    }
}
