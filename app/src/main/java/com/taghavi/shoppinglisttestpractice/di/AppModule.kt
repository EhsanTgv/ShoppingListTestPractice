package com.taghavi.shoppinglisttestpractice.di

import android.content.Context
import androidx.room.Room
import com.taghavi.shoppinglisttestpractice.data.local.ShoppingDatabase
import com.taghavi.shoppinglisttestpractice.data.remote.PixabayAPI
import com.taghavi.shoppinglisttestpractice.utils.Constants.BASE_URL
import com.taghavi.shoppinglisttestpractice.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideShoppingItemDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, ShoppingDatabase::class.java, DATABASE_NAME)

    @Singleton
    @Provides
    fun provideShoppingDao(
        database: ShoppingDatabase
    ) = database.shoppingDao()

    @Singleton
    @Provides
    fun providePixabayApi(): PixabayAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PixabayAPI::class.java)
    }
}