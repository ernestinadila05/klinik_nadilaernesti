package com.nadila.klinik


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nadila.klinik.Adapter.DokterAdapter
import com.nadila.klinik.Adapter.MenuAdapter
import com.nadila.klinik.Adapter.TagAdapter
import com.nadila.klinik.model.ListDokter
import com.nadila.klinik.model.ListMenu
import com.nadila.klinik.model.ListTag
import com.nadila.klinik.model.ModelDokter
import com.nadila.klinik.model.ModelMenu
import com.nadila.klinik.model.ModelTag
class PageDoctors : AppCompatActivity() {
    private lateinit var rv_dokter : RecyclerView
    private lateinit var rv_tag : RecyclerView
    private lateinit var rv_menu : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_doctors)
        rv_dokter = findViewById(R.id.rv_dokter)
        rv_tag = findViewById(R.id.rv_tag)
        rv_menu = findViewById(R.id.rv_menu)
        rv_dokter.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        rv_tag.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)
        rv_menu.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)
        val adapter = DokterAdapter(ListDokter.getModel() as ArrayList<ModelDokter>)
        val adapter2 = TagAdapter(ListTag.getModel() as ArrayList<ModelTag>)
        val adapter3 = MenuAdapter(ListMenu.getModel() as ArrayList<ModelMenu>)
        rv_dokter.adapter = adapter
        rv_tag.adapter = adapter2
        rv_menu.adapter =  adapter3
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}