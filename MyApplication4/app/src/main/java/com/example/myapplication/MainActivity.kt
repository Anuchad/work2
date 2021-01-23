package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ok.setOnClickListener {
            if(username.text.toString() != "" && password.text.toString() != "" && confirm.text.toString() != ""){
                if(username.text.toString() == password.text.toString()){
                    Toast.makeText(applicationContext,"อย่ากรอก Username ตรงกับ Password", Toast.LENGTH_SHORT).show()
                }
                else if(password.text.toString() != confirm.text.toString()){
                    Toast.makeText(applicationContext,"Password ไม่ตรงกัน", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext,"OK", Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(applicationContext,"กรุณากรอกข้อมูลให้ครบถ้วน", Toast.LENGTH_SHORT).show()
            }
        }

        clear.setOnClickListener {
            username.setText("")
            password.setText("")
            confirm.setText("")
            Toast.makeText(applicationContext,"Complete", Toast.LENGTH_SHORT).show()
        }

    }
}