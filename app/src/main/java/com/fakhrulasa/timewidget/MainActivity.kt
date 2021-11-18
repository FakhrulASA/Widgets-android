package com.fakhrulasa.timewidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fakhrulasa.timewidget.WidgetController.enableWidget

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableWidget(this)
    }
}