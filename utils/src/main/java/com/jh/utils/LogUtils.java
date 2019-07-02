package com.jh.utils;

import android.util.Log;

/**
 * 打印工具类
 *
 * 在清单文件中调用init()方法
 * 其它使用跟系统的log一致
 *
 */
public class LogUtils {

    private static boolean isDebug = false;

    /**
     * 请在清单文件或者最初始的地方调用,控制
     */
    public static void init() {
        isDebug = BuildConfig.DEBUG;
        if (isDebug){
            Log.i("LogUtils", "当前处于DEBUG模式");
        }else{
            Log.i("LogUtils", "当前处于RELEASE模式");
        }
    }

    private LogUtils() {

    }


    public static void d(String tag, String content) {
        if (isDebug) {
            Log.d(tag, content);
        }
    }

    public static void d(String tag, String content, Throwable tr) {
        if (isDebug) {
            Log.d(tag, content, tr);
        }
    }

    public static void e(String tag, String content) {
        if (isDebug) {
            Log.e(tag, content);
        }
    }

    public static void e(String tag, String content, Throwable tr) {
        if (isDebug) {
            Log.e(tag, content, tr);
        }
    }

    public static void i(String tag, String content) {
        if (isDebug) {
            Log.i(tag, content);
        }

    }

    public static void i(String tag, String content, Throwable tr) {
        if (isDebug) {
            Log.i(tag, content, tr);
        }
    }

    public static void v(String tag, String content) {
        if (isDebug) {
            Log.v(tag, content);
        }
    }

    public static void v(String tag, String content, Throwable tr) {
        if (isDebug) {
            Log.v(tag, content, tr);
        }
    }

    public static void w(String tag, String content) {
        if (isDebug) {
            Log.w(tag, content);
        }
    }

    public static void w(String tag, String content, Throwable tr) {
        if (isDebug) {
            Log.w(tag, content, tr);
        }
    }

    public static void w(String tag, Throwable tr) {
        if (isDebug) {
            Log.w(tag, tr);
        }
    }

}
