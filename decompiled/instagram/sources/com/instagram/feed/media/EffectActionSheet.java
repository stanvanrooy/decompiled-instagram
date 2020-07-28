package com.instagram.feed.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.Collections;
import java.util.List;

public class EffectActionSheet implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(45);
    public List A00 = Collections.emptyList();
    public List A01 = Collections.emptyList();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A00);
        parcel.writeStringList(this.A01);
    }

    public EffectActionSheet() {
    }

    public EffectActionSheet(Parcel parcel) {
        this.A00 = parcel.createStringArrayList();
        this.A01 = parcel.createStringArrayList();
    }
}
