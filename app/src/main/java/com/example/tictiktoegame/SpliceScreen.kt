package com.example.tictiktoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class SpliceScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splice_screen)

        // here we set full screen of splice screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        // here we write how many time splice screen show and after which activity show
        // here we set 4 second
        Handler().postDelayed({
            val mymain = Intent(this@SpliceScreen,MainActivity::class.java)
            startActivity(mymain)
            finish()
        },4000)


    }
}