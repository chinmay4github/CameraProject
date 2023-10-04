package com.tega.cameraproject.di.components;

import com.tega.cameraproject.di.scopes.ScreenScope;
import com.tega.cameraproject.ui.activities.DetectorActivity;

import dagger.Component;

@ScreenScope
@Component(dependencies = ApplicationComponent.class)
public interface ScreenComponent {


    void inject(DetectorActivity detectorActivity);
}
