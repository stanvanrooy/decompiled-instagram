package com.facebook.iabeventlogging.model;

import android.os.Parcel;
import p000X.C25080AzM;

public class IABShareEvent extends IABEvent {
    public final String A00;
    public final String A01;

    public IABShareEvent(String str, long j, long j2, String str2, String str3) {
        super(C25080AzM.IAB_SHARE, str, j, j2);
        this.A01 = str2;
        this.A00 = str3;
    }

    public final String toString() {
        return "IABShareEvent{" + "targetUrl='" + this.A01 + '\'' + ", sharingType='" + this.A00 + '\'' + ", type=" + this.A02 + ", iabSessionId='" + this.A03 + '\'' + ", eventTs=" + this.A01 + ", createdAtTs=" + this.A00 + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
