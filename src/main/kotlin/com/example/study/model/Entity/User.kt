package com.example.study.model.Entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val account: String? = null,
        val email: String? = null,
        val phoneNumber: String? = null,
        val createAt: LocalDateTime? = null,
        val createBy: String? = null,
        val updateAt: LocalDateTime? = null,
        val updateBy: String? = null
)