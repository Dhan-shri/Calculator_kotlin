package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var editFirst: EditText
    lateinit var editSecond: EditText
    lateinit var btnMulti: Button
    lateinit var btnDiv: Button
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var tvResult: TextView
    lateinit var button: Button


    var First: String? = null
    var Second: String? = null
    var result: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editFirst = findViewById(R.id.editFirst)
        editSecond = findViewById(R.id.editSecond)
        btnMulti = findViewById(R.id.btnMulti)
        btnDiv = findViewById(R.id.btnDiv)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        tvResult = findViewById(R.id.tvResult)
        button = findViewById(R.id.button)

        btnMulti.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        button.setOnClickListener (this)

    }

    override fun onClick(v: View?) {

        First = editFirst.text.toString()
        Second = editSecond.text.toString()

//            when (v?.id) {
//                R.id.btnMulti -> {
//                    if (First!!.isEmpty()) {
//                        Toast.makeText(
//                            applicationContext,
//                            "Enter a first number",
//                            Toast.LENGTH_LONG
//                        ).show()
//                    } else if (Second!!.isEmpty()) {
//                        Toast.makeText(
//                            applicationContext,
//                            "Enter a second number",
//                            Toast.LENGTH_LONG
//                        ).show()
//                    } else {
//                        result = First?.toInt()?.times(Second?.toInt()!!)
//
//                        tvResult.text = "Your answer is " + result.toString()
//
//                    }
//                }
//                R.id.btnDiv -> {
//                        if (First!!.isEmpty()) {
//                            Toast.makeText(applicationContext, "Enter a first number", Toast.LENGTH_LONG).show()
//                        } else if (Second!!.isEmpty()) {
//                            Toast.makeText(applicationContext, "Enter a second number", Toast.LENGTH_LONG).show()
//                        } else {
//                        result = First?.toInt()?.div(Second?.toInt()!!)
//
//                        tvResult.text = "Your answer is " + result.toString()
//                    }
//                }
//
//                R.id.btnAdd -> {
//                    if (First!!.isEmpty()) {
//                        Toast.makeText(applicationContext, "Enter a first number", Toast.LENGTH_LONG).show()
//                    } else if (Second!!.isEmpty()) {
//                        Toast.makeText(applicationContext, "Enter a second number", Toast.LENGTH_LONG).show()
//                    } else {
//
//                    result = First?.toInt()!! + Second?.toInt()!!
//
//                    tvResult.text = "Your answer is :-" + result.toString()
//                }
//                }
//
//                R.id.btnSub -> {
//                    if (First!!.isEmpty()) {
//                        Toast.makeText(applicationContext, "Enter a first number", Toast.LENGTH_LONG).show()
//                    } else if (Second!!.isEmpty()) {
//                        Toast.makeText(applicationContext, "Enter a second number", Toast.LENGTH_LONG).show()
//                    } else {
//                    result = First?.toInt()!! - Second?.toInt()!!
//
//                    tvResult.text = "Your answer is "+result.toString()
//                }
//            }
//
//        }


        when (v?.id) {
            R.id.button->{
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }

            R.id.btnMulti -> {
                when {
                    (First!!.isEmpty()) -> {
                        Toast.makeText(
                            applicationContext,
                            "Enter a first number",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                (Second!!.isEmpty()) ->{
                    Toast.makeText(
                        applicationContext,
                        "Enter a second number",
                        Toast.LENGTH_LONG
                    ).show()
                } else -> {
                    result = First?.toInt()?.times(Second?.toInt()!!)

                    tvResult.text = "Your answer is " + result.toString()

                }
            }
            }
            R.id.btnDiv -> {
                when {
                    (First!!.isEmpty()) -> {
                        Toast.makeText(
                            applicationContext,
                            "Enter a first number",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                    (Second!!.isEmpty()) -> {
                        Toast.makeText(
                            applicationContext,
                            "Enter a second number",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                    else -> {
                        result = First?.toInt()?.div(Second?.toInt()!!)

                        tvResult.text = "Your answer is " + result.toString()
                    }
                }
            }

            R.id.btnAdd -> {
                when {
                    First!!.isEmpty() -> {
                        Toast.makeText(applicationContext, "Enter a first number", Toast.LENGTH_LONG).show()
                    }
                    Second!!.isEmpty() -> {
                        Toast.makeText(applicationContext, "Enter a second number", Toast.LENGTH_LONG).show()
                    }
                    else -> {

                        result = First?.toInt()!! + Second?.toInt()!!

                        tvResult.text = "Your answer is :-" + result.toString()
                    }
                }
            }

            R.id.btnSub -> {
                when {
                    First!!.isEmpty() -> {
                        Toast.makeText(applicationContext, "Enter a first number", Toast.LENGTH_LONG).show()
                    }
                    Second!!.isEmpty() -> {
                        Toast.makeText(applicationContext, "Enter a second number", Toast.LENGTH_LONG).show()
                    }
                    else -> {
                        result = First?.toInt()!! - Second?.toInt()!!

                        tvResult.text = "Your answer is "+result.toString()
                    }
                }
            }

        }
    }
}



