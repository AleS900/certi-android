package com.upb.aroundme.data

import com.upb.aroundme.model.City

object CitiesDataSource {
    var departementsList = mutableListOf(
        City(
            nameCity = "La Paz",
            pictureUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/La_Paz_Skyline.jpg/260px-La_Paz_Skyline.jpg"
        ),
        City(
            nameCity = "Santa Cruz",
            pictureUrl = "https://misionaltours.com/timthumb.php?src=https://misionaltours.com/wadm/imagenes/producto/31_05_2019_16_04_42_170716201.png&w=800&h=600&q=100"
        ),
        City(
            nameCity = "Cochabamba",
            pictureUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Cristo_de_La_Concordia.jpg/295px-Cristo_de_La_Concordia.jpg"
        ),
        City(
            nameCity = "Sucre",
            pictureUrl = "https://ilamdir.org/blobs/ilamdir/w1280h720/328/2019/41/elpais.jpg"
        ),
        City(
            nameCity ="Potosi",
            pictureUrl = "https://www.elcolombiano.com/binrepository/733x562/0c0/0d0/none/11101/WVSQ/potosiimagen_37443608_20210329100749.jpg"
        ),
        City(
            nameCity ="Oruro",
            pictureUrl = "https://web.senado.gob.bo/sites/default/files/styles/img-standard__800x600_/public/oruro.jpg?itok=UFHExbem"
        ),
        City(
            nameCity ="Beni",
            pictureUrl = "https://www.noticiasfides.com/images/news/2017/11/c-trinidad-383540-D5A0.jpg"
        ),
        City(
            nameCity ="Pando",
            pictureUrl = "https://boliviaemprende.com/wp-content/uploads/2015/09/pando-cobija.jpg"
        ),
        City(
            nameCity ="Tarija",
            pictureUrl = "https://www.elperiodico-digital.com/wp-content/uploads/2019/04/Actividades-para-la-segunda-semana-del-XXVIII-Festival-de-la-Cultura-1.jpg"
        )
    )

    fun getPostList(): List<City> {
        return departementsList
    }

    fun setPostList(postList: List<City>) {
        this.departementsList = departementsList.toMutableList()
    }

    fun searchPosts(query: String): List<City> {
        return departementsList.filter {
            it.nameCity.toLowerCase().contains(query.toLowerCase())
        }
    }
}