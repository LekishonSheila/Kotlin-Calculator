package com.example.kotlincalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private var canAddOperation = false
    private var canAddDecimal = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    }


    fun numberAction(view:View){

       if(view is Button){
           var workingTV = null
           if(view.text =="."){
//               var workingTV = null
//               if(canAddDecimal)
                   workingTV?.append(view.text)
//               canAddDecimal = false
           }
           else
               workingTV?.append(view.text)
//           canAddOperation = true
       }
    }
    fun operation(view: View){
//        if(view is Button && canAddOperation){
            var workingTV = null
//            workingTV?.append(view.text)
//            canAddOperation = false
        }


    fun allClearAction(view: View){
        var workingTV = null
//        workingTV.text = ""
        var results = null
//        results?.stackTrace.text = ""

    }

    fun backSpaceAction(view: View){
        var workingTV = null
//        val length = workingTV.let()
//        if(length > 0)
//            workingTV.text = workingTV.text.subSequence(0, length-1)
    }
    fun equalIsAction(view: View){
        var resultsTV = null
//        resultsTV.text = calculatorResults()
    }
    private fun calculatorResults():String
    {
     return ""
    }
    private fun digitsOperators():MutableList<Any>{
        val list = mutableListOf<Any>()
        var currentDigit = ""
        var working = null
//        for(character in working)

        return list
    }
