package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeAppStateSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void getCurrentAppState(Callback callback, Callback callback2);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void removeListeners(double d);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeAppStateSpec(A44 a44) {
        super(a44);
    }
}
