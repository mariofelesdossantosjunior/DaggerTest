package com.mario.daggertest;

import dagger.Module;
import dagger.Provides;

/**
 * @author Mario Feles dos Santos Junior
 * @date 20/08/17 - 22:23
 * @email mario_feles@live.com
 * @project DaggerTest
 */

@Module
public class Martelos {

    @Provides
    public MarteloPequeno fornecerMarteloPequeno(){
        return new MarteloPequeno();
    }

    @Provides
    public MarteloMedio fornecerMarteloMedio(){
        return new MarteloMedio();
    }

    @Provides
    public MarteloGrande fornecerMarteloGrande(){
        return new MarteloGrande();
    }
}
