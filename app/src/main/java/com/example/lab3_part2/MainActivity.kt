package com.example.lab3_part2

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3_part2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
       binding.signInTextMessage.apply {
           val text = "Sign in to Zappos.com Using your Amazon Account"
           val spannableString = SpannableString(text)
           spannableString.setSpan(StyleSpan(Typeface.BOLD), 11, 22, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
           this.text = spannableString
       }

        setContentView(binding.root)
    }
}