package com.example.recyclerviewcardviewtrialoffline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewcardviewtrialoffline.adapters.MyAdapterForRecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val numbers:Array<String> = arrayOf("one","two","three","four","five","Six","Seven","Eight","Nine","Ten","Eleven","Tweelve","third-teen","four-teen","fifteen","six-teen","Seven-teen");

        val adapter = MyAdapterForRecyclerView(numbers)

        myrecycler_view.layoutManager = LinearLayoutManager(this)

        myrecycler_view.adapter = adapter


    }
}