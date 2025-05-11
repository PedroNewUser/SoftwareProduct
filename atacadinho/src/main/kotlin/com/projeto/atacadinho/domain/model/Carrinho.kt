package com.projeto.atacadinho.domain.model

import jakarta.persistence.*

@Table(name ="carrinho")
@Entity
data class Carrinho(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null,

    @Column(name = "name")
    var name: String,

    @Column(name = "quantidade")
    var quantidade: Long
)
