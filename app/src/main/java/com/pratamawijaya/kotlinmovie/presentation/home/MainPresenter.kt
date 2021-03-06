package com.pratamawijaya.kotlinmovie.presentation.home

import android.util.Log
import com.google.gson.Gson
import com.pratamawijaya.kotlinmovie.data.MovieRepository
import com.pratamawijaya.kotlinmovie.data.TheMovieDBApi
import com.pratamawijaya.kotlinmovie.data.model.response.PopularMovieResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by pratama
 * Date : Jul - 7/17/17
 * Project Name : KotlinMovie
 */
class MainPresenter(val view: MainView,
                    val movieRepository: MovieRepository,
                    val gson: Gson) {

    fun getFavMovie(page: Int) {
        Log.d("tag", "get fav movie $page")
        view.showLoading()
        // do async
        doAsync {
            val result = gson.fromJson(movieRepository
                    .getFavoriteMovie(TheMovieDBApi.getPopularMovie(page)),
                    PopularMovieResponse::class.java
            )

            view.hideLoading()

            uiThread {
                view.displayResult(result.results)
            }
        }
    }

}