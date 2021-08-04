package com.senso.e_trader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.senso.e_trader.registration.RegisterFirstActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_login.setOnClickListener {
            if (et_mobile.text.toString() == "User") {
                startActivity(Intent(this@LoginActivity, DashBoardSecondActivity::class.java))
            } else {
                startActivity(Intent(this@LoginActivity, DashBoardActivity::class.java))
            }

        }
        sign_up.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterFirstActivity::class.java))
        }
    }
}