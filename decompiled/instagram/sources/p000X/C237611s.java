package p000X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.11s  reason: invalid class name and case insensitive filesystem */
public final class C237611s extends C237311p {
    public static final Uri A00 = Uri.parse("content://com.android.badge/badge");

    public final void A01(int i, Context context) {
        Bundle bundle = new Bundle();
        bundle.putString("app_badge_packageName", context.getPackageName());
        bundle.putInt("app_badge_count", i);
        try {
            context.getContentResolver().call(A00, "setAppBadgeCount", (String) null, bundle);
        } catch (Exception e) {
            AnonymousClass0QD.A05(getClass().getName(), "unexpected exception", e);
        }
    }

    public final boolean A02(Context context, String str) {
        if (Build.VERSION.SDK_INT < 21 || !str.equals("com.oppo.launcher")) {
            return false;
        }
        return true;
    }
}
