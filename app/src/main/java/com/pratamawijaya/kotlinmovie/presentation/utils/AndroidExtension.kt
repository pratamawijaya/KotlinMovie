package com.pratamawijaya.kotlinmovie.presentation.utils

import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by pratama
 * Date : Jul - 7/18/17
 * Project Name : KotlinMovie
 */

/**
 * load image from url with picasso
 */
fun ImageView.loadImageFromURL(imgUrl: String?) {
    Picasso.with(this.context).load(imgUrl).into(this)
}