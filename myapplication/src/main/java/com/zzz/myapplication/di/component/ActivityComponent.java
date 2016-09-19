package com.zzz.myapplication.di.component;

import android.app.Activity;

import com.zzz.myapplication.di.ActivityScope;
import com.zzz.myapplication.di.module.ActivityModule;
import com.zzz.myapplication.model.http.RetrofitHelper;

import dagger.Component;

/**
 * @创建者 zlf
 * @创建时间 2016/9/19 13:55
 */

@ActivityScope
@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    RetrofitHelper getRetrofitHelper();

    Activity getActivity();

//    void inject(MainActivity mainActivity);
}