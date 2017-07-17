package com.pratamawijaya.kotlinmovie

import com.pratamawijaya.kotlinmovie.data.Request
import com.pratamawijaya.kotlinmovie.data.TheMovieDBApi
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by pratama
 * Date : Jul - 7/17/17
 * Project Name : KotlinMovie
 */
class MainPresenter(val view: MainView, val request: Request) {

    fun getFavMovie() {
        view.showLoading()
        // do async
        doAsync {
            val result = request.getFavoriteMovie(TheMovieDBApi.getPopularMovie())

            view.hideLoading()

            uiThread {
                view.displayResult(result)
            }
        }
    }

}