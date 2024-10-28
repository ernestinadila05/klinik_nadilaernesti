package com.nadila.klinik.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nadila.klinik.R
import com.nadila.klinik.model.ModelDokter
class DokterAdapter (
    val itemList : ArrayList<ModelDokter>
) : RecyclerView.Adapter<DokterAdapter.MyViewHolder>() {
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var gambarDokter : ImageView
        var namaDokter : TextView
        var spesialis : TextView
        var jumlahRating : TextView
        var rating : TextView
        init {
            gambarDokter = itemView.findViewById(R.id.gambarDokter) as ImageView
            namaDokter = itemView.findViewById(R.id.namaDokter) as TextView
            spesialis = itemView.findViewById(R.id.spesialis) as TextView
            jumlahRating = itemView.findViewById(R.id.jumlahRating) as TextView
            rating = itemView.findViewById(R.id.rating) as TextView
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doctor, parent, false)
        return MyViewHolder(nView)
    }
    override fun getItemCount(): Int {
        return itemList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gambarDokter.setImageResource(itemList[position].gambarDokter)
        holder.namaDokter.setText(itemList[position].namaDokter)
        holder.spesialis.setText(itemList[position].spesialis)
        holder.jumlahRating.setText(itemList[position].jumlahRating)
        holder.rating.setText(itemList[position].rating)
    }
}