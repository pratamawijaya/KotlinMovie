package com.pratamawijaya.kotlinmovie.data

import java.net.URL

/**
 * Created by pratama
 * Date : Jul - 7/17/17
 * Project Name : KotlinMovie
 */
class Request {

    fun getFavoriteMovie(url: String): String {
        val result = URL(url).readText()
        return result
    }
}