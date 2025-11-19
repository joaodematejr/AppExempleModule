package com.demate.domain.auth

interface AuthRepository {
    suspend fun login(username: String, password: String): Boolean
    suspend fun signup(username: String, password: String): Boolean
}

