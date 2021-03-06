package com.instagram.common.p004ui.widget.touchinterceptorlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000X.AnonymousClass1EK;
import p000X.AnonymousClass1EL;

/* renamed from: com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout */
public class TouchInterceptorFrameLayout extends FrameLayout implements AnonymousClass1EK {
    public final AnonymousClass1EL A00;

    public final ViewGroup A60() {
        return this;
    }

    public final void A00(View.OnTouchListener onTouchListener, View.OnTouchListener onTouchListener2) {
        AnonymousClass1EL r0 = this.A00;
        r0.A00 = onTouchListener;
        r0.A03.setOnTouchListener(onTouchListener2);
    }

    public final void Adn(View.OnTouchListener onTouchListener) {
        AnonymousClass1EL r0 = this.A00;
        r0.A00 = onTouchListener;
        r0.A03.setOnTouchListener(onTouchListener);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A00.A01(motionEvent);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (!this.A00.A02(z)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setKeepObservingAfterRequestDisallowTouchEvent(boolean z) {
        this.A00.A02 = z;
    }

    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public TouchInterceptorFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new AnonymousClass1EL(this, context, attributeSet);
    }

    public void setAndSaveInterceptTouchEvent(View.OnTouchListener onTouchListener) {
        this.A00.A00(onTouchListener, onTouchListener);
    }

    public void setAndSaveInterceptTouchEvent(View.OnTouchListener onTouchListener, View.OnTouchListener onTouchListener2) {
        this.A00.A00(onTouchListener, onTouchListener2);
    }
}
