package com.fidilaundry.app.util.base

class CastExeption(clazz: Class<*>) : ClassCastException(String.format(MESSAGE, clazz)) {

    companion object {
        private val MESSAGE = "Failed to cast object to class '%s'"
    }
}