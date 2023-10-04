package com.tega.cameraproject.application;

import android.app.Application;

import com.tega.cameraproject.di.components.ApplicationComponent;
import com.tega.cameraproject.di.components.DaggerApplicationComponent;
import com.tega.cameraproject.di.modules.ApplicationModule;


public class CarAssistantApplication extends Application {

    private ApplicationComponent applicationComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        iniAppComponent();
    }

    private void iniAppComponent() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
