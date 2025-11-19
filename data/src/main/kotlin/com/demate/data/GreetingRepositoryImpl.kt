package com.demate.data

import com.demate.domain.GreetingProvider

class GreetingRepositoryImpl : GreetingProvider {
    override fun greeting(): String = "Olá do módulo data!"
}

object GreetingModule {
    fun provideGreetingProvider(): GreetingProvider = GreetingRepositoryImpl()
}

