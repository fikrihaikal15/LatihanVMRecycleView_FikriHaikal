package com.example.latihanvmrecycleview_fikrihaikal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//class FilmViewModel yang mengextend pada class ViewModel, ViewModel berfungsi untuk memisahkan data
//dari activity yang dibuat, dan menghindari kehilangan data ketika tampilan diubah. contohnya ketika kita merotate hp,
//data yang ada tidak hilang
class FilmViewModel : ViewModel() {
    //pada variable list dengan value ArrayList, dari object data Film
    val list = arrayListOf(
        //disini ada 5 object DataFilm
        DataFilm("Iron Man 3 ","25 April 2013", R.drawable.img_2),
        DataFilm("Jhon Wick: Chapter 4 ","21 Maret 2023", R.drawable.img),
        DataFilm("Avangers: Endgame","24 April 2019", R.drawable.img_1),
        DataFilm("Spider-Man: No Way Home","15 Desember 2021", R.drawable.img_3),
        DataFilm("Jujutsu Kaisen 0","16 Maret 2022", R.drawable.img_4)
    )

    //pada variable filmList yang dideklarasikan sebagai MutableLiveData, dengan tipe data List
    val filmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    //berfungsi untuk mengisi data pada List Film
    fun getFilmList(){
        var film = list
        filmList.value = film
    }
}