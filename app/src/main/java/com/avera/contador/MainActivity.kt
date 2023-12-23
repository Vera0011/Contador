package com.avera.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add_button : Button = findViewById(R.id.add_button);
        val minus_button : Button = findViewById(R.id.minus_button);
        val result_text : TextView = findViewById(R.id.result_text);
        val reset_button : FloatingActionButton = findViewById(R.id.reset_button);

        add_button.setOnClickListener{
            val actualValue : Int = result_text.text.toString().toInt() + 1;

            result_text.text = actualValue.toString()
        }

        minus_button.setOnClickListener{
            val actualValue : Int = if(result_text.text.toString().toInt() - 1 < 0) 0 else result_text.text.toString().toInt() - 1;

            result_text.text = actualValue.toString()
        }

        reset_button.setOnClickListener{
            result_text.text = "0";
        };
    }
}