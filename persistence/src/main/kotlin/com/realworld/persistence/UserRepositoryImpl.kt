package com.realworld.com.realworld.persistence

import com.realworld.application.UserRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl : UserRepository {

    override fun save(username: String) {
        println("saving")
    }
}