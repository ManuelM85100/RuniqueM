package com.mmunoz.auth.domain

import com.mmunoz.core.domain.util.DataError
import com.mmunoz.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun login(email: String, password: String):EmptyResult<DataError.Network>
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}