package com.jh.utils;

import android.content.Context;
import android.widget.Toast;

import java.lang.ref.WeakReference;

/**
 *  吐司工具类
 *
 *
 */
public class ToastUtils {

    private static Toast toast = null;

    private static WeakReference<Context> weakReference = null;

    private static ToastUtils toastUtils = null;

    private ToastUtils(){
        toast = Toast.makeText(weakReference.get(),"",Toast.LENGTH_LONG);
    }

    private static void changeContext(){
        toast = Toast.makeText(weakReference.get(),"",Toast.LENGTH_LONG);
    }

    public static ToastUtils getInstance(Context context){
        weakReference = new WeakReference<Context>(context);
        if (toastUtils==null){
            synchronized (ToastUtils.class){
                if (toastUtils==null){
                    toastUtils = new ToastUtils();
                }else{
                    toast.cancel();
                    changeContext();
                }
            }
        }else{
            toast.cancel();
            changeContext();
        }
        return toastUtils;
    }

    /**
     * 短时间提示
     *
     * @param msg    提示内容
     *
     */
    public void showShort(String msg){
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setText(msg);
        toast.show();
    }

    /**
     * 长时间提示
     *
     * @param msg  提示内容
     *
     */
    public void showLong(String msg){
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setText(msg);
        toast.show();
    }

}
