package edu.iesam.teslaapp.feature.carslist.domain

interface CarRepository {
    fun obtain(): List<Car>
}