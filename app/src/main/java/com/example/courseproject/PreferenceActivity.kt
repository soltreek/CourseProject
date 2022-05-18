package com.example.courseproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_help.*
import kotlinx.android.synthetic.main.activity_preference.*

class PreferenceActivity : AppCompatActivity() {

    var check = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)


        back_main.setOnClickListener {
            var intent = Intent(this,TransactionActivity::class.java)
            intent.putExtra("check",check)
            startActivity(intent)
        }


    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {

            val checked = view.isChecked


            when (view.getId()) {
                R.id.radio_Ask ->
                    if (checked) {
                        check = 1

                    }
                R.id.radio_askNot ->
                    if (checked) {
                         check = 2

                    }
            }
        }
    }
}