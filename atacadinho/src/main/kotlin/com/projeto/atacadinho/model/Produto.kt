package com.projeto.atacadinho.model

import jakarta.persistence.*

@Table(name ="produto")
@Entity
data class Produto(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null,

    @Column(name = "name")
    var name: String,

    @Column(name = "quantidade")
    var quantidade: Long,
)
