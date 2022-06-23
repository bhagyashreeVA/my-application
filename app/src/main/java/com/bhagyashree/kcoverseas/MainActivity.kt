package com.bhagyashree.kcoverseas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.buttonGetStarted).setOnClickListener{
            navigateToHomeActivity()
        }
    }
    private fun navigateToHomeActivity(){
        startActivity(Intent(applicationContext,HomeActivity::class.java))
        finish()
    }
}
