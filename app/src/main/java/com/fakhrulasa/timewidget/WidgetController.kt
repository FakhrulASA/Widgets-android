package com.fakhrulasa.timewidget

import androidx.appcompat.app.AppCompatActivity
import android.content.pm.PackageManager

import android.content.ComponentName
import android.content.Context


object WidgetController {
    /**
     * Enabling widget
     */
    fun enableWidget(context: Context){
        context.packageManager.setComponentEnabledSetting(
            ComponentName(
                context,
                WidgetProvider::class.java
            ), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP
        )
    }

    /**
     * Disabling widget
     */
    fun disableWidget(context: Context){
        context.packageManager.setComponentEnabledSetting(
            ComponentName(
                context,
                WidgetProvider::class.java
            ), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP
        )
    }
}