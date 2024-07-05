package com.example.registration

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf <Item>()

        items.add(Item(1,"https://furman.top/uploads/posts/2023-05/1682897790_furman-top-p-dyuna-oboi-na-rabochii-stol-krasivo-44.jpg", "Dune","13 july",300, "" ))
        items.add(Item(2,"https://i.ytimg.com/vi/h0NldXVOL-U/maxresdefault.jpg", "Pirates of the Caribbean","17 july",350, ""))
        items.add(Item(3,"https://pp.cdn-img.wwtfm.ru/src/product/255327890101/full/255327890101_1.jpg", "Attack on Titan","1 august",180, ""))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsApadter(items, this)
    }
}