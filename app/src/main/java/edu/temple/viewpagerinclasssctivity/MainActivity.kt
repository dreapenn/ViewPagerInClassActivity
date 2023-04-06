package edu.temple.viewpagerinclasssctivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    val viewPager : ViewPager2 by lazy{
        findViewById(R.id.viewPager)
    }
    val newButton : Button by lazy{
        findViewById(R.id.button)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newButton.setOnClickListener{

        }

        viewPager.adapter = object: FragmentStateAdapter(this) {
            override fun getItemCount() = 10

            override fun createFragment(position: Int) = TextFragment.newInstance((position + 1).toString())

        }


    }
}