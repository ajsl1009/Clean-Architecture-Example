package com.example.randomuser1223.di

import com.example.randomuser1223.data.network.ApiService
import com.example.randomuser1223.data.remote.UserDataSource
import com.example.randomuser1223.data.remote.UserDataSourceImpl
import com.example.randomuser1223.data.repository.UserRepositoryImpl
import com.example.randomuser1223.domain.repository.UserRepository
import com.example.randomuser1223.domain.usecase.GetUserListUseCase
import com.example.randomuser1223.domain.usecase.GetUserListUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {
    @Provides
    fun provideApiService(): ApiService = Retrofit.Builder()
        .baseUrl("https://randomuser.me/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient.Builder().build())
        .build()
        .create(ApiService::class.java)
}

@Module
@InstallIn(SingletonComponent::class)
abstract class UserDataSourceModule {
    @Singleton
    @Binds
    abstract fun provideUserDataSource(impl: UserDataSourceImpl): UserDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class UserRepositoryModule {
    @Singleton
    @Binds
    abstract fun provideUserRepository(impl: UserRepositoryImpl): UserRepository
}

@Module
@InstallIn(ViewModelComponent::class)
abstract class GetUserListUseCaseModule {
    @Binds
    abstract fun provideGetUserListUseCase(impl: GetUserListUseCaseImpl): GetUserListUseCase
}