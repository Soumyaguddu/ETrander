package com.senso.e_trader.fragment

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.senso.e_trader.*
import kotlinx.android.synthetic.main.fragment_item_entry.*
import kotlinx.android.synthetic.main.header_item.*


class ItemEntryFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item_entry, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivHeaderLogo.text=getString(R.string.itemEntry)
        fbAddProduct.setOnClickListener {
            startActivity(Intent(activity,AddNewProductActivity::class.java))
        }
    }



}