package com.himanshu.calculator

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.himanshu.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var num1 = "0"
    private var num2 = "0"
    private var dispStr = ""
    private var opr = "+"
    private var operatorClicked = false
    private var decimalClicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.one.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "1"
                }
                num1 += "1"

            }
            else{
                if(num2 == "0"){
                    num2 = "1"
                }
                num2 += "1"
            }
            dispStr += 1
        }

        binding.two.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "2"
                }
                num1 += "2"
            }
            else{
                if(num2 == "0"){
                    num2 = "2"
                }
                num2 += "2"
            }
        }

        binding.three.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "3"
                }
                num1 += "3"
            }
            else{
                if(num2 == "0"){
                    num2 = "3"
                }
                num2 += "3"
            }
        }

        binding.four.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "4"
                }
                num1 += "4"
            }
            else{
                if(num2 == "0"){
                    num2 = "4"
                }
                num2 += "4"
            }
        }

        binding.five.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "5"
                }
                num1 += "5"
            }
            else{
                if(num2 == "0"){
                    num2 = "5"
                }
                num2 += "5"
            }
        }

        binding.six.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "6"
                }
                num1 += "6"
            }
            else{
                if(num2 == "0"){
                    num2 = "6"
                }
                num2 += "6"
            }
        }

        binding.seven.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "7"
                }
                num1 += "7"
            }
            else{
                if(num2 == "0"){
                    num2 = "7"
                }
                num2 += "7"
            }
        }

        binding.eight.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "8"
                }
                num1 += "8"
            }
            else{
                if(num2 == "0"){
                    num2 = "8"
                }
                num2 += "8"
            }
        }

        binding.nine.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "9"
                }
                num1 += "9"
            }
            else{
                if(num2 == "0"){
                    num2 = "9"
                }
                num2 += "9"
            }
        }

        binding.zero.setOnClickListener {
            if (!operatorClicked) {
                if(num1 == "0"){
                    num1 = "0"
                }
                num1 += "0"
            }
            else{
                if(num2 == "0"){
                    num2 = "0"
                }
                num2 += "0"
            }
        }
        binding.decimal.setOnClickListener {
            decimalClicked = true
        }

        binding.plus.setOnClickListener {
            operatorClicked = true
            opr = "+"
        }
        binding.minus.setOnClickListener {
            operatorClicked = true
            opr = "-"
        }
        binding.multiply.setOnClickListener {
            opr = "*"
        }
        binding.divide.setOnClickListener {
            operatorClicked = true
            opr = "/"
        }
        binding.equals.setOnClickListener {
            binding.result.text = calculate(num1.toFloat(),num2.toFloat(),opr)
        }
    }

    private fun calculate(num1:Float,num2:Float,opr:String): String {
        var result = 0f
        when(opr){
            "+"->{
                result = num1+num2
            }
            "-"->{
                result = num1-num2
            }
            "*"->{
                result = num1*num2
            }
            "/"->{
                result = num1/num2
            }
        }
        return result.toString()
    }
}