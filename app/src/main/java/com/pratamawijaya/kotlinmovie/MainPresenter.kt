package com.pratamawijaya.kotlinmovie

import com.google.gson.Gson
import com.pratamawijaya.kotlinmovie.data.Request
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
                    val request: Request,
                    val gson: Gson) {

    fun getFavMovie() {
        view.showLoading()
        // do async
        doAsync {
            val result = gson.fromJson(request.getFavoriteMovie(TheMovieDBApi.getPopularMovie()),
                    PopularMovieResponse::class.java
            )

            view.hideLoading()

            uiThread {
                view.displayResult(result.results)
            }
        }
    }

}