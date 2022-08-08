package com.yilmazgokhan.basestructure.di

import com.yilmazgokhan.basestructure.data.remote.source.UserDataSourceImpl
import com.yilmazgokhan.basestructure.data.repository.UserDataSource
import com.yilmazgokhan.basestructure.data.repository.UserRepositoryImpl
import com.yilmazgokhan.basestructure.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

/**
 * The Main [Module] that holds all repository classes and provides these instances
 */
@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideUserDataSourceImpl(userDataSource: UserDataSourceImpl): UserDataSource =
        userDataSource

    @Provides
    @Singleton
    fun provideUserRepository(userRepository: UserRepositoryImpl): UserRepository =
        userRepository
}