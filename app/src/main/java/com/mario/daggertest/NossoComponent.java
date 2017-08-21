package com.mario.daggertest;

import dagger.Component;

/**
 * @author Mario Feles dos Santos Junior
 * @date 20/08/17 - 22:52
 * @email mario_feles@live.com
 * @project DaggerTest
 */

@Component(modules = {Martelos.class})
interface NossoComponent {
    void inject(MainActivity mainActivity);
}
