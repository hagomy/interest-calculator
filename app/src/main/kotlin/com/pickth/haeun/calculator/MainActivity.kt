package com.pickth.haeun.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_main_cal.setOnClickListener {
            val month = et_main_month.text.toString().toInt()
            val won = et_main_won.text
            val per = et_main_per.text

            Toast.makeText(this, "${month+month}월 ${won}원 ${per}%", Toast.LENGTH_SHORT).show()
        }
    }
}
