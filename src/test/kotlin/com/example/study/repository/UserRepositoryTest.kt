package com.example.study.repository

import com.example.study.StudyApplicationTests
import com.example.study.model.Entity.User
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import java.time.LocalDateTime

class UserRepositoryTest : StudyApplicationTests() {

    @Autowired
    private lateinit var userRepository : UserRepository

    @Test
    fun create(){
        val user = User()
        user.account = "testuser01"
        user.email = "testuser@gmail.com"
        user.phoneNumber = "010-1111-1111"
        user.createAt = LocalDateTime.now()
        user.createBy = "admin"

        userRepository.save(user)
    }

    fun read(){

    }

    fun delete(){

    }

    fun update(){

    }
}