package com.broscr.rootchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.broscr.securityutils.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textview)

        textView.text =
            buildString {
                append("Rooted: => ${SecurityUtils.isRooted()} \nEmulator => ${RootChecker.isEmulator()} ")
                append(
                    "\nProxy => ${RootChecker.isUsingProxy()} \nDebuggable => ${
                        RootChecker.isDebuggable(
                            this@MainActivity
                        )
                    }"
                )
            }
    }
}