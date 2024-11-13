package project.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dataset
        val listWayang = arrayListOf(
            ListWayang(R.drawable.wayang1, "Wayang 1", "Karakter 1", "Deskripsi 1"),
            ListWayang(R.drawable.wayang2, "Wayang 2", "Karakter 2", "Deskripsi 2"),
            ListWayang(R.drawable.wayang3, "Wayang 3", "Karakter 3", "Deskripsi 3")
        )

        // RecyclerView
        rvWayang.layoutManager = LinearLayoutManager(this)
        rvWayang.adapter = AdapterRecyclerView(listWayang)
    }
}
