package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var edit1: EditText
    lateinit var edit2: EditText
    lateinit var btnM: Button
    lateinit var btnD: Button
    lateinit var btnA: Button
    lateinit var btnS: Button
    lateinit var ResultTv: TextView


//    var First: String? = null
//    var Second: String? = null
//    var result: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initview()


    }

    fun initview(){
        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        btnM = findViewById(R.id.btnM)
        btnD = findViewById(R.id.btnD)
        btnA = findViewById(R.id.btnA)
        btnS = findViewById(R.id.btnS)
        ResultTv = findViewById(R.id.ResultTv)



        clicklisterner()
    }

    fun clicklisterner(){
        btnM.setOnClickListener(this)
        btnD.setOnClickListener(this)
        btnA.setOnClickListener(this)
        btnS.setOnClickListener(this)
    }


    val message = "enter a number"
    fun msg () {
         return Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }



    override fun onClick(v: View?) {

        when (v?.id) {
               R.id.btnA->{
                   val First = edit1.text.toString()
                   val Second = edit2.text.toString()
                   ResultTv.text=add(First.toInt(), Second.toInt()).toString()
               }

            R.id.btnS->{
                val First = edit1.text.toString()
                val Second = edit2.text.toString()
                ResultTv.text=Sub(First.toInt(), Second.toInt()).toString()
            }

            R.id.btnM->{
                val First = edit1.text.toString()
                val Second = edit2.text.toString()
                ResultTv.text=Multi(First.toInt(), Second.toInt()).toString()
            }


            R.id.btnD->{
                val First = edit1.text.toString()
                val Second = edit2.text.toString()
                ResultTv.text=Div(First.toInt(), Second.toInt()).toString()
            }

        }
    }

    fun add ( num1:Int, num2 : Int):Int{
        val result = num1+num2
        return result
    }
    fun Sub(num1: Int,num2: Int):Int{
        val result = num1-num2
        return result
    }
    fun Multi(num1: Int,num2: Int):Int{
        val result = num1*num2
        return result
    }

    fun Div(num1: Int,num2: Int):Int{
        val result = num1*num2
        return result
    }
}



