package com.example.colormyviews
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners() {
        val clickableViews: List<View> = listOf(findViewById(R.id.box_one),findViewById(R.id.box_two),findViewById(R.id.box_three),
            findViewById(R.id.box_four), findViewById(R.id.box_five), findViewById(R.id.constraint_one),
            findViewById(R.id.button_red), findViewById(R.id.button_yellow), findViewById(R.id.button_blue))
        for (item in clickableViews) {
            item.setOnClickListener {
                if (item == findViewById(R.id.button_red) || item == findViewById(R.id.button_yellow) || item == findViewById(R.id.button_blue)){
                    colorAll(item)
                }
                makeColored(it)
            }
        }
    }
    private fun makeColored(view: View){
        when(view.id) {
            R.id.box_one -> view.setBackgroundColor(Color.BLUE)
            R.id.box_two -> view.setBackgroundColor(Color.GREEN)
            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_red_dark)
            else -> view.setBackgroundColor(Color.GRAY)
        }
    }
    private fun colorAll(view: View){
        if(view.id == R.id.button_red){
            findViewById<View>(R.id.box_one).setBackgroundResource(R.color.red)
            findViewById<View>(R.id.box_two).setBackgroundResource(R.color.red)
            findViewById<View>(R.id.box_three).setBackgroundResource(R.color.red)
            findViewById<View>(R.id.box_four).setBackgroundResource(R.color.red)
            findViewById<View>(R.id.box_five).setBackgroundResource(R.color.red)
        } else if(view.id == R.id.button_yellow){
            findViewById<View>(R.id.box_one).setBackgroundResource(R.color.yellow)
            findViewById<View>(R.id.box_two).setBackgroundResource(R.color.yellow)
            findViewById<View>(R.id.box_three).setBackgroundResource(R.color.yellow)
            findViewById<View>(R.id.box_four).setBackgroundResource(R.color.yellow)
            findViewById<View>(R.id.box_five).setBackgroundResource(R.color.yellow)
        } else if(view.id == R.id.button_blue){
            findViewById<View>(R.id.box_one).setBackgroundResource(R.color.blue)
            findViewById<View>(R.id.box_two).setBackgroundResource(R.color.blue)
            findViewById<View>(R.id.box_three).setBackgroundResource(R.color.blue)
            findViewById<View>(R.id.box_four).setBackgroundResource(R.color.blue)
            findViewById<View>(R.id.box_five).setBackgroundResource(R.color.blue)
        }
    }
}