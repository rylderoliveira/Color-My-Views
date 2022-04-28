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
            findViewById(R.id.box_four), findViewById(R.id.box_five), findViewById(R.id.constraint_one))
        for (item in clickableViews) {
            item.setOnClickListener {
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
}