package p000X;

/* renamed from: X.C3x */
public final class C3x {
    public static C27232C3y parseFromJson(C13080hr r3) {
        String A0t;
        C27232C3y c3y = new C27232C3y();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("label".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                c3y.A01 = A0t;
            } else if ("credential_type".equals(A0i)) {
                c3y.A00 = C26669BpT.A00(r3.A0r());
            }
            r3.A0f();
        }
        return c3y;
    }
}
