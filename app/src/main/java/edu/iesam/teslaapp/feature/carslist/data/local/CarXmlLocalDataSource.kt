package edu.iesam.teslaapp.feature.carslist.data.local

import android.content.Context
import edu.iesam.teslaapp.core.serialization.JsonSerializer
import edu.iesam.teslaapp.R
import edu.iesam.teslaapp.feature.carslist.domain.Car


/**
 * Conector para gestionar datos en un fichero XML a través de SharedPreferences.
 *
 */
class CarXmlLocalDataSource(
    private val context: Context,
    private val serializer: JsonSerializer<List<Car>>
) {

    private val key: String = "car"

    //-- Me creo la fuente de datos xml: SharedPreferences.
    val sharedPref = context.getSharedPreferences(
        context.getString(R.string.local_source_xml), Context.MODE_PRIVATE
    )

    fun save(cars: List<Car>) {
        sharedPref.edit().apply {
            putString(key, serializer.toJson(cars))
            apply()
        }
    }

    fun findAll(): List<Car> {
        val jsonList: String? = sharedPref.getString(key, null)
        jsonList?.let {
            return serializer.fromJson(it)
        }
        return emptyList()
    }

    fun findById(id: String): Car? {
        return findAll().find { it.id == id }
    }

    fun deleteById(id: String) {
        save(findAll().filterNot { it.id == id })
    }

    fun deleteAll() {
        sharedPref.edit().apply {
            remove(key)
            apply()
        }
    }
}