package com.senso.e_trader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.senso.e_trader.R
import kotlinx.android.synthetic.main.header_item.*

class AddNewProductActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_product)
        setSupportActionBar(toolBar)
        ivHeaderLogo.text = getString(R.string.addProduct)
    }
}