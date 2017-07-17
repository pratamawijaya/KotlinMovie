package com.pratamawijaya.kotlinmovie.data

import android.util.Log
import java.net.URL

/**
 * Created by pratama
 * Date : Jul - 7/17/17
 * Project Name : KotlinMovie
 */
class Request {

    fun getFavoriteMovie(url: String): String {
        Log.d("tag", "url $url")
        val result = URL(url).readText()
        return result
    }
}