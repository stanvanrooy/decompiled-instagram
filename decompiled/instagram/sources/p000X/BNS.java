package p000X;

import android.content.pm.ActivityInfo;

/* renamed from: X.BNS */
public final class BNS implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNS(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        ActivityInfo[] activityInfoArr = bng.A04;
        if (activityInfoArr == null) {
            return bng.A05(Constants.A0C);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = activityInfoArr.length;
            if (i >= length) {
                return bng.A06(BQC.A03(sb.toString().getBytes("UTF-8"), Constants.ZERO));
            }
            sb.append(activityInfoArr[i].name);
            if (i != length - 1) {
                sb.append("\n");
            }
            i++;
        }
    }
}
