package com.example.user.mvpproject.di.module;

import android.app.Activity;
import android.content.Context;

import com.example.user.mvpproject.main.MainContract;
import com.example.user.mvpproject.main.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private Context mContext;

    public ActivityModule(Context context) {
        mContext = context;
    }

//    @Provides
//    @Singleton
//    ChromeTabsWrapper providesChromeTabsWrapper() {
//        return new ChromeTabsWrapper(mContext);
//    }

    @Provides
    @Singleton
    MainContract.Presenter providesMainPresenter() {
        return new MainPresenter();
    }

}