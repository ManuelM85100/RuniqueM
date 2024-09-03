package com.mmunoz.run.domain

import com.mmunoz.core.domain.location.LocationWithAltitude
import kotlinx.coroutines.flow.Flow

interface LocationObserver {

    fun observeLocation(interval: Long): Flow<LocationWithAltitude>

}