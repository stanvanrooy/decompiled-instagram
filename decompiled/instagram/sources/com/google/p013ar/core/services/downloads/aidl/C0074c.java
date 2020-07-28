package com.google.p013ar.core.services.downloads.aidl;

/* renamed from: com.google.ar.core.services.downloads.aidl.c */
public final class C0074c extends PrepareResponse {
    public final SuperpackState A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof PrepareResponse) {
                PrepareResponse prepareResponse = (PrepareResponse) obj;
                if (!this.A01.equals(prepareResponse.A01()) || !this.A00.equals(prepareResponse.A00())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A01;
        String valueOf = String.valueOf(this.A00);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + valueOf.length());
        sb.append("PrepareResponse{superpackName=");
        sb.append(str);
        sb.append(", state=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public C0074c(String str, SuperpackState superpackState) {
        if (str != null) {
            this.A01 = str;
            if (superpackState != null) {
                this.A00 = superpackState;
                return;
            }
            throw new NullPointerException("Null state");
        }
        throw new NullPointerException("Null superpackName");
    }
}
