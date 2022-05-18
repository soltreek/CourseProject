package com.example.courseproject

import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.math.RoundingMode
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {

        var cash = intent.getStringExtra("cash")

        println("cash main:"+cash)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val randomValues1 = List(10) { Random.nextInt(0,100)}
        val randomValues2 = List(10) { Random.nextDouble(0.0,10.0)}
        val price1 = randomValues1[1]*randomValues2[1]
        val price2 = randomValues1[2]*randomValues2[2]
        val price3 = randomValues1[3]*randomValues2[3]
        val price4 = randomValues1[4]*randomValues2[4]


        text_price1.text = "$"+(String.format("%.2f", price1))
        text_price2.text = "$"+(String.format("%.2f", price2))
        text_price3.text = "$"+(String.format("%.2f", price3))
        text_price4.text = "$"+(String.format("%.2f", price4))



        btn_transaction.setOnClickListener {
            var intent = Intent(this,TransactionActivity::class.java)
            intent.putExtra("price1",(String.format("%.2f", price1)))
            intent.putExtra("price2",(String.format("%.2f", price2)))
            intent.putExtra("price3",(String.format("%.2f", price3)))
            intent.putExtra("price4",(String.format("%.2f", price4)))
            intent.putExtra("cash",cash.toString())
            startActivity(intent)

        }

        btn_help.setOnClickListener {
            var intent = Intent(this,HelpActivity::class.java)
            startActivity(intent)
        }

        

    }



}