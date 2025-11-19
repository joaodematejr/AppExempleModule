package com.demate.feature

import com.demate.data.UserRepository
import com.demate.core.Utils

// Example ViewModel using data and core modules
class UserViewModel {
    private val repository = UserRepository()
    private val utils = Utils()

    fun getGreeting(): String {
        val name = repository.getUserName()
        return utils.greet(name)
    }
}

