package com.example.sprintchallenge3

import android.content.Context
import android.graphics.drawable.Animatable
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.display_fragment.view.*

class CreateHeart (context: Context?, attrs: AttributeSet?): LinearLayout(context, attrs){

    var filled = false
    var notSelected = true
    var heartAmount = 5
    var heartLocation = 2

    companion object{
        var whyDoesThisWork = 0
    }


    init{
        val typedArray = context?.obtainStyledAttributes(attrs, R.styleable.CreateHeart)
        val filledHearts = typedArray?.getBoolean(R.styleable.CreateHeart_selected, false)
        val notFilledHearts = typedArray?.getBoolean(R.styleable.CreateHeart_selected, true)
        val amountOfHearts = typedArray?.getInt(R.styleable.CreateHeart_heart_amount, 5)
        val locationOfHearts = typedArray?.getInt(R.styleable.CreateHeart_heart_location, 1)
        typedArray?.recycle()

        heartLocation = whyDoesThisWork

        for (i in 0 until amountOfHearts!!){

            val createImage = ImageView(context)
            createImage.tag = i + 1
            val fillHeart = ContextCompat.getDrawable(context, R.drawable.grow_heart)
            createImage.setImageDrawable(fillHeart)
            addView(createImage)

            createImage.setOnClickListener {
                val location = it.tag.toString().toInt()
                if (notFilledHearts!!) {
                    (fillHeart as Animatable).start()
                    whyDoesThisWork = location
                }

            }

        }


    }



}