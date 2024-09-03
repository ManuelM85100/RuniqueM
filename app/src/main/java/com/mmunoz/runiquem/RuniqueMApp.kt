package com.mmunoz.runiquem

import android.app.Application
import com.mmunoz.auth.data.di.authDataModule
import com.mmunoz.auth.presentation.di.authViewModelModule
import com.mmunoz.core.data.di.coreDataModule
import com.mmunoz.core.database.di.databaseModule
import com.mmunoz.run.data.di.runDataModule
import com.mmunoz.run.location.di.locationModule
import com.mmunoz.run.network.di.networkModule
import com.mmunoz.run.presentation.di.runPresentationModule
import com.mmunoz.runiquem.di.appModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.workmanager.koin.workManagerFactory
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueMApp: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueMApp)
            workManagerFactory()
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule,
                runPresentationModule,
                locationModule,
                databaseModule,
                networkModule,
                runDataModule
            )
        }
    }
}