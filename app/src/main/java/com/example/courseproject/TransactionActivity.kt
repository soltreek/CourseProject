package com.example.courseproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_help.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_transaction.*

class TransactionActivity : AppCompatActivity() {

    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        count = count.plus(1)
        val price1 = intent.getStringExtra("price1")
        val price2 = intent.getStringExtra("price2")
        val price3 = intent.getStringExtra("price3")
        val price4 = intent.getStringExtra("price4")
        var cash = intent.getStringExtra("cash")
        var check = intent.getStringExtra("check")



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction)


        btn_main3.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("cash",cash)
            startActivity(intent)
        }

        btn_buy1.setOnClickListener {
            if (check == "1") {
                Snackbar.make(
                    findViewById(R.id.btn_buy1),
                    "Are you sure you want to make a transaction?",
                    Snackbar.LENGTH_LONG
                ).show()
            }
            if (text_value.text.toString().toDoubleOrNull()==null) {
                Snackbar.make(
                    findViewById(R.id.btn_buy1),
                    "Numbers only",
                    Snackbar.LENGTH_LONG
                ).show()
            }
            else {
                var buy_price1 = text_value.text.toString().toDouble()
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }

        }

        btn_buy2.setOnClickListener {
            if (check == "1") {
                Snackbar.make(
                    findViewById(R.id.btn_buy2),
                    "Are you sure you want to make a transaction?",
                    Snackbar.LENGTH_LONG
                ).show()
            }
            if (text_value.text.toString().toDoubleOrNull()==null) {
                Snackbar.make(
                    findViewById(R.id.btn_buy2),
                    "Numbers only",
                    Snackbar.LENGTH_LONG
                ).show()
            }

            else {
                var buy_price1 = text_value.text.toString().toDouble()
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }

        }

        btn_buy3.setOnClickListener {
            if (check == "1") {
                Snackbar.make(
                    findViewById(R.id.btn_buy3),
                    "Are you sure you want to make a transaction?",
                    Snackbar.LENGTH_LONG
                ).show()
            }
            if (text_value.text.toString().toDoubleOrNull()==null) {
                Snackbar.make(
                    findViewById(R.id.btn_buy3),
                    "Numbers only",
                    Snackbar.LENGTH_LONG
                ).show()
            }
            else {
                var buy_price1 = text_value.text.toString().toDouble()
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }

        }

        btn_buy4.setOnClickListener {
            if (check == "1") {
                Snackbar.make(
                    findViewById(R.id.btn_buy4),
                    "Are you sure you want to make a transaction?",
                    Snackbar.LENGTH_LONG
                ).show()
            }
            if (text_value.text.toString().toDoubleOrNull()==null) {
                Snackbar.make(
                    findViewById(R.id.btn_buy4),
                    "Numbers only",
                    Snackbar.LENGTH_LONG
                ).show()
            }
            else {
                var buy_price1 = text_value.text.toString().toDouble()
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }

        }
        btn_setting.setOnClickListener {
            var intent = Intent(this,PreferenceActivity::class.java)
            startActivity(intent)
        }
    }
}