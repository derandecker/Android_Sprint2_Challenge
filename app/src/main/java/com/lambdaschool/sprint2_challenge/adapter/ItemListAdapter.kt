package com.lambdaschool.sprint2_challenge.adapter

import android.content.ClipData
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.recycler_cardview_layout.view.*

class ItemListAdapter(val imageList: MutableList<Int>, val itemNameList: MutableList<String>)
    : RecyclerView.Adapter<ItemListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val image: ImageView = view.iv_shopping_item
        val itemName: TextView = view.tv_shopping_item
    }


}