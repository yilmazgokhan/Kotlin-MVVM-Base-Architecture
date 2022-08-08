package com.yilmazgokhan.basestructure.di

import com.yilmazgokhan.basestructure.BuildConfig
import com.yilmazgokhan.basestructure.data.remote.source.UserDataSourceImpl
import com.yilmazgokhan.basestructure.data.remote.service.UserService
import com.yilmazgokhan.basestructure.data.repository.UserDataSource
import com.yilmazgokhan.basestructure.data.repository.UserRepositoryImpl
import com.yilmazgokhan.basestructure.domain.repository.UserRepository
import com.yilmazgokhan.basestructure.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * The Main [Module] that holds all network classes and provides these instances
 */
@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Provides
    fun provideBaseUrl() = Constants.BASE_URL

    @Singleton
    @Provides
    fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    } else {
        OkHttpClient
            .Builder()
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, BASE_URL: String): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()

    @Provides
    @Singleton
    fun provideUserService(retrofit: Retrofit): UserService =
        retrofit.create(UserService::class.java)
}