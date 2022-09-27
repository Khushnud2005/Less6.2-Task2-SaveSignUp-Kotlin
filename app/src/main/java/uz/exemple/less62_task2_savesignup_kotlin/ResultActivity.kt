package uz.exemple.less62_task2_savesignup_kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    lateinit var tv_fullName: TextView
    lateinit var tv_email:TextView
    lateinit var tv_password:TextView
    lateinit var tv_cpassword:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        initViews()
    }

    fun initViews() {
        tv_fullName = findViewById(R.id.tv_myName)
        tv_email = findViewById(R.id.tv_myEmail)
        tv_password = findViewById(R.id.tv_myPassword)
        tv_cpassword = findViewById(R.id.tv_myConfPassword)

        tv_fullName.setText(PrefsManager.getInstance(this)!!.loadData("fullName"))
        tv_email.setText(PrefsManager.getInstance(this)!!.loadData("email"))
        tv_password.setText(PrefsManager.getInstance(this)!!.loadData("password"))
        tv_cpassword.setText(PrefsManager.getInstance(this)!!.loadData("cpassword"))
    }
}