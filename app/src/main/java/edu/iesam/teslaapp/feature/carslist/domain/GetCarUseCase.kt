package edu.iesam.teslaapp.feature.carslist.domain

class GetCarUseCase(private val getUseCaseCar: CarRepository) {
    constructor() : this()

    operator fun invoke(): List<Car> {
        return getUseCaseCar.obtain()
    }

}