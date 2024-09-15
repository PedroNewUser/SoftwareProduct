package com.projeto.atacadinho.model

import jakarta.persistence.*

@Table(name ="usuario")
@Entity
data class Usuario(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null,

    @Column(name = "nome")
    var name: String,

    @Column(name = "email")
    var email:String
)
