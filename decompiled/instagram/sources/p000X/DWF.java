package p000X;

/* renamed from: X.DWF */
public final class DWF {
    public static DWT parseFromJson(C13080hr r3) {
        DWT dwt = new DWT();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("total_count_graph".equals(A0i)) {
                dwt.A00 = DWC.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dwt;
    }
}
