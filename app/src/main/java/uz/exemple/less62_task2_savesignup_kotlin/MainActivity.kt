package uz.exemple.less62_task2_savesignup_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var et_fullName: EditText
    lateinit var et_email:EditText
    lateinit var et_password:EditText
    lateinit var et_cpassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        et_fullName = findViewById(R.id.et_fullNameSU)
        et_email = findViewById(R.id.et_emailSU)
        et_password = findViewById(R.id.et_passwordSU)
        et_cpassword = findViewById(R.id.et_cpasswordSU)
        val btn_signUp = findViewById<Button>(R.id.btn_signUp)

        btn_signUp.setOnClickListener { v ->
            val email = et_email.text.toString().trim { it <= ' ' }
            val fullName = et_fullName.text.toString().trim { it <= ' ' }
            val password = et_password.text.toString().trim { it <= ' ' }
            val cpassword = et_cpassword.text.toString().trim { it <= ' ' }

            PrefsManager.getInstance(v.context)!!.saveData("fullName", fullName)
            PrefsManager.getInstance(v.context)!!.saveData("email", email)
            PrefsManager.getInstance(v.context)!!.saveData("password", password)
            PrefsManager.getInstance(v.context)!!.saveData("cpassword", cpassword)

            openResult()
        }
    }

    fun openResult() {
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }
}