package com.broscr.rootchecker

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.broscr.securityutils.R
import com.broscr.securityutils.SecurityUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textview)

        textView.text =
            buildString {
                append("Rooted: => ${SecurityUtils.isRooted()} \nEmulator => ${SecurityUtils.isEmulator()} ")
                append(
                    "\nProxy => ${SecurityUtils.isUsingProxy()} \nDebuggable => ${
                        SecurityUtils.isDebuggable(
                            this@MainActivity
                        )
                    }"
                )
                append("\nADBEnabled => ${SecurityUtils.isADBEnabled(this@MainActivity)}")
                append("\nDeveloperMode => ${SecurityUtils.isDeveloperOptionsEnabled(this@MainActivity)}")
                append("\nScreenCapture => ${SecurityUtils.isScreenCaptureEnabled(this@MainActivity)}")
            }
    }
}