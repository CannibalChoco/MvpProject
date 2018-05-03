package com.example.user.mvpproject.main;

import com.example.user.mvpproject.base.BasePresenter;

import java.util.Random;

import javax.inject.Inject;

/**
 * Extend BasePresenter and say that MainContract.View is attached to the activity.
 * Then implement MainContract.Presenter to our presenter. So our presenter has all possible user
 * actions
 */
public class MainPresenter extends BasePresenter<MainContract.View>
        implements MainContract.Presenter {

    @Inject
    public MainPresenter (){
        new MainPresenter();
    }

    private String[] helloTexts = {"Bonjour", "Hola", "Hello", "Hallo", "Merhaba", "Ciao", "Konnichiwa"};

    /**
     * Presenter decides what to show in hello text, then passes it to the view with
     * onTextLoaded(String text) callback.
     */
    @Override
    public void loadHelloText() {
        Random random = new Random();
        String hello = helloTexts[random.nextInt(helloTexts.length)];
        getView().onTextLoaded(hello);
    }
}
