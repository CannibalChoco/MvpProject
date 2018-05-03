package com.example.user.mvpproject.base;

/**
 * Each presenter is an interface and must implement this interface
 */
public interface BaseMvpPresenter<V extends BaseView> {

    /**
     * Called when view is attached to presenter
     */
    public void attach(V view);

    /**
     * Called when view is detached from presenter
     */
    public void detach();

    /**
     * return true if view is attached to presenter
     */
    public boolean isAttached();

}
