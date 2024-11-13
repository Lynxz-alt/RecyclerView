import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycler.view.*
import project.recyclerview.R

class AdapterRecView(private val listWayang: ArrayList<wayang>) :
    RecyclerView.Adapter<AdapterRecView.ListViewHolder>() {

    // ViewHolder untuk mendefinisikan elemen pada item_recycler.xml
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var namaWayang = itemView.findViewById<TextView>(R.id.namaWayang)
        var karakterWayang = itemView.findViewById<TextView>(R.id.karakterWayang)
        var deskripsiWayang = itemView.findViewById<TextView>(R.id.deskripsiWayang)
        var gambarWayang = itemView.findViewById<TextView>(R.id.gambarWayang)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wayang = listWayang[position]
        holder.gambarWayang.text = wayang.foto
        holder.namaWayang.text = wayang.nama
        holder.karakterWayang.text = wayang.karakter
        holder.deskripsiWayang.text = wayang.deskripsi
    }

    override fun getItemCount(): Int = listWayang.size
}