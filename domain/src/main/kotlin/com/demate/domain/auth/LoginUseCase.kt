package com.demate.domain.auth

class LoginUseCase(private val repo: AuthRepository) {
    suspend fun execute(username: String, password: String): Boolean {
        return repo.login(username, password)
    }
}

