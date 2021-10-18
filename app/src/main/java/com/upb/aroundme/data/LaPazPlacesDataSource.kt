package com.upb.aroundme.data

import com.upb.aroundme.model.PlacesToVisit

object LaPazPlacesDataSource {
    private var  laPazPlacesList = mutableListOf(
        // La Paz
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Valle de la Luna",
            urlImage = "https://www.laregion.bo/wp-content/uploads/2017/06/Noticias02.jpg",
            placeDescription = "El Valle de la Luna se encuentra a unos 5 kilómetros de La Paz, Bolivia. El paisaje está formado por formaciones rocosas, lo que da una extraña sensación de estar en otro planeta o en la luna.",
            information = "Se trata de un atractivo natural de gran belleza, cuyos principales autores son el agua y el viento que, a través de sus efectos erosivos del terreno, crearon caprichosas formaciones de cono y cráteres que se asemejan a un paisaje lunar. En las montañas de alrededor de La Paz, la arcilla contiene minerales diferentes que las dota de colores variados, pasando del blanquecino al violeta con los más habituales marrones y rojizos.",
            likeCont = 270
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Basílica de San Francisco",
            urlImage = "https://www.ibolivia.org/wp-content/uploads/2019/07/basilica-de-san-francisco-la-paz.jpg",
            placeDescription = "La basílica de piedra labrada de San Francisco en La Paz, Bolivia, refleja una atractiva mezcla de tendencias españolas y mestizas (indígenas-españolas) del siglo XVI.",
            information = "Basílica de San Francisco",
            likeCont = 225
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Calle Jaen",
            urlImage = "https://media.tacdn.com/media/attractions-splice-spp-674x446/0b/27/74/25.jpg",
            placeDescription = "La Calle Jaén es la mejor calle colonial de La Paz, y los 10 museos que posee se pueden visitados fácilmente en una sola visita.",
            information = "Calle Jaen",
            likeCont = 200
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Parque Zoológico Municipal Vesty Pakos Sofro",
            urlImage = "https://lapaz.bolivialocal.net/imagen/e/2017/2/i151/parque-zoologico-municipal-paz-6-mx.jpg",
            placeDescription = "Ubicado en la zona de Mallasa a 14 km del centro paceño, tiene un área de 22.4 hectáreas y un clima templado ideal para la conservación de la fauna.",
            information = "Parque Zoológico Municipal Vesty Pakos Sofro",
            likeCont = 180
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Illimani",
            urlImage = "https://elpotosi.net/img/contents/images_980/2016/11/25/nota27268_imagen24517.jpg",
            placeDescription = "Illimani es el pico más alto (6.438 metros) en la Cordillera Real del oeste de Bolivia. ",
            information = "Illimani",
            likeCont = 175
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Casa Murillo",
            urlImage = "https://media-cdn.tripadvisor.com/media/photo-s/11/83/41/a1/caption.jpg",
            placeDescription = "Una vez hogar de Don Pedro Domingo Murillo, líder de la Revolución de La Paz del 16 de julio de 1809, en Bolivia, la Casa de Murillo exhibe colecciones de arte y muebles coloniales, textiles, medicinas, instrumentos musicales y artículos para el hogar de vidrio y plata. ",
            information = "Casa Murillo",
            likeCont = 125
        ),
        PlacesToVisit(
            cityName = "La Paz",
            placeName = "Museo De La Coca",
            urlImage = "https://a.travel-assets.com/findyours-php/viewfinder/images/res40/65000/65275-Museo-De-La-Coca.jpg",
            placeDescription = "El Museo de la Coca en La Paz,  explora el papel de la hoja sagrada en las sociedades tradicionales.",
            information = "Museo De La Coca",
            likeCont = 125
        ),
        PlacesToVisit(
            cityName = "Cochabamba",
            placeName = "cochabambatest",
            urlImage = "https://a.travel-assets.com/findyours-php/viewfinder/images/res40/65000/65275-Museo-De-La-Coca.jpg",
            placeDescription = "El Museo de la Coca en La Paz,  explora el papel de la hoja sagrada en las sociedades tradicionales.",
            information = "cochabamba info",
            likeCont = 125
        ),
        // Cochabamba
        PlacesToVisit(
            cityName = "Cochabamba",
            placeName = "Cristo de la Concordia",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/cristo-de-la-concordia-001.jpg",
            placeDescription = "Situada en lo alto del cerro San Pedro en Cochabamba, Bolivia, la estatua del Cristo de la Concordia de 33 m (109 pies) de altura es la más alta de su tipo en el mundo. Los visitantes pueden subir al interior hasta los brazos para tener una vista panorámica de la ciudad de Cochabamba.",
            information = "TODO",
            likeCont = 350
        ),
        PlacesToVisit(
            cityName = "Cochabamba",
            placeName = "Parque Nacional Carrasco",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/carrasco-national-park-004.jpg",
            placeDescription = "El Parque Nacional Carrasco está ubicado al este de Cochabamba, Bolivia. Carrasco cuenta con increíbles bosques nubosos y paisajes montañosos, profundos valles y cañones, ríos torrenciales, cascadas y exuberante vegetación.",
            information = "TODO",
            likeCont = 225
        ),
        PlacesToVisit(
            cityName = "Cochabamba",
            placeName = "Catedral de Cochabamba",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/catedral-cochabamba-002.jpg",
            placeDescription = "Catedral de Cochabamba, Bolivia. La fachada refleja una fusión mestiza del barroco español y los estilos arquitectónicos indígenas.",
            information = "TODO",
            likeCont = 200
        ),
        PlacesToVisit(
            cityName = "Cochabamba",
            placeName = "Museo Arqueológico de Cochabamba",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/archeological-museum-cochabamba-005.jpg",
            placeDescription = "El Museo Arqueológico de Cochabamba, Bolivia, exhibe aproximadamente 40.000 piezas arqueológicas, etnográficas y paleontológicas en su mayoría del Departamento de Cochabamba y algunas de otras regiones de Bolivia.",
            information = "TODO",
            likeCont = 180
        ),
        PlacesToVisit(
            cityName = "Cochabamba",
            placeName = "Palacio Portales",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/palacio-portales-011.jpg",
            placeDescription = "El Palacio Portales en Cochabamba, Bolivia, fue construido entre 1915 y 1927. Portales fue la residencia de Simón Iturri Patiño, millonario boliviano, llamado 'el barón del estaño' que controlaba más de la mitad de la producción nacional en la década de 1930.",
            information = "TODO",
            likeCont = 175
        ),
        PlacesToVisit(
            cityName = "Cochabamba",
            placeName = "La Recoleta",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/la-recoleta-005.jpg",
            placeDescription = "En el lado norte del Río Rocha en Cochabamba, Bolivia se encuentra La Recoletta y Avenida Pando. La Recoletta es una zona moderna y chic y el centro de la vida nocturna en Cochabamba.",
            information = "TODO",
            likeCont = 125
         ),
        PlacesToVisit(
            cityName = "Cochabamba",
            placeName = "Pairumani",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/pairumani-003.jpg",
            placeDescription = "Pairumani se encuentra a 21 kilómetros de Cochabamba en Bolivia y tiene una temperatura promedio de 19 C. En Pairumani se encuentra la Hacienda (cortijo) de Simón I. Patiño, conocido como el Barón de Estaño.",
            information = "TODO",
            likeCont = 125
        ),
        //Santa Cruz
        PlacesToVisit(
            cityName = "Santa Cruz",
            placeName = "Misiones jesuitas",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/Jesuit-Missions-03.jpg",
            placeDescription = "Las misiones jesuitas en Bolivia se han mantenido intactas e incluso después de cientos de años continúan maravillando a los visitantes. Están ubicados en las tierras bajas orientales de Santa Cruz, Bolivia, a unas 6 horas de la ciudad.",
            information = "TODO",
            likeCont = 350
        ),
        PlacesToVisit(
            cityName = "Santa Cruz",
            placeName = "Parque Nacional Noel Kempf Mercado",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/noel-kempf-mercado-04.jpg",
            placeDescription = "El Parque Nacional Noel Kempf Mercado en Santa Cruz, Bolivia ha sido declarado Patrimonio Natural de la Humanidad por la UNESCO. El parque Noel Kempf Mercado presenta una belleza escénica excepcional gracias a los grandes farallones y cascadas de la meseta de Caparu.",
            information = "TODO",
            likeCont = 225
        ),
        PlacesToVisit(
            cityName = "Santa Cruz",
            placeName = "San Jose de Chiquitos",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/san-jose-de-chiquitos-02.jpg",
            placeDescription = "Este asentamiento jesuita es el más antiguo de la zona y es muy similar a las misiones del norte argentino o paraguayo, sin embargo estas últimas misiones ahora son ruinas o museos, mientras que la iglesia de San José aún celebra misa y alberga una escuela de música muy activa.",
            information = "TODO",
            likeCont = 200
        ),
        PlacesToVisit(
            cityName = "Santa Cruz",
            placeName = "Catedral Metropilitana",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/santa-cruz-cathedral-005.jpg",
            placeDescription = "La Catedral Metropolitana de Santa Cruz fue construida por el hermano Mercedario Diego de Porres durante la época del virrey español Toledo. La Catedral Metropolitana de Santa Cruz destaca por sus bóvedas de madera y por la decoración pictórica que las recubre.",
            information = "TODO",
            likeCont = 180
        ),
        PlacesToVisit(
            cityName = "Santa Cruz",
            placeName = "Parque Arenal",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/parque-el-arenal-004.jpg",
            placeDescription = "El Parque Arenal rodea una laguna y es un lugar perfecto para descansar o dar un paseo. En una isla en medio de la laguna hay un mural del artista nacido en Santa Cruz Carlo Lorgio Vaca, famoso por sus murales.",
            information = "TODO",
            likeCont = 175
        ),
        PlacesToVisit(
            cityName = "Santa Cruz",
            placeName = "Samaipata",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/samaipata-005.jpg",
            placeDescription = "Cerca de Santa Cruz, Bolivia se encuentran las magníficas ruinas de una fortaleza, conocida como Fuerte de Samaipata (Fortaleza de Samaipata). Samaipata solía ser una fortaleza del Imperio Kollasuyo.",
            information = "TODO",
            likeCont = 125
        ),
        PlacesToVisit(
            cityName = "Santa Cruz",
            placeName = "Zoológico Municipal Fauna Sudamericana",
            urlImage = "https://www.ibolivia.org/wp-content/uploads/2018/09/zoologico-municipal-santa-cruz-de-la-sierra.jpg",
            placeDescription = "El Zoológico Municipal de Santa Cruz, Bolivia es uno de los zoológicos más completos de esta parte de Sudamérica con una variedad de fauna típica de la región.",
            information = "TODO",
            likeCont = 125
        ),
        //Oruro
        PlacesToVisit(
            cityName = "Oruro",
            placeName = "Carnaval de Oruro",
            urlImage = "https://static.eldeber.com.bo//Files/Sizes/2021/1/6/carnaval-de-oruro_750385916_1140x520.jpeg",
            placeDescription = "Decalrado como ´´Obra Maestra del Patrimonio Oral e Intangible de la Humanidad´´,El Carnaval de Oruro se celebra como signo de devoción a la Virgen del Socavón. El Carnaval de Oruro es uno de los eventos y festividades culturales más importantes de Bolivia y América Latina.",
            information = "TODO",
            likeCont = 350
        ),
        PlacesToVisit(
            cityName = "Oruro",
            placeName = "Santuario de Socavon",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/socavon-sanctuary-002.jpg",
            placeDescription = "El Santuario del Socavon es un templo religioso de especial devoción para los habitantes de Oruro, donde se adora a la Virgen de la Candelaria. En su honor se realiza el espléndido Carnaval de Oruro.",
            information = "TODO",
            likeCont = 225
        ),
        PlacesToVisit(
            cityName = "Oruro",
            placeName = "Faro de Conchupata",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/conchupata-002.jpg",
            placeDescription = "Disfrute de una vista panorámica de la ciudad de Oruro en Bolivia desde el monumento nacional denominado Faro de Conchupata, donde se izó por primera vez el actual emblema nacional boliviano el 7 de noviembre de 1851.",
            information = "TODO",
            likeCont = 200
        ),
        PlacesToVisit(
            cityName = "Oruro",
            placeName = "Cala Cala",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/cala-cala-oruro-001.jpg",
            placeDescription = "Cala Cala es un pueblo que se construyó a unos 21 kilómetros de Oruro en Bolivia. Cala Cala es una zona arqueológica, donde se pueden encontrar pinturas precolombinas. Bandadas de flamencos, llamas y felinos, fueron esbozadas con líneas simples por los antiguos bolivianos.",
            information = "TODO",
            likeCont = 180
        ),
        PlacesToVisit(
            cityName = "Oruro",
            placeName = "Obrajes y Capachos",
            urlImage = "https://impresa.lapatria.bo/fotos/02_2015/210508_1_07.jpg",
            placeDescription = "Las aguas de los balnearios de Capachos y Obrajes cerca de Oruro, Bolivia, son calientes y medicinales y una tentación para los turistas que llegan a Oruro.",
            information = "TODO",
            likeCont = 175
        ),
        PlacesToVisit(
            cityName = "Oruro",
            placeName = "Monumento a la Virgen del Socavón",
            urlImage = "https://denomades.s3.us-west-2.amazonaws.com/blog/wp-content/uploads/2018/01/11105420/Screen-Shot-2018-01-11-at-10.53.44-AM.png",
            placeDescription = "El Monumento a la Virgen del Socavón es un monumento ubicado en el cerro Santa Bárbara, al oeste de la ciudad altiplánica de Oruro en Bolivia. La escultura fue inaugurada el 1 de febrero de 2013, es uno de los monumentos más altos y modernos del mundo.",
            information = "TODO",
            likeCont = 125
        ),
        PlacesToVisit(
            cityName = "Oruro",
            placeName = "Estación Ferroviaria de Oruro",
            urlImage = "https://denomades.s3.us-west-2.amazonaws.com/blog/wp-content/uploads/2018/01/11162116/chrenOK-1024x611.jpg",
            placeDescription = "Una de las maneras más escénicas para llegar a Oruro es tomar el tren desde Uyuni. La empresa Ferroviaria Andina realiza el tramo los días martes, jueves, viernes y domingo comenzando en la madrugada.",
            information = "TODO",
            likeCont = 125
        ),
        //Potosí
        PlacesToVisit(
            cityName = "Potosí",
            placeName = "Minas de Plata de Potosí, Cerro Rico",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/Potosi/potosi-mine-05.jpg",
            placeDescription = "Uno de los principales atractivos turísticos de Potosí en Bolivia es el Cerro Rico. Desde las profundidades de esta asombrosa montaña, se han extraído enormes cantidades de plata desde 1545.",
            information = "TODO",
            likeCont = 350
        ),
        PlacesToVisit(
            cityName = "Potosí",
            placeName = "Casa Nacional de la Moneda",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/Potosi/casa-de-la-moneda-potosi-01.jpg",
            placeDescription = "La Casa de la Moneda es un edificio amplio, elegante y sorprendentemente hermoso que ocupa una manzana entera. En opinión de muchos especialistas, es el edificio más importante de la arquitectura colonial de América del Sur. ",
            information = "TODO",
            likeCont = 225
        ),
        PlacesToVisit(
            cityName = "Potosí",
            placeName = "Parque Nacional Torotoro",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/Potosi/torotoro-09.jpg",
            placeDescription = "El Parque Nacional Toro Toro está ubicado al norte de Potosí, Bolivia. Entre los atractivos se encuentran la caverna de Huma Jalanta, Huaca Senka. Hay huellas de dinosaurios, las ruinas incas de Flame Chaqui y pinturas rupestres.",
            information = "TODO",
            likeCont = 200
        ),
        PlacesToVisit(
            cityName = "Potosí",
            placeName = "Caverna de Umajalanta",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/Potosi/umajalanta-001.jpg",
            placeDescription = "La Caverna de Umajalanta se encuentra a solo 10 kilómetros de la ciudad de Toro Toro. Tiene 4600 metros de largo y ofrece a sus visitantes impresionantes vistas subterráneas de estalagmitas y estalactitas.",
            information = "TODO",
            likeCont = 180
        ),
        PlacesToVisit(
            cityName = "Potosí",
            placeName = "Calle Quijarro",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/calle-quijarro-potosi-002.jpg",
            placeDescription = "Patrimonio de la Humanidad de la Unesco Al norte de la Iglesia de San Agustín, la Calle Quijarro se estrecha al serpentear entre una gran cantidad de edificios coloniales, muchos con puertas adornadas con antiguos escudos familiares",
            information = "TODO",
            likeCont = 175
        ),
        PlacesToVisit(
            cityName = "Potosí",
            placeName = "Casa de las Tres Portadas",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/casa-de-las-tres-portadas-003.jpg",
            placeDescription = "Esta construcción también se conoce como 'Las Recogidas'. Solía \u200B\u200Bser una casa comunitaria para hermanas laicas, la mayoría de las cuales eran nativas. Esta construcción religiosa pertenece a la Orden Franciscana.",
            information = "TODO",
            likeCont = 125
        ),
        PlacesToVisit(
            cityName = "Potosí",
            placeName = "Manquiri",
            urlImage = "https://boliviatravelsite.com/Images/Attractionphotos/manquiri-001.jpg",
            placeDescription = "En el pasado, este lugar solía ser adorado por sus emanaciones de vapor de las aguas termales que fluyen bajo tierra.",
            information = "TODO",
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