package com.instagram.react.impl;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.fbreact.i18n.FbReactI18nAssetsModule;
import com.facebook.fbreact.i18n.FbReactI18nModule;
import com.facebook.flipper.core.StateSummary;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.instagram.react.modules.base.IgNativeColorsModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.base.IgReactAnalyticsModule;
import com.instagram.react.modules.base.IgReactDialogModule;
import com.instagram.react.modules.base.IgReactFBUserAgentModule;
import com.instagram.react.modules.base.IgReactFunnelLoggerModule;
import com.instagram.react.modules.base.IgReactPerformanceLoggerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.base.IgSharedPreferencesModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactBrandedContentModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.react.modules.product.IgReactCompassionResourceModule;
import com.instagram.react.modules.product.IgReactInsightsStoryPresenterModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule;
import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import com.instagram.react.views.image.IgReactImageLoaderModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A42;
import p000X.AnonymousClass40t;
import p000X.C23073A4r;

public class IgReactPackage$$ReactModuleInfoProvider implements C23073A4r {
    public final Map ATa() {
        HashMap hashMap = new HashMap();
        hashMap.put(AppearanceModule.NAME, new A42(AppearanceModule.NAME, "com.facebook.react.modules.appearance.AppearanceModule", false, false, false, false));
        hashMap.put(AppStateModule.NAME, new A42(AppStateModule.NAME, "com.facebook.react.modules.appstate.AppStateModule", false, false, true, false));
        hashMap.put(AsyncStorageModule.NAME, new A42(AsyncStorageModule.NAME, "com.facebook.react.modules.storage.AsyncStorageModule", false, false, false, false));
        hashMap.put(CameraRollManager.NAME, new A42(CameraRollManager.NAME, "com.facebook.react.modules.camera.CameraRollManager", false, false, false, false));
        hashMap.put(DialogModule.NAME, new A42(DialogModule.NAME, "com.facebook.react.modules.dialog.DialogModule", false, false, true, false));
        String $const$string = AnonymousClass40t.$const$string(71);
        hashMap.put($const$string, new A42($const$string, "com.facebook.react.modules.datepicker.DatePickerDialogModule", false, false, false, false));
        hashMap.put(FbReactI18nAssetsModule.NAME, new A42(FbReactI18nAssetsModule.NAME, "com.facebook.fbreact.i18n.FbReactI18nAssetsModule", false, false, false, true));
        hashMap.put(FbReactI18nModule.NAME, new A42(FbReactI18nModule.NAME, "com.facebook.fbreact.i18n.FbReactI18nModule", false, false, true, false));
        hashMap.put(I18nManagerModule.NAME, new A42(I18nManagerModule.NAME, "com.facebook.react.modules.i18nmanager.I18nManagerModule", false, false, true, false));
        hashMap.put(IgNativeColorsModule.MODULE_NAME, new A42(IgNativeColorsModule.MODULE_NAME, "com.instagram.react.modules.base.IgNativeColorsModule", false, false, true, false));
        hashMap.put(IgNetworkingModule.MODULE_NAME, new A42(IgNetworkingModule.MODULE_NAME, "com.instagram.react.modules.base.IgNetworkingModule", false, false, false, false));
        hashMap.put(IgReactAnalyticsModule.MODULE_NAME, new A42(IgReactAnalyticsModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactAnalyticsModule", false, false, false, false));
        String $const$string2 = AnonymousClass40t.$const$string(89);
        hashMap.put($const$string2, new A42($const$string2, "com.instagram.react.modules.product.IgReactMediaPickerNativeModule", false, false, false, false));
        String $const$string3 = StateSummary.$const$string(27);
        hashMap.put($const$string3, new A42($const$string3, "com.instagram.react.modules.product.IgReactBoostPostModule", false, false, false, false));
        hashMap.put(IgReactBrandedContentModule.MODULE_NAME, new A42(IgReactBrandedContentModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactBrandedContentModule", false, false, false, false));
        String $const$string4 = AnonymousClass40t.$const$string(86);
        hashMap.put($const$string4, new A42($const$string4, "com.instagram.react.modules.product.IgReactCheckpointModule", false, false, false, false));
        String $const$string5 = AnonymousClass40t.$const$string(91);
        hashMap.put($const$string5, new A42($const$string5, "com.instagram.react.modules.product.IgReactCountryCodeRoute", false, false, false, false));
        hashMap.put(IgReactCommentModerationModule.MODULE_NAME, new A42(IgReactCommentModerationModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactCommentModerationModule", false, false, false, false));
        hashMap.put(IgReactCompassionResourceModule.MODULE_NAME, new A42(IgReactCompassionResourceModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactCompassionResourceModule", false, false, false, false));
        hashMap.put(IgReactDialogModule.MODULE_NAME, new A42(IgReactDialogModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactDialogModule", false, false, true, false));
        hashMap.put("ExceptionsManager", new A42("ExceptionsManager", "com.instagram.react.modules.exceptionmanager.IgReactExceptionManager", true, true, false, false));
        hashMap.put(IgReactFBUserAgentModule.NAME, new A42(IgReactFBUserAgentModule.NAME, "com.instagram.react.modules.base.IgReactFBUserAgentModule", false, false, true, false));
        hashMap.put(IgReactFunnelLoggerModule.MODULE_NAME, new A42(IgReactFunnelLoggerModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactFunnelLoggerModule", false, false, false, false));
        String $const$string6 = AnonymousClass40t.$const$string(87);
        hashMap.put($const$string6, new A42($const$string6, "com.instagram.react.modules.product.IgReactGeoGatingModule", false, false, false, false));
        hashMap.put(IgReactImageLoaderModule.MODULE_NAME, new A42(IgReactImageLoaderModule.MODULE_NAME, "com.instagram.react.views.image.IgReactImageLoaderModule", false, false, false, false));
        String $const$string7 = AnonymousClass40t.$const$string(88);
        hashMap.put($const$string7, new A42($const$string7, "com.instagram.react.modules.product.IgReactInsightsModule", false, false, false, false));
        hashMap.put(IgReactInsightsStoryPresenterModule.MODULE_NAME, new A42(IgReactInsightsStoryPresenterModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactInsightsStoryPresenterModule", false, false, false, false));
        hashMap.put(IgReactNavigatorModule.MODULE_NAME, new A42(IgReactNavigatorModule.MODULE_NAME, "com.instagram.react.modules.navigator.IgReactNavigatorModule", false, true, true, false));
        hashMap.put(IgReactPerformanceLoggerModule.MODULE_NAME, new A42(IgReactPerformanceLoggerModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactPerformanceLoggerModule", false, true, false, false));
        String $const$string8 = AnonymousClass40t.$const$string(90);
        hashMap.put($const$string8, new A42($const$string8, "com.instagram.react.modules.product.IgReactPostInsightsModule", false, false, false, false));
        String $const$string9 = StateSummary.$const$string(29);
        hashMap.put($const$string9, new A42($const$string9, "com.instagram.react.modules.product.IgReactPromoteMigrationModule", false, false, false, false));
        hashMap.put(IgReactPurchaseProtectionSheetModule.MODULE_NAME, new A42(IgReactPurchaseProtectionSheetModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule", false, false, false, false));
        hashMap.put(IgReactShoppingPickerModule.MODULE_NAME, new A42(IgReactShoppingPickerModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactShoppingPickerModule", false, false, false, false));
        hashMap.put(IgReactQEModule.MODULE_NAME, new A42(IgReactQEModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactQEModule", false, false, false, false));
        String $const$string10 = AnonymousClass40t.$const$string(92);
        hashMap.put($const$string10, new A42($const$string10, "com.instagram.react.modules.product.IgReactShoppingCatalogSettingsModule", false, false, false, false));
        String $const$string11 = AnonymousClass40t.$const$string(93);
        hashMap.put($const$string11, new A42($const$string11, "com.instagram.react.modules.product.IgReactShoppingSignupReactModule", false, false, false, false));
        hashMap.put(IgReactPurchaseExperienceBridgeModule.MODULE_NAME, new A42(IgReactPurchaseExperienceBridgeModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule", false, false, false, false));
        hashMap.put(IgSharedPreferencesModule.MODULE_NAME, new A42(IgSharedPreferencesModule.MODULE_NAME, "com.instagram.react.modules.base.IgSharedPreferencesModule", false, false, false, false));
        hashMap.put(IntentModule.NAME, new A42(IntentModule.NAME, "com.facebook.react.modules.intent.IntentModule", false, false, false, false));
        hashMap.put(LocationModule.NAME, new A42(LocationModule.NAME, "com.facebook.react.modules.location.LocationModule", false, false, false, false));
        hashMap.put(NativeAnimatedModule.NAME, new A42(NativeAnimatedModule.NAME, "com.facebook.react.animated.NativeAnimatedModule", false, false, false, false));
        hashMap.put(NetInfoModule.NAME, new A42(NetInfoModule.NAME, "com.facebook.catalyst.modules.netinfo.NetInfoModule", false, false, false, false));
        hashMap.put(PermissionsModule.NAME, new A42(PermissionsModule.NAME, "com.facebook.react.modules.permissions.PermissionsModule", false, false, false, false));
        String $const$string12 = AnonymousClass40t.$const$string(164);
        hashMap.put($const$string12, new A42($const$string12, "com.instagram.react.modules.base.RelayAPIConfigModule", false, false, true, false));
        hashMap.put(StatusBarModule.NAME, new A42(StatusBarModule.NAME, "com.facebook.react.modules.statusbar.StatusBarModule", false, false, true, false));
        hashMap.put(SoundManagerModule.NAME, new A42(SoundManagerModule.NAME, "com.facebook.react.modules.sound.SoundManagerModule", false, false, false, false));
        hashMap.put(SwipeRefreshLayoutManager.REACT_CLASS, new A42(SwipeRefreshLayoutManager.REACT_CLASS, "com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager", false, false, false, false));
        hashMap.put(ToastModule.NAME, new A42(ToastModule.NAME, "com.facebook.react.modules.toast.ToastModule", false, false, true, false));
        hashMap.put(ClipboardModule.NAME, new A42(ClipboardModule.NAME, "com.facebook.react.modules.clipboard.ClipboardModule", false, false, false, false));
        String $const$string13 = AnonymousClass40t.$const$string(85);
        hashMap.put($const$string13, new A42($const$string13, "com.instagram.react.modules.product.IgReactBloksNavigationModule", false, false, false, false));
        return hashMap;
    }
}
