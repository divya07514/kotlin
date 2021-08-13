package com.divya.functions

import java.util.*


class Utils {
    fun upperFirstLast(str: String): String {
        val upperFirst = str.substring(0, 1).uppercase(Locale.getDefault()) + str.substring(1)
        return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(
            upperFirst.lastIndex - 1,
            upperFirst.length
        ).uppercase()
    }

}