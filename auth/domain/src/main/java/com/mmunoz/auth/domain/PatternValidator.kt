package com.mmunoz.auth.domain

interface PatternValidator {

    fun matches(value: String): Boolean
}