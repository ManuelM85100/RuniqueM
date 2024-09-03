package com.mmunoz.auth.data.di

import com.mmunoz.auth.data.AuthRepositoryImpl
import com.mmunoz.auth.data.EmailPatternValidator
import com.mmunoz.auth.domain.AuthRepository
import com.mmunoz.auth.domain.PatternValidator
import com.mmunoz.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
    singleOf(::AuthRepositoryImpl).bind<AuthRepository>()
}