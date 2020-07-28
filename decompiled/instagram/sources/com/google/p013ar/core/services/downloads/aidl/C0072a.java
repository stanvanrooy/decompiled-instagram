package com.google.p013ar.core.services.downloads.aidl;

import android.net.Uri;

/* renamed from: com.google.ar.core.services.downloads.aidl.a */
public final class C0072a extends PackInfo {
    public final Uri A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof PackInfo) {
                PackInfo packInfo = (PackInfo) obj;
                if (!this.A01.equals(packInfo.A02()) || !this.A02.equals(packInfo.A01()) || !this.A00.equals(packInfo.A00())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A02.hashCode()) * 1000003) ^ this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A01;
        String str2 = this.A02;
        String valueOf = String.valueOf(this.A00);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + valueOf.length());
        sb.append("PackInfo{name=");
        sb.append(str);
        sb.append(", label=");
        sb.append(str2);
        sb.append(", contentUri=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public C0072a(String str, String str2, Uri uri) {
        if (str != null) {
            this.A01 = str;
            if (str2 != null) {
                this.A02 = str2;
                if (uri != null) {
                    this.A00 = uri;
                    return;
                }
                throw new NullPointerException("Null contentUri");
            }
            throw new NullPointerException("Null label");
        }
        throw new NullPointerException("Null name");
    }
}
