package com.taghavi.shoppinglisttestpractice.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val amount: Int,
    val price: Float,
    val imageUrl: String,
)