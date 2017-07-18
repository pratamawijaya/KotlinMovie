package com.pratamawijaya.kotlinmovie.presentation.home

import com.pratamawijaya.kotlinmovie.data.model.Movie

/**
 * Created by pratama
 * Date : Jul - 7/17/17
 * Project Name : KotlinMovie
 */
interface MainView {
    fun showLoading()
    fun displayResult(result: List<Movie>)
    fun hideLoading()
}