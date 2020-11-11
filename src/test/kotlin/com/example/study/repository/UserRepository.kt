package com.example.study.repository

import com.example.study.StudyApplicationTests
import com.example.study.model.Entity.User
import org.springframework.beans.factory.annotation.Autowired

class UserRepository : StudyApplicationTests() {

    @Autowired
    private lateinit var userRepository : UserRepository

    fun create(){
        var user = User()
        
    }

    fun read(){

    }

    fun delete(){

    }

    fun update(){

    }
}