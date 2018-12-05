package com.niles.jiangnanpandiandemo;

import android.support.multidex.MultiDexApplication;

import com.niles.pandian.application.PanDianConfig;
import com.niles.pandian.application.PanDianManager;

/**
 * Created by Niles
 * Date 2018/12/5 17:52
 * Email niulinguo@163.com
 */
public class MyApp extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        PanDianManager.init(new PanDianConfig.Builder()
                .setApp(this)
                .setProxyIp(BuildConfig.PROXY_IP)
                .setProxyPort(BuildConfig.PROXY_PORT)
                .setIp(BuildConfig.IP)
                .setPort(BuildConfig.PORT)
                .build());
    }
}
