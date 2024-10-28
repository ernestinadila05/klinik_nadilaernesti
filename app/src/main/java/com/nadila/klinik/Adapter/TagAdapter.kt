package com.nadila.klinik.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nadila.klinik.R
import com.nadila.klinik.model.ModelTag

class TagAdapter(
    val itemList : ArrayList<ModelTag>
) : RecyclerView.Adapter<TagAdapter.MyViewHolder>() {

    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tag : TextView

        init {
            tag = itemView.findViewById(R.id.tag) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_tag, parent, false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tag.setText(itemList[position].tag)
    }

}