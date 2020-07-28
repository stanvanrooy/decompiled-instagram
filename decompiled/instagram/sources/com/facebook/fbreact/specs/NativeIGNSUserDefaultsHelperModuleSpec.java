package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeIGNSUserDefaultsHelperModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void getBoolValueForKey(String str, Callback callback);

    @ReactMethod
    public abstract void setBoolValue(boolean z, String str);

    public NativeIGNSUserDefaultsHelperModuleSpec(A44 a44) {
        super(a44);
    }
}
