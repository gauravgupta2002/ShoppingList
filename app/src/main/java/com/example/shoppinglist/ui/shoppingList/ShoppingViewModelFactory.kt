package com.example.shoppinglist.ui.shoppingList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ShoppingViewModelFactory(
    private val repository: ShoppingViewModel
):ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }

}