package com.mmunoz.run.presentation.di

import com.mmunoz.run.domain.RunningTracker
import com.mmunoz.run.presentation.active_run.ActiveRunViewModel
import com.mmunoz.run.presentation.run_overview.RunOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val runPresentationModule = module {
    singleOf(::RunningTracker)

    viewModelOf(::RunOverviewViewModel)
    viewModelOf(::ActiveRunViewModel)
}