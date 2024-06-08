package com.realworld.application

import com.realworld.domain.UserEntity
import org.springframework.stereotype.Service

interface UserService {
    fun signUp(username: String)
}


@Service
private class UserServiceImpl(private val userRepository: UserRepository) : UserService {

    override fun signUp(username: String) {
        UserEntity(username)
        userRepository.save(username)
    }
}