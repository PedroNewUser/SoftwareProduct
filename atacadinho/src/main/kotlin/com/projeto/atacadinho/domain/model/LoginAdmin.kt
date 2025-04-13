package com.projeto.atacadinho.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.GenerationType
import jakarta.persistence.Column
import java.math.BigDecimal

@Table(name ="adminUser")
@Entity
data class LoginAdmin(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null,

    @Column(name = "email")
    var email:String,

    @Column(name = "senha")
    var senha:String
)

