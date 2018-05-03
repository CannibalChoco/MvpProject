package com.example.user.mvpproject.main;

import com.example.user.mvpproject.base.BaseMvpPresenter;
import com.example.user.mvpproject.base.BaseView;

/**
 * This is the signature of our feature. We group methods under two domains.
 *  1) Presenter interface includes all user actions. (click, swipe, delete etc.)
 *  2) View interface includes all callbacks and UI changes (show loading, populate a list,
 *      show connection error etc.)
 *
 * Here we have only one action loadHelloText() and a response onTextLoaded(String text) for this
 * action.
 */
public interface MainContract {

    /**
     * User actions implemented by Presenter
     */
    interface Presenter extends BaseMvpPresenter<MainContract.View>{
        void loadHelloText();
    }

    /**
     * Action callbacks implemented by Activity/Fragment
     */
    interface View extends BaseView{
        void onTextLoaded(String text);
    }

}
