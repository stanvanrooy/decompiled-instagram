package com.google.p013ar.core.services.downloads.aidl;

/* renamed from: com.google.ar.core.services.downloads.aidl.b */
public final class C0073b extends CallerInfo {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof CallerInfo) {
                CallerInfo callerInfo = (CallerInfo) obj;
                if (!this.A00.equals(callerInfo.A00()) || !this.A01.equals(callerInfo.A01())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        String str = this.A00;
        String str2 = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str2).length());
        sb.append("CallerInfo{packageName=");
        sb.append(str);
        sb.append(", sourceIdentifier=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public C0073b(String str, String str2) {
        if (str != null) {
            this.A00 = str;
            if (str2 != null) {
                this.A01 = str2;
                return;
            }
            throw new NullPointerException("Null sourceIdentifier");
        }
        throw new NullPointerException("Null packageName");
    }
}
