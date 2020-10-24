package id.fahtul.seminar2410bisaai

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_modul.view.*

class NamaModulAdapter(private val activity: Activity, private val itemModul : Array<String>) : RecyclerView.Adapter<NamaModulAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_modul,parent,false)
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int = itemModul.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.txtNamaFile.text = itemModul[position]

        holder.itemView.setOnClickListener {
            val intent = Intent(activity, PDFViewActivity::class.java)
            intent.putExtra("NAMAFILE", itemModul[position])
            activity.startActivity(intent)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}