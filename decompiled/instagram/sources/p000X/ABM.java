package p000X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.ABM */
public final class ABM implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NativeAnimatedModule A01;

    public ABM(NativeAnimatedModule nativeAnimatedModule, int i) {
        this.A01 = nativeAnimatedModule;
        this.A00 = i;
    }

    public final void ADZ(AB3 ab3) {
        int i = this.A00;
        ABX abx = (ABX) ab3.A03.get(i);
        if (abx == null || !(abx instanceof ABP)) {
            throw new A0k(AnonymousClass000.A06("Animated node with tag ", i, " does not exist, or is not a 'value' node"));
        }
        ABP abp = (ABP) abx;
        abp.A01 += abp.A00;
        abp.A00 = 0.0d;
    }
}
