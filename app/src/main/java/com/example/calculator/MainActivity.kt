package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var etNum2:EditText
    lateinit var etNum3:EditText
    lateinit var etNum4:EditText
    lateinit var etNum5:EditText
    lateinit var btnSubtract:Button
    lateinit var btnAdd:Button
    lateinit var btnMulti:Button
    lateinit var btnDiv:Button
    lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        castViews()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun castViews(){
        etNum1=findViewById(R.id.etNum1)
        etNum2=findViewById(R.id.etNum2)
        etNum3=findViewById(R.id.etNum3)
        etNum4=findViewById(R.id.etNum4)
        etNum5=findViewById(R.id.etNum5)
        btnAdd=findViewById(R.id.btnAdd)
        btnMulti=findViewById(R.id.btnMulti)
        btnDiv=findViewById(R.id.btnDiv)
        btnSubtract=findViewById(R.id.btnSubtract)
        tvResult=findViewById(R.id.tvResult)
    }

    override fun onResume() {
        super.onResume()
        btnAdd.setOnClickListener{
            var num1=etNum1.text.toString()
            var num2=etNum2.text.toString()
            var num3=etNum3.text.toString()
            var num4=etNum4.text.toString()
            var num5=etNum5.text.toString()
            var sum=num1.toInt()+num2.toInt()+num3.toInt()+num4.toInt()+num5.toInt()
            tvResult.text=sum.toString()

        }
        btnSubtract.setOnClickListener(){
            var num1=etNum1.text.toString()
            var num2=etNum2.text.toString()
            var num3=etNum3.text.toString()
            var num4=etNum4.text.toString()
            var num5=etNum5.text.toString()
            var subtract=num1.toInt()-num2.toInt()-num3.toInt()-num4.toInt()-num5.toInt()
            tvResult.text=subtract.toString()
        }
        btnDiv.setOnClickListener(){
            var num1=etNum1.text.toString()
            var num2=etNum2.text.toString()
            var num3=etNum3.text.toString()
            var num4=etNum4.text.toString()
            var num5=etNum5.text.toString()
            var division=num1.toInt()/num2.toInt()/num3.toInt()/num4.toInt()/num5.toInt()
            tvResult.text=division.toString()
        }
        btnMulti.setOnClickListener(){
            var num1=etNum1.text.toString()
            var num2=etNum2.text.toString()
            var num3=etNum3.text.toString()
            var num4=etNum4.text.toString()
            var num5=etNum5.text.toString()
            var multi=num1.toInt()*num2.toInt()*num3.toInt()*num4.toInt()*num5.toInt()
            tvResult.text=multi.toString()
        }

    }
}