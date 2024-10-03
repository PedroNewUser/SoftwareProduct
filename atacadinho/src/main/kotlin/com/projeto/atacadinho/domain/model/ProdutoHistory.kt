package com.projeto.atacadinho.domain.model

import jakarta.persistence.*

@Table(name ="produto_history")
@Entity
data class ProdutoHistory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null,

    @Column(name = "nome")
    var name: String,

    @Column(name = "quantidade")
    var quantidade: Long,
)

