package com.mmunoz.run.data.di

import com.mmunoz.core.domain.run.SyncRunScheduler
import com.mmunoz.run.data.CreateRunWorker
import com.mmunoz.run.data.DeleteRunWorker
import com.mmunoz.run.data.FetchRunsWorker
import com.mmunoz.run.data.SyncRunWorkerScheduler
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)

    singleOf(::SyncRunWorkerScheduler).bind<SyncRunScheduler>()
}