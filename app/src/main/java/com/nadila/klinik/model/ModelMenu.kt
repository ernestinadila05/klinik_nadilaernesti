package com.nadila.klinik.model

import com.nadila.klinik.R

data class ModelMenu(
    val gambarMenu : Int,
    val namaMenu : String
)

object ListMenu {
    fun getModel() : List<ModelMenu> {
        val item1 =  ModelMenu(
            R.drawable.eye,
            "Ophthalmologyst"
        )

        val item2 =  ModelMenu(
            R.drawable.heart,
            "Cardiologyst"
        )

        val item3 =  ModelMenu(
            R.drawable.tooth,
            "Dentist"
        )

        val itemList : ArrayList<ModelMenu> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)

        return itemList
    }
}