package com.example.alpha_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeImageTransform
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var Images = intArrayOf(R.drawable.pic,R.drawable.pix,R.drawable.pick,R.drawable.ppe,R.drawable.ppic)
    var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun ChangeImageTransform(view: View) {

        var image_view: ImageView = findViewById(R.id.image_view) as ImageView

        image_view.setImageResource(Images[index])
        index++

        if(index == Images.size) {
            index = 0

        }

    }
}