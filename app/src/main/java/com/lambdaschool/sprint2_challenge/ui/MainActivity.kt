package com.lambdaschool.sprint2_challenge.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.lambdaschool.sprint2_challenge.R
import com.lambdaschool.sprint2_challenge.model.ShoppingItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var shoppingList = mutableListOf<ShoppingItem>()


        rv_layout.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ImageListAdapter(ivList)
        rv_layout.layoutManager = manager
        rv_layout.adapter = adapter

    }
}
