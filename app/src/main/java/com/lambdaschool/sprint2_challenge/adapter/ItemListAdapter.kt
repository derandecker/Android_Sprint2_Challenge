package com.lambdaschool.sprint2_challenge.adapter

import android.content.ClipData
import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat.getDrawable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import com.lambdaschool.sprint2_challenge.R
import com.lambdaschool.sprint2_challenge.model.ShoppingItem
import com.lambdaschool.sprint2_challenge.ui.MainActivity
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.recycler_cardview_layout.view.*

class ItemListAdapter(val imageList: IntArray, val itemNameList: Array<String>)
    : RecyclerView.Adapter<ItemListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.iv_shopping_item
        val itemName: TextView = view.tv_shopping_item
        val toggle: Switch = view.switch_toggle_item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.recycler_cardview_layout, parent, false)
        return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = getDrawable(holder.image.context, imageList[position])
        holder.image.setImageDrawable(image)
        holder.itemName.text = itemNameList[position]
        holder.toggle.setOnClickListener {
            when (holder.toggle.isChecked) {
                true -> MainActivity.shoppingList.add(itemNameList[position])
                false -> MainActivity.shoppingList.remove(itemNameList[position])
            }

        }


    }


}