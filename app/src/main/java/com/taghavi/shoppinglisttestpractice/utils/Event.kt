package com.taghavi.shoppinglisttestpractice.utils

open class Event<out T>(private val content: T) {

    var hasBeenHandled = false
        private set

    fun getContentInfoNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    fun peekContent(): T = content
}