package com.example.uts1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.detail_fakultas.view.imageList
import kotlinx.android.synthetic.main.list.view.*

class fakultasAdapter(val listFakultas: List<Fakultas>, val clickListener: (Fakultas) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater. inflate(R.layout.list, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(listFakultas[position], clickListener)
    }

    override fun getItemCount() = listFakultas.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: Fakultas, clickListener: (Fakultas) -> Unit) {
            itemView.imageList.setImageResource(data.image)
            itemView.listFakultas.text = data.name
            itemView.setOnClickListener{clickListener(data)}
        }
    }
}
