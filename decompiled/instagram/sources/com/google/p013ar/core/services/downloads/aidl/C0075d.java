package com.google.p013ar.core.services.downloads.aidl;

import p000X.AnonymousClass40t;

/* renamed from: com.google.ar.core.services.downloads.aidl.d */
public final class C0075d extends PrepareRequest {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof PrepareRequest) {
                PrepareRequest prepareRequest = (PrepareRequest) obj;
                if (!this.A01.equals(prepareRequest.A01()) || this.A00 != prepareRequest.A00()) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A00;
    }

    public final String toString() {
        String str = this.A01;
        int i = this.A00;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("PrepareRequest{superpackName=");
        sb.append(str);
        sb.append(AnonymousClass40t.$const$string(10));
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public C0075d(String str, int i) {
        if (str != null) {
            this.A01 = str;
            this.A00 = i;
            return;
        }
        throw new NullPointerException("Null superpackName");
    }
}
