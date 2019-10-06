package com.soksok.kmate;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.kakao.auth.KakaoSDK;
import com.nhn.android.naverlogin.OAuthLogin;
import com.soksok.kmate.common.BasicUtils;
import com.soksok.kmate.common.BindUtils;
import com.soksok.kmate.common.PrefUtils;
import com.soksok.kmate.view.login.KakaoSDKAdapter;

import java.lang.ref.WeakReference;

public class KmateApplication extends Application {

    private static WeakReference<Context> context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = new WeakReference<>(getApplicationContext());
        initUtils();
        KakaoSDK.init(new KakaoSDKAdapter());
        initNaverLoginModule();

        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
        BasicUtils.getHashKey(this);
    }

    private void initUtils() {

        BasicUtils.init(this);
        BindUtils.init(this);
        PrefUtils.init(this);
    }

    private void initNaverLoginModule() {

        OAuthLogin oAuthLoginModule = OAuthLogin.getInstance();
        oAuthLoginModule.init(
                this,
                getString(R.string.naver_client_id),
                getString(R.string.naver_client_secret),
                getString(R.string.app_name)
        );
    }

    public static Context getKmateApplicationContext() {
        return context.get();
    }
}
