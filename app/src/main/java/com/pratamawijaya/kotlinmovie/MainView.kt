package com.pratamawijaya.kotlinmovie

/**
 * Created by pratama
 * Date : Jul - 7/17/17
 * Project Name : KotlinMovie
 */
interface MainView {
    fun showLoading()
    fun displayResult(result: String)
    fun hideLoading()
}