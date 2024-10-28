package com.nadila.klinik.model

data class ModelTag(
    val tag : String
)

object ListTag {
    fun getModel() : List<ModelTag> {
        val item1 = ModelTag (
            "#health"
        )

        val item2 = ModelTag (
            "#doctor"
        )

        val item3 = ModelTag (
            "#medicine"
        )

        val item4 = ModelTag (
            "#nutrition"
        )

        val item5 = ModelTag (
            "#vaccine"
        )

        val item6 = ModelTag (
            "#wellness"
        )

        val item7 = ModelTag (
            "#mentalhealth"
        )

        val item8 = ModelTag (
            "#pediatrics"
        )

        val item9 = ModelTag (
            "#dermatology"
        )

        val item10 = ModelTag (
            "#emergency"
        )

        val item11 = ModelTag (
            "#firstaid"
        )

        val item12 = ModelTag (
            "#physiotherapy"
        )

        val item13 = ModelTag (
            "#rehab"
        )

        val item14 = ModelTag (
            "#surgery"
        )

        val item15 = ModelTag (
            "#dentistry"
        )

        val item16 = ModelTag (
            "#teeth"
        )

        val item17 = ModelTag (
            "#surgeon"
        )

        val item18 = ModelTag (
            "#eyes"
        )

        val item19 = ModelTag (
            "#mouth"
        )

        val itemList : ArrayList<ModelTag> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        itemList.add(item7)
        itemList.add(item8)
        itemList.add(item9)
        itemList.add(item10)
        itemList.add(item11)
        itemList.add(item12)
        itemList.add(item13)
        itemList.add(item14)
        itemList.add(item15)
        itemList.add(item16)
        itemList.add(item17)
        itemList.add(item18)
        itemList.add(item19)

        return itemList
    }
}