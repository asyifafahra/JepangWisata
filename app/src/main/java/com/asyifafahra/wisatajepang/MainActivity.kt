package com.asyifafahra.wisatajepang

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.asyifafahra.wisatajepang.adapter.LocationAdapter
import com.asyifafahra.wisatajepang.model.LocationModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Tombol untuk berpindah ke halaman detail
        val buttonDetail: Button = findViewById(R.id.btnSee)
        buttonDetail.setOnClickListener {
            // Intent untuk pindah ke PageBeranda
            val intent = Intent(this@MainActivity, PageBeranda::class.java)
            intent.putExtra("PLACE_NAME", "Sensoji Temple")
            intent.putExtra("PLACE_DESC", "It is Tokyo's oldest temple, and one of the most significant. Formerly associated with the Tendai sect of Buddhism.")
            startActivity(intent)
        }
    }
}
