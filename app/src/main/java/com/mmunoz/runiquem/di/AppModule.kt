package com.mmunoz.runiquem.di

import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.mmunoz.core.data.auth.EncryptedSessionStorage
import com.mmunoz.runiquem.MainViewModel
import com.mmunoz.runiquem.RuniqueMApp
import kotlinx.coroutines.CoroutineScope
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module


val appModule = module {

    single<SharedPreferences> {
        EncryptedSharedPreferences(
            androidApplication(),
            "auth_pref",
            MasterKey(androidApplication()),
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM,
        )
    }
    single<CoroutineScope>{
        (androidApplication() as RuniqueMApp).applicationScope
    }

    viewModelOf(::MainViewModel)
}