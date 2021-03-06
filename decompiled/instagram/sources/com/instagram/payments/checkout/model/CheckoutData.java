package com.instagram.payments.checkout.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import p000X.C223679kA;

public class CheckoutData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(439);
    public CheckoutLaunchParams A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public CheckoutData(C223679kA r2) {
        this.A00 = r2.A00;
    }

    public CheckoutData(Parcel parcel) {
        this.A00 = (CheckoutLaunchParams) parcel.readParcelable(CheckoutLaunchParams.class.getClassLoader());
    }
}
