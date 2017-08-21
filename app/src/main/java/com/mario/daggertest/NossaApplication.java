package com.mario.daggertest;

import android.app.Application;

/**
 * @author Mario Feles dos Santos Junior
 * @date 20/08/17 - 22:54
 * @email mario_feles@live.com
 * @project DaggerTest
 */

public class NossaApplication extends Application {
    private static NossoComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerNossoComponent.builder()
                .martelos(new Martelos())
                .build();
    }

    public static NossoComponent getComponent(){
        return component;
    }
}
