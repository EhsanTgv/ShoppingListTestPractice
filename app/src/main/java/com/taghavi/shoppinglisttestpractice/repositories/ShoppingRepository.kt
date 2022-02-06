package com.taghavi.shoppinglisttestpractice.repositories

import androidx.lifecycle.LiveData
import com.taghavi.shoppinglisttestpractice.data.local.ShoppingItem
import com.taghavi.shoppinglisttestpractice.data.remote.responses.ImageResponse
import com.taghavi.shoppinglisttestpractice.utils.Resource
import retrofit2.Response

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}