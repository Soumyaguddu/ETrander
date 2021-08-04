package com.senso.e_trader.registration

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ArrayAdapter
import com.senso.e_trader.BaseActivity
import com.senso.e_trader.R
import kotlinx.android.synthetic.main.activity_register_second.*
import kotlinx.android.synthetic.main.header_item.*

class RegisterSecondActivity : BaseActivity() {
    private var identificationList: MutableList<String>? = null
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_second)
        setSupportActionBar(toolBar)
        identificationList= mutableListOf()
        identificationList!!.add("Aadhaar Card")
        identificationList!!.add("Voter Card")
        identificationList!!.add("Driving Licence")
        val adapter = ArrayAdapter<String>(this@RegisterSecondActivity, android.R.layout.simple_dropdown_item_1line, identificationList!!)
        et_identificationCategory.setAdapter(adapter)
        et_identificationCategory.threshold = 0
        et_identificationCategory.setOnTouchListener(View.OnTouchListener { v, event ->

            val DRAWABLE_RIGHT = 2

            if (event!!.action == MotionEvent.ACTION_UP) {
                if (event.rawX >= et_identificationCategory.right - et_identificationCategory.compoundDrawables[DRAWABLE_RIGHT].bounds.width()
                ) {
                    et_identificationCategory.showDropDown()
                    return@OnTouchListener true
                }
            }
            false
        })
    }
}