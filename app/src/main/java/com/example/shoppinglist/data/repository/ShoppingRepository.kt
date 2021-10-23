package com.example.shoppinglist.data.repository

import com.example.shoppinglist.data.db.ShoppingDatabase
import com.example.shoppinglist.data.db.entities.ShoppingItems

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(items: ShoppingItems) = db.getShoppingDao().upsert(items)
    suspend fun delete(items: ShoppingItems) = db.getShoppingDao().delete(items)
    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}