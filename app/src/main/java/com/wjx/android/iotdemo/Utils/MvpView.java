package com.wjx.android.iotdemo.Utils;

/**
 * Created with Android Studio.
 * Description:
 *
 * @author: 王拣贤
 * @date: 2019/06/26
 * Time: 18:02
 */
public interface MvpView {
    /**
     * 当数据请求成功后，调用此接口显示数据
     * @param data
     */
    void showData(String data);

    /**
     * 当数据请求一场，调用此接口
     * @param error
     */
    void showErrorMessage(String error);

    /**
     * 当数据请求异常，调用此接口提示
     */
    void showComplete();
}
