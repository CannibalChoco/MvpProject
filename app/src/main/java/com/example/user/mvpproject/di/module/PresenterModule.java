package com.example.user.mvpproject.di.module;

import com.example.user.mvpproject.main.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    MainPresenter provideMainPresenter(){
        return new MainPresenter();
    }
}
