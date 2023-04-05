package com.example.latihanvmrecycleview_fikrihaikal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(var listFilm : ArrayList<DataFilm>) : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
        var nameJudul = itemView.findViewById<TextView>(R.id.judulName)
        var tglLiris = itemView.findViewById<TextView>(R.id.tglFilm)
        var img = itemView.findViewById<ImageView>(R.id.filmImg)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_film,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        var data = listFilm[position]
        holder.nameJudul.text = data.nameJudul
        holder.tglLiris.text = data.tglLiris
        holder.img.setImageResource(data.img)
    }

    //menghitung data pada ListFilm
    override fun getItemCount(): Int {
       return listFilm.size
    }

    fun setFilmData(listFilm: ArrayList<DataFilm>){
        this.listFilm=listFilm
    }


}