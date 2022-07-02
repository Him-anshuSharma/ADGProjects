package com.himanshu.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.himanshu.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    private var expression: String = ""
    private var num1: Float = 0f
    private var num2: Float = 0f
    private var operator: String = ""
    private var operatorPressed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.bclear.setOnClickListener {
            expression = ""
            binding.result.text = "0"
            num1=0f
            num2=0f
            operatorPressed=false
        }

        binding.b0.setOnClickListener {
            if(operatorPressed){
                num2 *= 10
            }
            else{
                num1 *= 10
            }
            expression += "0"
            binding.result.text = expression
        }
        binding.b1.setOnClickListener {
            if(operatorPressed){
                num2 = num2*10+1
            }
            else{
                num1 = num1*10+1
            }
            expression += "1"
            binding.result.text = expression
        }
        binding.b2.setOnClickListener {
            if(operatorPressed){
                num2 = num2*10+2
            }
            else{
                num1 = num1*10+2
            }
            expression += "2"
            binding.result.text = expression
        }
        binding.b3.setOnClickListener {
            if(operatorPressed){
                num2 = num2*10+3
            }
            else{
                num1 = num1*10+3
            }
            expression += "3"
            binding.result.text = expression
        }
        binding.b4.setOnClickListener {
            if(operatorPressed){
                num2 = num2*10 + 4
            }
            else num1 = num1*10 + 4
            expression += "4"
            binding.result.text = expression
        }
        binding.b5.setOnClickListener {
            if(operatorPressed){
                num2 = num2*10 + 5
            }
            else{
                num1 = num1*10 + 5
            }
            expression += "5"
            binding.result.text = expression
        }
        binding.b6.setOnClickListener {
            if(operatorPressed){
                num2 = num2*10 + 6
            }
            else{
                num1 = num1*10 + 6
            }
            expression += "6"
            binding.result.text = expression
        }
        binding.b7.setOnClickListener {
            if(operatorPressed){
                num2 = num2*10 + 7
            }
            else{
                num1 = num1*10 + 7
            }
            expression += "7"
            binding.result.text = expression
        }
        binding.b8.setOnClickListener {
            if(operatorPressed){
                num2 = num2*10 + 8
            }
            else{
                num1 = num1*10 + 8
            }
            expression += "8"
            binding.result.text = expression
        }
        binding.b9.setOnClickListener {
            if(operatorPressed){
                num2 = num2*10 + 9
            }
            else{
                num1 = num1*10 + 9
            }
            expression += "9"
            binding.result.text = expression
        }
        binding.bplus.setOnClickListener {
            operatorPressed = true
            operator = "+"
            expression += " + "
            binding.result.text = expression
        }
        binding.bminus.setOnClickListener {
            operatorPressed = true
            operator = "-"
            expression += " - "
            binding.result.text = expression
        }
        binding.bx.setOnClickListener {
            operatorPressed = true
            operator = "x"
            expression += " x "
            binding.result.text = expression
        }
        binding.bdivide.setOnClickListener {
            operatorPressed = true
            operator = "/"
            expression += " / "
            binding.result.text = expression
        }
        binding.bequals.setOnClickListener {
            if(operatorPressed){
                when(operator){
                    "+"->{
                        expression = (num1+num2).toString()
                        binding.result.text = expression
                        num1 += num2
                        num2 = 0f
                        operatorPressed = false
                    }
                    "-"->{
                        expression = (num1-num2).toString()
                        binding.result.text = expression
                        num1 -= num2
                        num2 = 0f
                        operatorPressed = false
                    }
                    "x"->{
                        expression = (num1*num2).toString()
                        binding.result.text = expression
                        num1 *= num2
                        num2 = 0f
                        operatorPressed = false
                    }
                    "/"->{
                        expression = (num1/num2).toString()
                        binding.result.text = expression
                        num1 /= num2
                        num2 = 0f
                        operatorPressed = false
                    }
                }
            }
        }
    }
}