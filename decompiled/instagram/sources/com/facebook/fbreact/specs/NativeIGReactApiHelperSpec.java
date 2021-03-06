package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;

public abstract class NativeIGReactApiHelperSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void getApiUrlWithPath(String str, C2102594w r2);

    @ReactMethod
    public abstract void getHttpHeaders(C2102594w r1);

    public NativeIGReactApiHelperSpec(A44 a44) {
        super(a44);
    }
}
