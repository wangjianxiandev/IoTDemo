package com.wjx.android.iotdemo.Impl;

import com.wjx.android.iotdemo.Utils.MvpCallBack;

/**
 * Created with Android Studio.
 * Description:
 *
 * @author: 王拣贤
 * @date: 2019/06/26
 * Time: 18:00
 */
public class MvpModel {
    public static void getNetData(final String param, final MvpCallBack mvpCallback){
        switch (param){
            case "normal":
                mvpCallback.onSuccess("请求网络成功");
                break;
            case "error":
                mvpCallback.onError("请求异常");
                break;
            case "complete":
                mvpCallback.onComplete();
                break;
        }
    }
}
