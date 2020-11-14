package com.example.study.model.Entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        var account: String? = null,
        var email: String? = null,
        var phoneNumber: String? = null,
        var createAt: LocalDateTime? = null,
        var createBy: String? = null,
        val updateAt: LocalDateTime? = null,
        val updateBy: String? = null
)