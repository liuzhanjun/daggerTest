package com.hai.yun.daggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class Main2Activity : AppCompatActivity() {
    lateinit var mianGraph: MianGraph
    @Inject
    lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mianGraph = (application as myApplication).appComponent.mainGraph().create()
        mianGraph.inject(this)
        println(user.name)
    }
}
