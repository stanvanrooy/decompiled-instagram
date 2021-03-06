package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeIGGeoGatingReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void setupNativeModule();

    @ReactMethod
    public abstract void updateGeoGatingSettings(boolean z, A1e a1e, String str);

    public NativeIGGeoGatingReactModuleSpec(A44 a44) {
        super(a44);
    }
}
