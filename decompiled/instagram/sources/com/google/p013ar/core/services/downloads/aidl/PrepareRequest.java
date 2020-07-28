package com.google.p013ar.core.services.downloads.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

/* renamed from: com.google.ar.core.services.downloads.aidl.PrepareRequest */
public abstract class PrepareRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(248);

    public int A00() {
        return ((C0075d) this).A00;
    }

    public String A01() {
        return ((C0075d) this).A01;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(A01());
        parcel.writeInt(A00());
    }
}
