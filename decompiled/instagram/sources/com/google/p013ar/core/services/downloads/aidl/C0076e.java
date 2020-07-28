package com.google.p013ar.core.services.downloads.aidl;

import java.util.List;

/* renamed from: com.google.ar.core.services.downloads.aidl.e */
public final class C0076e extends SuperpackInfo {
    public final SuperpackState A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof SuperpackInfo) {
                SuperpackInfo superpackInfo = (SuperpackInfo) obj;
                if (!this.A01.equals(superpackInfo.A01()) || !this.A00.equals(superpackInfo.A00()) || !this.A02.equals(superpackInfo.A02())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A00.hashCode()) * 1000003) ^ this.A02.hashCode();
    }

    public final String toString() {
        String str = this.A01;
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(this.A02);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42 + valueOf.length() + valueOf2.length());
        sb.append("SuperpackInfo{name=");
        sb.append(str);
        sb.append(", state=");
        sb.append(valueOf);
        sb.append(", openedPacks=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public C0076e(String str, SuperpackState superpackState, List list) {
        if (str != null) {
            this.A01 = str;
            if (superpackState != null) {
                this.A00 = superpackState;
                this.A02 = list;
                return;
            }
            throw new NullPointerException("Null state");
        }
        throw new NullPointerException("Null name");
    }
}
