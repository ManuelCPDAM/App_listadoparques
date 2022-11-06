package com.example.app_listadoparques

class ParkProvider {
    companion object{
        val parkList = listOf<Park>(
            Park(
                name = "Doñana",
                description = "Doñana es un espacio natural protegido español situado en las provincias de Huelva, Sevilla y Cádiz, Andalucía.",
                photo = "https://hijerez.com/wp-content/uploads/2020/04/parque-nacional-donana.jpg"
            ),
            Park(
                name = "Cabañeros",
                description = "El parque nacional de Cabañeros es un espacio natural protegido español de las provincias de Ciudad Real y Toledo.",
                photo = "https://saposyprincesas.elmundo.es/wp-content/uploads/2013/09/img_7347_2.jpg"
            ),
            Park(
                name = "Picos de Europa",
                description = "Los Picos de Europa son un macizo montañoso localizado en el norte de España que pertenece a la parte central de la cordillera Cantábrica.",
                photo = "https://lonelyplanetes.cdnstatics2.com/sites/default/files/styles/max_650x650/public/imprescindibles_images/espana_asturias_picoseuropa_naranjobulnes_shutterstock_1355731613_anton_petrus_shutterstock.jpg?itok=S_Ebhvfp"
            ),
            Park(
                name = "Timanfaya",
                description = "El parque nacional de Timanfaya es un espacio natural protegido español situado en los municipios de Yaiza y Tinajo, en la isla de Lanzarote, comunidad autónoma de Canarias.",
                photo = "https://www.ilanzarote.net/media/blog/visitar-timanfaya.webp"
            ),
            Park(
                name = "Tablas de Daimiel",
                description = "Es un espacio natural protegido español que protege el humedal homónimo. Se encuentra situado en los términos municipales de Daimiel y Villarrubia de los Ojos, en la provincia de Ciudad Real, comunidad autónoma de Castilla-La Mancha.",
                photo = "https://muchamontana.com/wp-content/uploads/2018/02/tablasdedaimiel@shalanaworld-1068x600.jpg"
            )
        )
    }
}