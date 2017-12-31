package mchehab.com.kotlinapp

import android.content.Context
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import com.squareup.picasso.Picasso

/**
 * Created by muhammadchehab on 12/31/17.
 */
class MyImageView(context: Context, attrs: AttributeSet): AppCompatImageView(context, attrs) {
    fun setImageURL(url: String){
        Picasso.with(context).load(url).into(this)
    }
}