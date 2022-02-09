package com.fnreoz.jroek.Game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fnreoz.jroek.R
import kotlinx.android.synthetic.main.activity_st_ar_t.*

class StArT : AppCompatActivity() {
    override fun onCreate(savik: Bundle?) {
        super.onCreate(savik)
        setContentView(R.layout.activity_st_ar_t)
        window.addFlags(1024)
        buttonStart1.setOnClickListener {
            val gsddsg = Intent(this, GGActivity::class.java)
            startActivity(gsddsg)
        }

        buttonPrivacy2.setOnClickListener {
            val fbheh = Intent(this, Priv::class.java)
            startActivity(fbheh)
        }

        buttonExit3.setOnClickListener {
            finishAffinity()
        }
    }
}