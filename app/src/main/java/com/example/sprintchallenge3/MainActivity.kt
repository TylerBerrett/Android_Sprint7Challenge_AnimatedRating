package com.example.sprintchallenge3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BlankFragment.OnFragmentInteractionListener {
    val list = ArrayList<CreateItem>()

    override fun onFragmentInteraction(name: String, rating: Float) {
        list.add(CreateItem(name, rating))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recycler_view.adapter = (RecyclerViewItems(list))

        button_add.setOnClickListener {
            val fragment = BlankFragment()
            fragment.show(supportFragmentManager, "tag")
        }
    }
}
