package com.example.shoppinglist.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.shoppinglist.data.db.entities.ShoppingItems

@Dao
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(items: ShoppingItems)

    @Delete
    suspend fun delete(items: ShoppingItems)

    @Query("SELECT * FROM shopping_item")
    fun getAllShoppingItems(): LiveData<List<ShoppingItems>>


}