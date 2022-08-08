package com.yilmazgokhan.basestructure.util

sealed class State<out T>(
    val data: T? = null,
    val message: String? = null
) {

    class Success<T>(data: T?) : State<T>(data = data)

    class Error(message: String?) : State<Nothing>(data = null, message = message)

    class Loading<T>(data: T? = null) : State<T>(data = data)

}