package p000X;

/* renamed from: X.DH8 */
public final class DH8 {
    public static C29929DHf parseFromJson(C13080hr r4) {
        C29929DHf dHf = new C29929DHf();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dHf.A00 = str;
            } else if ("normalized_email_address".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dHf.A01 = str;
            }
            r4.A0f();
        }
        return dHf;
    }
}
