package com.example.user.mvpproject.di.component;

import com.example.user.mvpproject.di.module.ActivityModule;
import com.example.user.mvpproject.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity obj);
}