package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;

/* renamed from: X.CFJ */
public final class CFJ implements View.OnClickListener {
    public final /* synthetic */ C27475CEr A00;

    public CFJ(C27475CEr cEr) {
        this.A00 = cEr;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-677131758);
        C27475CEr cEr = this.A00;
        AnonymousClass0C1 r3 = cEr.A04;
        FragmentActivity activity = cEr.getActivity();
        AnonymousClass0a4.A06(activity);
        C115564xm.A00(r3, activity, cEr.getString(C0003R.string.promote_error_appeal_form_title), "https://help.instagram.com/contact/502692143473097");
        AnonymousClass0Z0.A0C(-300378049, A05);
    }
}
