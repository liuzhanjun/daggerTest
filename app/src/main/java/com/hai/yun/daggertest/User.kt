package com.hai.yun.daggertest

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton


class User constructor() {
    var age: Int = 0
    var name: String = ""
    var sex: Boolean = false

    //不能使用@Inject注解此构造方法
    //因为其参数的构造方法未被@Inject
    constructor(name: String, sex: Boolean, age: Int) : this() {
        this.name = name
        this.age = age
        this.sex = sex
    }
}