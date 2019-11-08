package com.hai.yun.daggertest

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BeansProvider {
    @ActivityScope
    @Provides
    fun getUser(): User {
        return User("小白", false, 19)
    }
}

@Module(subcomponents = [MianGraph::class])
class SubBeanProvider{}