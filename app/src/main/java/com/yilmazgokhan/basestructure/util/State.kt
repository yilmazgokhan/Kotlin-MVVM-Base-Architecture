package com.yilmazgokhan.basestructure.util

data class State<out T>(
    val status: Status,
    val data: T?,
    val message: String?
) {
    companion object {

        fun <T> success(data: T?): State<T> {
            return State(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String, data: T?): State<T> {
            return State(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): State<T> {
            return State(Status.LOADING, data, null)
        }

    }
}