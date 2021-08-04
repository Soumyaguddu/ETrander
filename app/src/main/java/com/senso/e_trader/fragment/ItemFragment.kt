package com.senso.e_trader.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.senso.e_trader.ItemEntryActivity
import com.senso.e_trader.R
import kotlinx.android.synthetic.main.fragment_item.*
import kotlinx.android.synthetic.main.header_item.*


class ItemFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivHeaderLogo.text=getString(R.string.itemDetials)
        btnBook.setOnClickListener {
            startActivity(Intent(requireContext(),ItemEntryActivity::class.java))
        }
    }

}