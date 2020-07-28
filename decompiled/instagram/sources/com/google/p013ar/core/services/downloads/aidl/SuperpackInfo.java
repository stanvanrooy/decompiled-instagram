package com.google.p013ar.core.services.downloads.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;

/* renamed from: com.google.ar.core.services.downloads.aidl.SuperpackInfo */
public abstract class SuperpackInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(250);

    public SuperpackState A00() {
        return ((C0076e) this).A00;
    }

    public String A01() {
        return ((C0076e) this).A01;
    }

    public List A02() {
        return ((C0076e) this).A02;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(A01());
        parcel.writeParcelable(A00(), i);
        parcel.writeParcelableArray((PackInfo[]) A02().toArray(new PackInfo[0]), i);
    }
}
