package com.wjx.android.iotdemo.Impl;

import com.wjx.android.iotdemo.Utils.MvpCallBack;
import com.wjx.android.iotdemo.Utils.MvpView;

/**
 * Created with Android Studio.
 * Description:
 *
 * @author: 王拣贤
 * @date: 2019/06/26
 * Time: 18:04
 */
public class MvpPresent {
    private MvpView mvpView;
    public MvpPresent(){

    }


    public void getData(String params){
        MvpModel.getNetData(params, new MvpCallBack() {
            @Override
            public void onSuccess(String data) {
                if(isViewAttached()) {
                    mvpView.showData(data);
                }
            }

            @Override
            public void onError(String error) {
                if(isViewAttached()) {
                    mvpView.showErrorMessage(error);
                }
            }

            @Override
            public void onComplete() {
                if(isViewAttached()) {
                    mvpView.showComplete();
                }
            }
        });
    }

    /**
     * 绑定view, 一般在Activity的onCreate中调用该方法
     * @param mvpView
     */
    public void setMvpView(MvpView mvpView) {
        this.mvpView = mvpView;
    }

    /**
     * 断开View，一般在Activity的onDestroy()中调用
     */
    public void detachView(){
        if(null != mvpView){
            this.mvpView = null;
        }
    }

    /**
     * 是否与View建立连接
     * 每次调用业务请求时都要先调用该方法检查Presenter是否与 View建立连接
     * @return
     */
    public boolean isViewAttached(){
        return mvpView != null;
    }
}
