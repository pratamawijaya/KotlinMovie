package com.pratamawijaya.kotlinmovie.data.model.response

import com.pratamawijaya.kotlinmovie.data.model.Movie

/**
 * Created by pratama
 * Date : Jul - 7/17/17
 * Project Name : KotlinMovie
 */
data class PopularMovieResponse(
        val total_results: Int,
        val total_pages: Int,
        val results: List<Movie>)