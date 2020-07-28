package com.instagram.p009ui.widget.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p000X.C25913Bc3;

/* renamed from: com.instagram.ui.widget.base.AspectRatioLinearLayout */
public class AspectRatioLinearLayout extends LinearLayout {
    public float A00 = 1.0f;

    public void setAspectRatio(float f) {
        this.A00 = f;
        requestLayout();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.A00;
        if (f > 1.0f) {
            measuredHeight = (int) (((float) measuredWidth) / f);
        } else {
            measuredWidth = (int) (((float) measuredHeight) * f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, C25913Bc3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(measuredHeight, C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
    }

    public AspectRatioLinearLayout(Context context) {
        super(context);
    }

    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
