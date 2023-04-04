package com.example.morebuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TableLayout
import androidx.appcompat.widget.SwitchCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)
        val switch = findViewById<SwitchCompat>(R.id.switch1)
        val table = findViewById<TableLayout>(R.id.table)

        switch.setOnCheckedChangeListener { buttonView, isChecked -> image.isVisible = isChecked }
    }
}