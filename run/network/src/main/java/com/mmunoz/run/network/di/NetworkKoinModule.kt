package com.mmunoz.run.network.di

import com.mmunoz.core.domain.run.RemoteRunDataSource
import com.mmunoz.run.network.KtorRemoteRunDataSource
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val networkModule = module {
    singleOf(::KtorRemoteRunDataSource).bind<RemoteRunDataSource>()
}