package com.androiddevnotes.example

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val applicationInfo: ApplicationInfo = this.packageManager.getApplicationInfo(this.packageName, PackageManager.GET_META_DATA)

        val value = applicationInfo.metaData["someName"]

        Log.d(TAG, "onCreate: value: ${value.toString()}")
        
        val otherValueYo = applicationInfo.metaData["otherNameFromGradlePropertiesFile"]

        Log.d(TAG, "onCreate: otherValue: ${otherValueYo.toString()}")

    }
}