package com.mmunoz.run.location.di

import com.mmunoz.run.domain.LocationObserver
import com.mmunoz.run.location.AndroidLocationObserver
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val locationModule = module {
    singleOf(::AndroidLocationObserver).bind<LocationObserver>()
}