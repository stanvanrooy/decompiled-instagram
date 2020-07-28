package com.google.p013ar.core.services.downloads.aidl;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p000X.C229619yL;

/* renamed from: com.google.ar.core.services.downloads.aidl.PackInfo */
public abstract class PackInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C229619yL();

    public Uri A00() {
        return ((C0072a) this).A00;
    }

    public String A01() {
        return ((C0072a) this).A02;
    }

    public String A02() {
        return ((C0072a) this).A01;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(A02());
        parcel.writeString(A01());
        parcel.writeString(A00().toString());
    }
}
