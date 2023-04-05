package com.example.latihanvmrecycleview_fikrihaikal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {
    val list = arrayListOf(
        DataFilm("Iron Man 3 ","25 April 2013", R.drawable.img_2),
        DataFilm("Jhon Wick: Chapter 4 ","21 Maret 2023", R.drawable.img),
        DataFilm("Avangers: Endgame","24 April 2019", R.drawable.img_1),
        DataFilm("Spider-Man: No Way Home","15 Desember 2021", R.drawable.img_3),
        DataFilm("Jujutsu Kaisen 0","16 Maret 2022", R.drawable.img_4)
    )

    val filmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    //berfungsi untuk mengisi data pada List Film
    fun getFilmList(){
        var film = list
        filmList.value = film
    }
}