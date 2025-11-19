package com.demate.data.auth

import com.demate.domain.auth.AuthRepository

class AuthRepositoryImpl : AuthRepository {
    override suspend fun login(username: String, password: String): Boolean {
        // placeholder: fake auth
        return username == "user" && password == "pass"
    }

    override suspend fun signup(username: String, password: String): Boolean {
        // placeholder: accept anything
        return true
    }
}

