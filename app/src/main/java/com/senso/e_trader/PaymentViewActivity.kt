package com.senso.e_trader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_payment_view.*
import kotlinx.android.synthetic.main.header_item.*

class PaymentViewActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_view)
        setSupportActionBar(toolBar)
        ivHeaderLogo.text=getString(R.string.paymentMethod)
        btnPaymentDefaultNext.setOnClickListener {
            startActivity(Intent(this@PaymentViewActivity,DashBoardActivity::class.java))
        }
    }
}