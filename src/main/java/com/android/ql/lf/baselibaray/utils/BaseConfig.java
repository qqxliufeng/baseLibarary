package com.android.ql.lf.baselibaray.utils;

import android.content.Context;
import android.os.Environment;

public class BaseConfig {

    public static final String BASE_IP = "http://www.baidu.com";

    public static final String md5Token = "";
    public static final String BASE_PATH = Environment.getExternalStorageDirectory().getAbsolutePath();
    public static final String APP_PATH = BASE_PATH + "/zwlogistics/";
    public static final String IMAGE_PATH = APP_PATH + "/img/";
    public static String getFileProvidePath(Context context) {
        return context.getPackageName() + ".fileProvider";
    }

}
