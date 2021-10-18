package com.upb.aroundme.data

import com.upb.aroundme.model.PlacesToVisit

object LaPazPlacesDataSource {
    private var  laPazPlacesList = mutableListOf(
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Valle de la Luna",
            urlImage = "https://www.laregion.bo/wp-content/uploads/2017/06/Noticias02.jpg",
            placeDescription = "El Valle de la Luna se encuentra a unos 5 kilómetros de La Paz, Bolivia. El paisaje está formado por formaciones rocosas, lo que da una extraña sensación de estar en otro planeta o en la luna.",
            likeCont = 270
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Basílica de San Francisco",
            urlImage = "https://www.ibolivia.org/wp-content/uploads/2019/07/basilica-de-san-francisco-la-paz.jpg",
            placeDescription = "La basílica de piedra labrada de San Francisco en La Paz, Bolivia, refleja una atractiva mezcla de tendencias españolas y mestizas (indígenas-españolas) del siglo XVI.",
            likeCont = 225
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Calle Jaen",
            urlImage = "https://media.tacdn.com/media/attractions-splice-spp-674x446/0b/27/74/25.jpg",
            placeDescription = "La Calle Jaén es la mejor calle colonial de La Paz, y los 10 museos que posee se pueden visitados fácilmente en una sola visita.",
            likeCont = 200
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Parque Zoológico Municipal Vesty Pakos Sofro",
            urlImage = "https://lapaz.bolivialocal.net/imagen/e/2017/2/i151/parque-zoologico-municipal-paz-6-mx.jpg",
            placeDescription = "Ubicado en la zona de Mallasa a 14 km del centro paceño, tiene un área de 22.4 hectáreas y un clima templado ideal para la conservación de la fauna.",
            likeCont = 180
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Illimani",
            urlImage = "https://elpotosi.net/img/contents/images_980/2016/11/25/nota27268_imagen24517.jpg",
            placeDescription = "Illimani es el pico más alto (6.438 metros) en la Cordillera Real del oeste de Bolivia. ",
            likeCont = 175
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Casa Murillo",
            urlImage = "https://media-cdn.tripadvisor.com/media/photo-s/11/83/41/a1/caption.jpg",
            placeDescription = "Una vez hogar de Don Pedro Domingo Murillo, líder de la Revolución de La Paz del 16 de julio de 1809, en Bolivia, la Casa de Murillo exhibe colecciones de arte y muebles coloniales, textiles, medicinas, instrumentos musicales y artículos para el hogar de vidrio y plata. ",
            likeCont = 125
        ),
        PlacesToVisit(
            cityName = "Cochabamba",
            placeName = "Museo De La Coca",
            urlImage = "https://a.travel-assets.com/findyours-php/viewfinder/images/res40/65000/65275-Museo-De-La-Coca.jpg",
            placeDescription = "El Museo de la Coca en La Paz,  explora el papel de la hoja sagrada en las sociedades tradicionales.",
            likeCont = 125
        )
    )

    fun getPlacesList(): List<PlacesToVisit>{
        return laPazPlacesList
    }

    fun setPlacesList(laPazPlacesList: List<PlacesToVisit>){
        this.laPazPlacesList = laPazPlacesList.toMutableList()
    }

    fun getPlaceListForCity(city : String): List<PlacesToVisit>{
        return laPazPlacesList.filter {
            it.cityName.toLowerCase().equals(city.toLowerCase())
        }
    }
}