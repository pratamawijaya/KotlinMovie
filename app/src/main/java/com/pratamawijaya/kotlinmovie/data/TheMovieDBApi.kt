package com.pratamawijaya.kotlinmovie.data

import com.pratamawijaya.kotlinmovie.BuildConfig

/**
 * Created by pratama
 * Date : Jul - 7/17/17
 * Project Name : KotlinMovie
 */
object TheMovieDBApi {
    fun getPopularMovie(): String {
        return BuildConfig.THEMOVIEDB_API + "movie/popular" + "?api_key=${BuildConfig.THEMOVIEDB_KEY}"
    }
}