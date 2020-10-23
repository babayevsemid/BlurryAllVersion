package com.semid.blurryallversion

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.semid.blurry.Blurry
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        root.setOnClickListener{

            Blurry.with(applicationContext)
                    .radius(10)
                    .sampling(8)
                    .color(Color.argb(66, 255, 255, 0))
                    .async()
                    .animate(500)
                    .onto(root);
        }
    }
}