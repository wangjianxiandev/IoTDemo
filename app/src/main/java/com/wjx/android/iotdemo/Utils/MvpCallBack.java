package com.wjx.android.iotdemo.Utils;

/**
 * Created with Android Studio.
 * Description:
 *
 * @author: 王拣贤
 * @date: 2019/06/26
 * Time: 17:58
 */
public interface MvpCallBack {
    /**
     * 数据请求成功
     */
    void onSuccess(String data);

    /**
     * 数据请求错误
     */
    void onError(String error);

    /**
     * 请求数据完成
     */
    void onComplete();
}
