package com.yilmazgokhan.basestructure.di

import com.yilmazgokhan.basestructure.di.qualifier.DefaultDispatcher
import com.yilmazgokhan.basestructure.di.qualifier.IoDispatcher
import com.yilmazgokhan.basestructure.di.qualifier.MainDispatcher
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

/**
 * The Main [Module] that holds all app core classes and provides these instances
 */
@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    //region Dispatchers
    @DefaultDispatcher
    @Singleton
    @Provides
    internal fun provideDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default

    @IoDispatcher
    @Singleton
    @Provides
    internal fun providesIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

    @MainDispatcher
    @Singleton
    @Provides
    internal fun providesMainDispatcher(): CoroutineDispatcher = Dispatchers.Main
    //endregion
}