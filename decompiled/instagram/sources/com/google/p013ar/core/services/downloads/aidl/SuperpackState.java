package com.google.p013ar.core.services.downloads.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

/* renamed from: com.google.ar.core.services.downloads.aidl.SuperpackState */
public enum SuperpackState implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorEBaseShape1S0000000_I1(251);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
