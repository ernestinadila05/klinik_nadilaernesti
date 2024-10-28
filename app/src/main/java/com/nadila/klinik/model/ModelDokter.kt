package com.nadila.klinik.model

import com.nadila.klinik.R

data class ModelDokter(
    val gambarDokter : Int,
    val namaDokter : String,
    val spesialis : String,
    val jumlahRating : String,
    val rating : String
)

object ListDokter {
    fun getModel() : List<ModelDokter> {
        val item1 = ModelDokter (
            R.drawable.dokter1,
            "Dr. Andi Setiawan",
            "Spesialis Jantung",
            "(150)",
            "4.8"
        )

        val item2 = ModelDokter (
            R.drawable.dokter3,
            "Dr. Budi Pratama",
            "Spesialis Bedah Umum",
            "(200)",
            "4.6"
        )

        val item3 = ModelDokter (
            R.drawable.dokter4,
            "Dr. Siti Nurhayati",
            "Spesialis Anak",
            "(180)",
            "4.9"
        )

        val item4 = ModelDokter (
            R.drawable.dokter5,
            "Dr. Intan Puspita",
            "Spesialis Kulit dan Kelamin",
            "(120)",
            "4.9"
        )

        val item5 = ModelDokter (
            R.drawable.dokter6,
            "Dr. Rina Hartini",
            "Spesialis Gigi",
            "(170)",
            "4.5"
        )

        val itemList : ArrayList<ModelDokter> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)

        return itemList
    }
}