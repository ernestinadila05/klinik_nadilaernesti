package com.nadila.klinik.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nadila.klinik.R
import com.nadila.klinik.model.ModelMenu
class MenuAdapter(
    val itemList : ArrayList<ModelMenu>
) : RecyclerView.Adapter<MenuAdapter.MyViewHolder>() {
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var gambarMenu : ImageView
        var namaMenu : TextView
        init {
            gambarMenu = itemView.findViewById(R.id.gambarMenu) as ImageView
            namaMenu = itemView.findViewById(R.id.namaMenu) as TextView
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_icon, parent, false)
        return MyViewHolder(nView)
    }
    override fun getItemCount(): Int {
        return itemList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gambarMenu.setImageResource(itemList[position].gambarMenu)
        holder.namaMenu.setText(itemList[position].namaMenu)
    }
}