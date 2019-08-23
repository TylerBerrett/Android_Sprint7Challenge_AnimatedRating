package com.example.sprintchallenge3

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.app.Person
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.display_fragment.*

class CreateFragment: DialogFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.display_fragment, container, false)

        add_to_list.setOnClickListener {

        }

        return view
    }
}