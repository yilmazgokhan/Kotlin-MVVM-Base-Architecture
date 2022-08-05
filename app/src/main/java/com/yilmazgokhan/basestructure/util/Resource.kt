package com.yilmazgokhan.basestructure.util

/**
 * A generic class that holds a value with its loading status.
 */
sealed class Resource<out T> {
    class Success<T>(val data: T) : Resource<T>()
    class Error(val exception: Exception) : Resource<Nothing>()
    object Loading : Resource<Nothing>()
}