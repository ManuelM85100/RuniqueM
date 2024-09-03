package com.mmunoz.auth.presentation.di

import com.mmunoz.auth.presentation.login.LoginViewModel
import com.mmunoz.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}