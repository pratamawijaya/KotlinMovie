package com.pratamawijaya.kotlinmovie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.pratamawijaya.kotlinmovie.data.Request

class MainActivity : AppCompatActivity(), MainView {

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val request = Request()
        presenter = MainPresenter(this, request)
        presenter.getFavMovie()
    }

    override fun showLoading() {
    }

    override fun displayResult(result: String) {
        Log.d("tag", "result $result")
    }

    override fun hideLoading() {
    }

}
