package edu.iesam.teslaapp.feature.carslist.data.remote

import edu.iesam.teslaapp.feature.carslist.domain.Car

class CarApiRemoteDataSource {


    fun getAll(): List<Car> {
        return listOf(
            Car("1", "Mercedes-AMG", "GT 63 S 4-Door Coupé", "4.0L V8 Biturbo", 198.55),
            Car("2", "Toyota", "Any Value", "Any Value", 19.000),
            Car("3", "Tesla", "Model X", "Any Value", 33.000),
            Car("4", "KIA", "Any Value", "Any Vaue", 25.000),
            Car("5", "Nissan", "-------", "--------", 5.000)
        )
    }

}