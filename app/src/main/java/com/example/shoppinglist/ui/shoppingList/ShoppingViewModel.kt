package com.example.shoppinglist.ui.shoppingList

import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.db.entities.ShoppingItems
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ShoppingViewModel(private val
                        repository: ShoppingViewModel
): ViewModel(){
    fun upsert(items: ShoppingItems) = GlobalScope.launch { repository.upsert(items) }

    fun delete(items: ShoppingItems) = GlobalScope.launch { repository.delete(items) }

    fun getAllShoppingItems() = repository.getAllShoppingItems()
}