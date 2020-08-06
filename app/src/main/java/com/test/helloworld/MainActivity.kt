package com.test.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create variable
        var timesClicked = 0

        // set button onclick listener
        button.setOnClickListener {
            //add 1 when button clicked
            timesClicked += 1
            textView.text = timesClicked.toString()

            //display toast when button clicked
            Toast.makeText(this@MainActivity, "Added", Toast.LENGTH_SHORT).show()
        }

        // set button2 onclick listener
        button2.setOnClickListener {
            //add 1 when button clicked
            timesClicked -= 1
            textView.text = timesClicked.toString()

            //display toast when button clicked
            Toast.makeText(this@MainActivity, "Removed", Toast.LENGTH_SHORT).show()
        }
    }
}
