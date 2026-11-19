package edu.iesam.teslaapp.feature.presentation.viewmodel

import androidx.lifecycle.ViewModel
import edu.iesam.teslaapp.feature.carslist.domain.Car
import edu.iesam.teslaapp.feature.carslist.domain.GetCarUseCase

class CarViewModel(private val getCarUseCase: GetCarUseCase) : ViewModel() {

    fun getCarListViewModel(): List<Car> {
        return getCarUseCase.invoke()
    }

}