package com.hai.yun.daggertest

import dagger.Component
import dagger.Subcomponent
import javax.inject.Scope
import javax.inject.Singleton

@ActivityScope
@Component(modules = [BeansProvider::class,SubBeanProvider::class])
interface ApplicationGraph {
    fun inject(activity: MainActivity)
    fun mainGraph():MianGraph.Factory
}
@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope


@Subcomponent
interface MianGraph{
    @Subcomponent.Factory
    interface Factory {
        fun create(): MianGraph
    }
    fun inject(activity: MainActivity)
    fun inject(activity: Main2Activity)
}
