package com.realworld.application

interface UserRepository {
    fun save(username: String);
}