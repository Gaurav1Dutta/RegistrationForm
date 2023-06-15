package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var regEmail: EditText
    lateinit var regPassword: EditText
    lateinit var regPhone: EditText
    lateinit var regOthers: RadioButton
    lateinit var regMale: RadioButton
    lateinit var regFemale: RadioButton
    lateinit var btnRegister: Button
    lateinit var radioGroup: RadioGroup
    lateinit var regG: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        regEmail = findViewById(R.id.regEmail)
        regPassword = findViewById(R.id.regPassword)
        regPhone = findViewById(R.id.regPhone)
        btnRegister = findViewById(R.id.btnRegister)
        radioGroup = findViewById(R.id.radioGroup)
        regMale = findViewById(R.id.r_male)
        regFemale = findViewById(R.id.r_female)
        regOthers = findViewById(R.id.r_others)
        regG = findViewById(R.id.regG)

        btnRegister.setOnClickListener {
            if (regEmail.text.toString().isEmpty()) {
                regEmail.error = "Enter Your Email id"
            } else if (regPhone.text.toString().length < 10) {
                regPhone.error = "Phone Number Length is Short"
            } else if (regPhone.text.toString().isEmpty()) {
                regPhone.error = "Enter Your Mob. No."
            } else if (regPassword.text.toString().isEmpty()) {
                regPassword.error = "Enter your Password"
            } else if (regPassword.text.toString().length < 6) {
                regPassword.error = "Password Length is Short"
            } else radioGroup.setOnCheckedChangeListener { _, checkedId ->

                    if (checkedId == R.id.r_male) {
                        regG.visibility = View.GONE
                    } else if (checkedId == R.id.r_female) {
                        regG.visibility = View.GONE
                    } else if (checkedId == R.id.r_others) {
                        regG.visibility = View.VISIBLE}
                        if (regG.text.toString().isEmpty())
                            regG.error = "Enter Your Gender"
                else {
                Toast.makeText(this, "Register Successfully", Toast.LENGTH_SHORT).show()
            }

                    }
                }
            }

            }


