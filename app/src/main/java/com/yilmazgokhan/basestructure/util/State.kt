package com.yilmazgokhan.basestructure.util

data class State<T>(
    val status: Status? = null,
    val data: T? = null,
    val message: String? = null
) {
    companion object {

        fun <T> success(data: T?): State<T> {
            return State(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String, data: T? = null): State<T> {
            return State(Status.ERROR, data, msg)
        }

        fun <T> loading(): State<T> {
            return State(Status.LOADING, null, null)
        }

    }
}