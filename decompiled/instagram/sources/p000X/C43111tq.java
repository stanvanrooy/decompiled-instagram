package p000X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.1tq  reason: invalid class name and case insensitive filesystem */
public final class C43111tq extends AnonymousClass1ZK implements C35591gc {
    public final C43121tr A00;
    public final C35601gd A01;

    public final void AbC(float f) {
    }

    public final boolean BnP() {
        return true;
    }

    public final View AGR() {
        return this.A01.A02.A02;
    }

    public final View AGS() {
        return this.A00.A0A;
    }

    public final View ATg() {
        return this.itemView;
    }

    public final String ATm() {
        return this.A01.ATm();
    }

    public final GradientSpinner ATs() {
        return this.A00.A08;
    }

    public final void Bk4(C476324u r2) {
        this.A01.A01 = r2;
    }

    public C43111tq(View view, boolean z) {
        super(view);
        this.A01 = new C35601gd(view, z);
        this.A00 = new C43121tr(view.findViewById(C0003R.C0005id.avatar_container));
    }

    public final RectF AGQ() {
        return C06220Of.A0A(AGS());
    }

    public final void AcW() {
        AGS().setVisibility(4);
    }

    public final void Bo5() {
        AGS().setVisibility(0);
    }
}
