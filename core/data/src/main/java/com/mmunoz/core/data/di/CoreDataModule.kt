package com.mmunoz.core.data.di

import com.mmunoz.core.data.auth.EncryptedSessionStorage
import com.mmunoz.core.data.networking.HttpClientFactory
import com.mmunoz.core.data.run.OfflineFirstRunRepository
import com.mmunoz.core.domain.SessionStorage
import com.mmunoz.core.domain.run.RunRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory(get()).build()
    }

    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()

    singleOf(::OfflineFirstRunRepository).bind<RunRepository>()
}