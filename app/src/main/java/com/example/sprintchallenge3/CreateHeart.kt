package com.example.sprintchallenge3

import android.content.Context
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

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

            var count = 0
            createImage.setOnClickListener {
                val location = it.tag.toString().toInt()

                if (count == 0) {
                    count++
                    for (i in 0 until location){
                        val heartScale = getChildAt(i) as ImageView
                        heartScale.setImageDrawable(fillHeart)
                        (heartScale.drawable as AnimatedVectorDrawable).start()
                        whyDoesThisWork = location
                    }
                }

                else{
                    count--
                    for (j in location until childCount){
                        val emptyHeart = getChildAt(j) as ImageView
                        val emptyHeartImage = ContextCompat.getDrawable(context, R.drawable.empty_heart)
                        emptyHeart.setImageDrawable(emptyHeartImage)
                        (emptyHeartImage as AnimatedVectorDrawable).start()
                        whyDoesThisWork = location
                    }
                }

            }

        }


    }



}