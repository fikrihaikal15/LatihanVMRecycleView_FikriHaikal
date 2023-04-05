package com.example.latihanvmrecycleview_fikrihaikal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rvFilm : RecyclerView
    lateinit var filmVm : FilmViewModel
    lateinit var filmAdapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFilm()
        filmVm = ViewModelProvider(this).get(FilmViewModel::class.java)

        filmVm.getFilmList()
        filmVm.filmList.observe(this, Observer {
            filmAdapter.setFilmData(it as ArrayList<DataFilm>)
        })
    }

    private fun initFilm() {
        rvFilm = findViewById(R.id.rvFilm)
        filmAdapter = FilmAdapter(ArrayList())
//        rvFilm.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
       rvFilm.layoutManager = GridLayoutManager(this,2)
        rvFilm.adapter = filmAdapter
    }

    fun setDataFilm(){

    }
}