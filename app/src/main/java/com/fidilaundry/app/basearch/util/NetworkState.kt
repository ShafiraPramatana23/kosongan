package com.fidilaundry.app.basearch.util

enum class Status {
    RUNNING,
    SUCCESS,
    FAILED
}

@Suppress("DataClassPrivateConstructor")
data class NetworkState private constructor(
    val status: Status,
    val msg: String? = null
) {
    companion object {
        @JvmStatic
        val LOADED = NetworkState(Status.SUCCESS)
        @JvmStatic
        val LOADING = NetworkState(Status.RUNNING)

        @JvmStatic
        fun error(msg: String?) =
            NetworkState(Status.FAILED, msg)
    }
}