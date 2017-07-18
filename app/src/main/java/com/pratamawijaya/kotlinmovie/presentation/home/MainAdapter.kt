package com.pratamawijaya.kotlinmovie.presentation.home

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.pratamawijaya.kotlinmovie.R
import com.pratamawijaya.kotlinmovie.data.model.Movie
import com.pratamawijaya.kotlinmovie.presentation.utils.loadImageFromURL
import kotlinx.android.synthetic.main.item_movie.view.*

/**
 * Created by pratama
 * Date : Jul - 7/18/17
 * Project Name : KotlinMovie
 */
class MainAdapter(val context: Context, val movies: List<Movie>) : RecyclerView.Adapter<MainAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainHolder {
        return MainHolder(LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bindItem(movies[position])
    }

    override fun getItemCount(): Int = movies.size

    class MainHolder(view: View) : RecyclerView.ViewHolder(view) {

        val title: TextView = itemView.tvMovieTitle
        val imgPoster: ImageView = itemView.imgMoviePoster

        fun bindItem(movie: Movie) {
            title.text = movie.title
            imgPoster.loadImageFromURL(movie.imdbPosterPath)
        }
    }
}