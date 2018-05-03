package com.example.user.mvpproject.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.example.user.mvpproject.base.BaseActivity;
import com.example.user.mvpproject.R;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    private TextView mTextView;
    private MainPresenter mPresenter;

    @BindView(R.id.tvHello)
    TextView getmTextView;

    @Override
    protected int getContentResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        getPresenter().loadHelloText();
    }

    @Override
    protected void injectDependencies() {
        getActivityComponent().inject(this);
    }

    @Override
    public void onTextLoaded(String text) {
        mTextView.setText(text);
    }

    @OnClick(R.id.tvHello)
    public void onClick(){
        getPresenter().loadHelloText();
    }
}
