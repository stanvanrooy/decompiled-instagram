package com.google.p013ar.core.services.downloads.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

/* renamed from: com.google.ar.core.services.downloads.aidl.PrepareResponse */
public abstract class PrepareResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(249);

    public SuperpackState A00() {
        return ((C0074c) this).A00;
    }

    public String A01() {
        return ((C0074c) this).A01;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(A01());
        parcel.writeParcelable(A00(), i);
    }
}
