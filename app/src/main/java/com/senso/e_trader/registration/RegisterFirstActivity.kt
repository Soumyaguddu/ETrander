package com.senso.e_trader.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.senso.e_trader.BaseActivity
import com.senso.e_trader.R
import kotlinx.android.synthetic.main.activity_register_first.*
import kotlinx.android.synthetic.main.header_item.*

class RegisterFirstActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_first)
        setSupportActionBar(toolBar)
        btnRegisterFirst.setOnClickListener {
            startActivity(Intent(this@RegisterFirstActivity,RegisterSecondActivity::class.java))
        }
    }
}