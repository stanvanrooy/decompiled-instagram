package p000X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1fj  reason: invalid class name and case insensitive filesystem */
public final class C35051fj {
    public static final C35071fl A00;
    public static final C35071fl A01;
    public static final C35071fl A02 = C35061fk.A01("INSTAGRAM_BOTTOM_SHEET_ACCOUNT_SWITCHER_FUNNEL");
    public static final C35071fl A03;
    public static final C35071fl A04;
    public static final C35071fl A05;
    public static final C35071fl A06;
    public static final C35071fl A07 = C35061fk.A01("INSTAGRAM_DROP_DOWN_ACCOUNT_SWITCHER_FUNNEL");
    public static final C35071fl A08;
    public static final C35071fl A09 = C35061fk.A01("INSTAGRAM_GDPR_FUNNEL");
    public static final C35071fl A0A;
    public static final C35071fl A0B;
    public static final C35071fl A0C;
    public static final C35071fl A0D;
    public static final C35071fl A0E;
    public static final C35071fl A0F;
    public static final C35071fl A0G;
    public static final C35071fl A0H;
    public static final C35071fl A0I;
    public static final C35071fl A0J;
    public static final C35071fl A0K;
    public static final C35071fl A0L;
    public static final C35071fl A0M;
    public static final C35071fl A0N = C35061fk.A01("PROFILE_PHONE_NUMBER_ENTRY_FUNNEL");
    public static final C35071fl A0O;
    public static final C35071fl A0P;
    public static final C35071fl A0Q;
    public static final C35071fl A0R;
    public static final C35071fl A0S;
    public static final C35071fl A0T;
    public static final C35071fl A0U;
    public static final C35071fl A0V;
    public static final C35071fl A0W;
    public static final C35071fl A0X;
    public static final C35071fl A0Y;
    public static final C35071fl A0Z = C35061fk.A01("ONE_TAP_LOGIN_LANDING_FUNNEL");
    public static final C35071fl A0a;
    public static final C35071fl A0b;
    public static final C35071fl A0c;
    public static final C35071fl A0d;
    public static final C35071fl A0e;
    public static final C35071fl A0f;
    public static final C35071fl A0g;
    public static final C35071fl A0h;

