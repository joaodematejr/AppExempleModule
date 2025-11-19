package com.demate.domain

class GetUserUseCase {
    fun execute(id: Int): User {
        return User(id, "User $id")
    }
}

