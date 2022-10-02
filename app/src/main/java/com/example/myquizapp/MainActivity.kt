package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart:Button = findViewById(R.id.btnStart)
        val etText:EditText = findViewById(R.id.etText)
        btnStart.setOnClickListener{
            if(etText.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter your name",
                    Toast.LENGTH_LONG).show()
            }else{
                val intent:Intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etText.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}