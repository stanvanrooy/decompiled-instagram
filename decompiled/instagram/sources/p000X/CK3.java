package p000X;

import android.widget.CompoundButton;

/* renamed from: X.CK3 */
public final class CK3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CK4 A00;

    public CK3(CK4 ck4) {
        this.A00 = ck4;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CK4 ck4 = this.A00;
        ck4.A0B = Boolean.valueOf(!z);
        CK4.A00(ck4);
    }
}
