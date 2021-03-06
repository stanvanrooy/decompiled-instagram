package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeIGShoppingCatalogSettingsModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void launchCatalogSelectionPage(double d, String str, String str2, String str3);

    @ReactMethod
    public abstract void selectCatalog(String str, String str2, Callback callback, Callback callback2);

    public NativeIGShoppingCatalogSettingsModuleSpec(A44 a44) {
        super(a44);
    }
}
