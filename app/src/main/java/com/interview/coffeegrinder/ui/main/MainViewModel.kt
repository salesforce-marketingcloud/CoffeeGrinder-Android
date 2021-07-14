package com.interview.coffeegrinder.ui.main

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.interview.coffeegrinder.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel(), LifecycleObserver {

    fun fetchCoffees() = viewModelScope.launch {
        repository.getCoffees()
    }

    fun fetchCoffee(id: String) = viewModelScope.launch {
        repository.getCoffee(id)
    }
}