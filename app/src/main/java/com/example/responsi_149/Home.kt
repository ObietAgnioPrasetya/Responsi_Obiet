package com.example.responsi_149

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()
        Akun.setOnClickListener {
            intent = Intent(this, Akun::class.java)
            startActivity(intent)
        }

        list.add(Model("", "",R.drawable.asiap))
        list.add(Model("REALME 2", "Ialah produk keluaran Realme", R.drawable.realme2))
        list.add(Model("REALME 2 PRO", "Ialah produk keluaran Realme", R.drawable.realme2pro))
        list.add(Model("REALME 3", "Ialah produk keluaran Realme", R.drawable.realme3))
        list.add(Model("REALME 3 PRO", "Ialah produk keluaran Realme", R.drawable.realme3pro))
        list.add(Model("REALME 5", "Ialah produk keluaran Realme", R.drawable.realme5))
        list.add(Model("REALME 5 PRO", "Ialah produk keluaran Realme", R.drawable.realme5pro))
        list.add(Model("REALME C1", "Ialah produk keluaran Realme", R.drawable.realmec1))
        list.add(Model("REALME C2", "Ialah produk keluaran Realme", R.drawable.realmec2))
        list.add(Model("REALME C3", "Ialah produk keluaran Realme", R.drawable.realmec3))
        list.add(Model("REALME X", "Ialah produk keluaran Realme", R.drawable.realmex))

        listView.adapter = ListAdapter(this,R.layout.anjay,list)
        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@Home, "",   Toast.LENGTH_LONG).show()
            }
            if (position==1){
                Toast.makeText(this@Home, "Ini Realme 2",   Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@Home, "Ini Realme 2 Pro", Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@Home, "Ini Realme 3",  Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@Home, "Ini Realme 3 Pro",  Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this@Home, "Ini Realme 5",  Toast.LENGTH_LONG).show()
            }
            if (position==6){
                Toast.makeText(this@Home, "Ini Realme 5 Pro",  Toast.LENGTH_LONG).show()
            }
            if (position==7){
                Toast.makeText(this@Home, "Ini Realme C1",  Toast.LENGTH_LONG).show()
            }
            if (position==8){
                Toast.makeText(this@Home, "Ini Realme C2",  Toast.LENGTH_LONG).show()
            }
            if (position==9){
                Toast.makeText(this@Home, "Ini Realme C3",  Toast.LENGTH_LONG).show()

            }
            if (position==10){
                Toast.makeText(this@Home, "Ini Realme X",   Toast.LENGTH_LONG).show()
            }
        }
    }
}