    static {
        C35061fk A012 = C35061fk.A01("EXAMPLE_FUNNEL");
        A012.A00 = 600;
        A012.A03 = true;
        A08 = A012;
        C35061fk A013 = C35061fk.A01("REGISTRATION_FUNNEL");
        A013.A01 = true;
        A013.A03 = false;
        A0e = A013;
        C35061fk A014 = C35061fk.A01("ANDROID_LEADGEN_FLOW_FUNNEL");
        A014.A00 = 600;
        A014.A03 = false;
        A0S = A014;
        C35061fk A015 = C35061fk.A01("ANDROID_NATIVE_LEAD_ADS_FLOW_FUNNEL");
        A015.A00 = 600;
        A015.A03 = false;
        A0Y = A015;
        C35061fk A016 = C35061fk.A01("ANDROID_ADS_FUNNEL");
        A016.A00 = 600;
        A016.A03 = false;
        A00 = A016;
        C35061fk A017 = C35061fk.A01("ANDROID_LIVE_BROADCAST_FUNNEL");
        A017.A00 = 600;
        A017.A03 = false;
        A0U = A017;
        C35061fk A018 = C35061fk.A01("ANDROID_REGULAR_LATENCY_LOGGING_FUNNEL");
        A018.A03 = false;
        A0c = A018;
        C35061fk A019 = C35061fk.A01("ANDROID_LOW_LATENCY_LOGGING_FUNNEL");
        A019.A03 = false;
        A0W = A019;
        C35061fk A0110 = C35061fk.A01("ANDROID_ZERO_LATENCY_LOGGING_FUNNEL");
        A0110.A03 = false;
        A0g = A0110;
        C35061fk A0111 = C35061fk.A01("ANDROID_REGULAR_LATENCY_UPLOAD_FUNNEL");
        A0111.A03 = false;
        A0d = A0111;
        C35061fk A0112 = C35061fk.A01("ANDROID_LOW_LATENCY_UPLOAD_FUNNEL");
        A0112.A03 = false;
        A0X = A0112;
        C35061fk A0113 = C35061fk.A01("ANDROID_ZERO_LATENCY_UPLOAD_FUNNEL");
        A0113.A03 = false;
        A0h = A0113;
        C35061fk A0114 = C35061fk.A01("ANDROID_CANVAS_FUNNEL");
        A0114.A00 = 600;
        A0114.A03 = false;
        A04 = A0114;
        C35061fk A0115 = C35061fk.A01("ANDROID_OPENED_FROM_FAMILY_APP_FUNNEL");
        A0115.A00 = 180;
        A0115.A03 = false;
        A0a = A0115;
        C35061fk A0116 = C35061fk.A01("INSTANT_EXPERIENCE_FUNNEL");
        A0116.A00 = 180;
        A0116.A03 = false;
        A0L = A0116;
        C35061fk A0117 = C35061fk.A01("BUSINESS_IX_PAYMENT_FUNNEL");
        A0117.A00 = 180;
        A0117.A03 = false;
        A03 = A0117;
        C35061fk A0118 = C35061fk.A01("SETTINGS_FUNNEL");
        A0118.A00 = 480;
        A0118.A03 = false;
        A0f = A0118;
        C35061fk A0119 = C35061fk.A01("LH_LS_UPSELL_FUNNEL");
        A0119.A02 = true;
        A0119.A03 = false;
        A0119.A00 = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
        A0T = A0119;
        C35061fk A0120 = C35061fk.A01("IG_POST_TRANSACTION_FUNNEL");
        A0120.A03 = true;
        A0b = A0120;
        C35061fk A0121 = C35061fk.A01("BUSINESS_CONVERSION_FUNNEL");
        A0121.A03 = false;
        A0121.A00 = 600;
        A0D = A0121;
        C35061fk A0122 = C35061fk.A01("CREATOR_CONVERSION_FUNNEL");
        A0122.A03 = false;
        A0122.A00 = 600;
        A0H = A0122;
        C35061fk A0123 = C35061fk.A01("BUSINESS_TO_CREATOR_CONVERSION_FUNNEL");
        A0123.A03 = false;
        A0123.A00 = 600;
        A0G = A0123;
        C35061fk A0124 = C35061fk.A01("BUSINESS_CHOOSE_FLOW_FUNNEL");
        A0124.A03 = false;
        A0124.A00 = 600;
        A0C = A0124;
        C35061fk A0125 = C35061fk.A01("BUSINESS_SIGNUP_FUNNEL");
        A0125.A03 = false;
        A0125.A00 = 600;
        A0F = A0125;
        C35061fk A0126 = C35061fk.A01("SHOPPING_IN_APP_SIGNUP_FUNNEL");
        A0126.A03 = false;
        A0126.A00 = 600;
        A0P = A0126;
        C35061fk A0127 = C35061fk.A01("BUSINESS_IMPORT_FB_PAGE_MEDIA_FUNNEL");
        A0127.A02 = true;
        A0127.A03 = false;
        A0127.A00 = 180;
        A0E = A0127;
        C35061fk A0128 = C35061fk.A01("IG_DOT_ME_ACCOUNT_RECOVERY_FUNNEL");
        A0128.A03 = false;
        A0128.A00 = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
        A0I = A0128;
        C35061fk A0129 = C35061fk.A01("ONE_CLICK_ACCOUNT_RECOVERY_FUNNEL");
        A0129.A03 = false;
        A0129.A00 = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
        A0M = A0129;
        C35061fk A0130 = C35061fk.A01("ANDROID_VIDEO_INGESTION_FUNNEL");
        A0130.A02 = true;
        A0130.A03 = false;
        A0130.A00 = (int) TimeUnit.HOURS.toSeconds(4);
        A0Q = A0130;
        C35061fk A0131 = C35061fk.A01("IG_BUSINESS_ATTRIBUTE_FUNNEL");
        A0131.A00 = 600;
        A0B = A0131;
        C35061fk A0132 = C35061fk.A01("IG_FBEMOJI_FONT_DOWNLOAD_FUNNEL");
        A0132.A03 = false;
        A0132.A00 = 1800;
        A0K = A0132;
        C35061fk A0133 = C35061fk.A01("INSTAGRAM_EXPLORE_POSITIVE_SIGNALS_FUNNEL");
        A0133.A03 = false;
        A0133.A00 = (int) TimeUnit.MINUTES.toSeconds(10);
        A0J = A0133;
        C35061fk A0134 = C35061fk.A01("IGTV_REVSHARE_ONBOARDING_FUNNEL");
        A0134.A03 = false;
        A0134.A00 = 600;
        A0A = A0134;
        C35061fk A0135 = C35061fk.A01("IMBE_PRODUCER_FUNNEL");
        A0135.A02 = true;
        A0135.A03 = false;
        A0135.A00 = 600;
        A0R = A0135;
        C35061fk A0136 = C35061fk.A01("DCP_FLOWS_FUNNEL");
        A0136.A03 = false;
        A0136.A00 = 86400;
        A06 = A0136;
        C35061fk A0137 = C35061fk.A01("ANDROID_RN_URL_HANDLER_FUNNEL");
        A0137.A03 = false;
        A0137.A00 = 600;
        A0O = A0137;
        C35061fk A0138 = C35061fk.A01("LIVE_USER_PAY_FUNNEL");
        A0138.A03 = false;
        A0138.A00 = 600;
        A0V = A0138;
        C35061fk A0139 = C35061fk.A01("CCU_BACKGROUND_JOB_FUNNEL");
        A0139.A03 = false;
        A0139.A00 = 600;
        A05 = A0139;
        C35061fk A0140 = C35061fk.A01("AD_CLIENT_PLATFORM_FUNNEL");
        A0140.A03 = false;
        A0140.A00 = 600;
        A01 = A0140;
    }
}
