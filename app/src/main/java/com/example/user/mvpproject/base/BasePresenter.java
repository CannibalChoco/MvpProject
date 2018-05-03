package com.example.user.mvpproject.base;

import javax.inject.Inject;

/**
 *Each presenter should have attach()/detach() or (bind/unbind) methods to bind the view to the
 * presenter. If an asynchronous job is done we have to check if view is attached or not. So we
 * also need a isAttached()method.
 *
 * Also view is defined as generic class extends BaseView. By doing this we tell the presenter that
 * it should attach a view that extends the BaseView.
 */
public class BasePresenter<V extends BaseView> implements BaseMvpPresenter<V> {

    /**
     * Attached view
     */
    private V mView;

    @Override
    public void attach(V view) {
        mView = view;
    }

    @Override
    public void detach() {
        mView = null;
    }

    @Override
    public boolean isAttached() {
        return mView != null;
    }

    public V getView(){
        return mView;
    }
}
