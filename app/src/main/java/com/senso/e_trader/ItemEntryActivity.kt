package com.senso.e_trader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_item_entry.*
import kotlinx.android.synthetic.main.header_item.*

class ItemEntryActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_entry)
        setSupportActionBar(toolBar)
        ivHeaderLogo.text=getString(R.string.itemEntry)
        btnSave.setOnClickListener {
            startActivity(Intent(this@ItemEntryActivity,PaymentViewActivity::class.java))
        }
    }
}