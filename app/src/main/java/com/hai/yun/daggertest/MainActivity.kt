package com.hai.yun.daggertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    lateinit var mianGraph: MianGraph
    @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mianGraph = (application as myApplication).appComponent.mainGraph().create()
        mianGraph.inject(this)
        user.name = "小黑"
        println(user.name)

    }

    fun toNext(view: View) {
        startActivity(Intent(this, Main2Activity::class.java))
    }
}
