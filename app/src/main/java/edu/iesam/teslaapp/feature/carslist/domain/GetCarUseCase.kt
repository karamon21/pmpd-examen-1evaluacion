package edu.iesam.teslaapp.feature.carslist.domain

class GetCarUseCase(private val getSuperHero: CarRepository) {
    operator fun invoke(): List<Car> {
        return getSuperHero.obtain()
    }

}