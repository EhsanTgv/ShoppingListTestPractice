package com.taghavi.shoppinglisttestpractice.data.remote.responses

data class ImageResponse(
    val hits: List<ImageResult>,
    val total: Int,
    val totalHints: Int,
)
