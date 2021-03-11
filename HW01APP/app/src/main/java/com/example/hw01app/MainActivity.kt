package com.example.hw01app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.String


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var  order = findViewById<TextView>(R.id.order);
        var  NS = findViewById(R.id.NS) as RadioButton;
        var  SS = findViewById(R.id.SS) as RadioButton;
        var  HS = findViewById(R.id.HS) as RadioButton;
        var  FS = findViewById(R.id.FS) as RadioButton;
        var  NI = findViewById(R.id.NI) as RadioButton;
        var  LI = findViewById(R.id.LI) as RadioButton;
        var  SI = findViewById(R.id.SI) as RadioButton;
        var  FI = findViewById(R.id.FI) as RadioButton;
        var  btn = findViewById(R.id.sumit) as Button;
        btn.setOnClickListener {
            if(NS.isChecked){
                order.text = "甜度: ${NS.text} "
                if(NI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${NI.text}"
                else if(LI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${LI.text}"
                else if(SI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${SI.text}"
                else if(FI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${FI.text}"
                else
                    order.text = "請選擇冰塊"
            }
            else if(SS.isChecked){
                order.text = "甜度: ${SS.text} "
                if(NI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${NI.text}"
                else if(LI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${LI.text}"
                else if(SI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${SI.text}"
                else if(FI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${FI.text}"
                else
                    order.text = "請選擇冰塊"
            }
            else if(HS.isChecked){
                order.text = "甜度: ${HS.text} "
                if(NI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${NI.text}"
                else if(LI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${LI.text}"
                else if(SI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${SI.text}"
                else if(FI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${FI.text}"
                else
                    order.text = "請選擇冰塊"
            }
            else if(FS.isChecked){
                order.text = "甜度: ${FS.text} "
                if(NI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${NI.text}"
                else if(LI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${LI.text}"
                else if(SI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${SI.text}"
                else if(FI.isChecked)
                    order.text = order.text.toString() + "冰塊: ${FI.text}"
                else
                    order.text = "請選擇冰塊"
            }
            else
                order.text = "請選擇甜度"

        }
    }
}