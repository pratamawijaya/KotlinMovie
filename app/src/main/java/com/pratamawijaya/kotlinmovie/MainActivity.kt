package com.pratamawijaya.kotlinmovie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.gson.Gson
import com.pratamawijaya.kotlinmovie.data.Request
import com.pratamawijaya.kotlinmovie.data.model.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val request = Request()
        val gson = Gson()
        presenter = MainPresenter(this, request, gson)
        presenter.getFavMovie()
    }

    override fun showLoading() {
    }

    override fun displayResult(result: List<Movie>) {
        result.map {
            Log.d("tag", "result ${it.title} ${it.posterPath}")
            tvResult.append("${it.title} \n")
        }
    }

    override fun hideLoading() {
    }

}
