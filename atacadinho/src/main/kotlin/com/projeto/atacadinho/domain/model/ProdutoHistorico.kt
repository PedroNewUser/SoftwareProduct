package com.projeto.atacadinho.domain.model

import jakarta.persistence.*
import java.math.BigDecimal

@Table(name ="produtoHistorico")
@Entity
data class ProdutoHistorico(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null,

    @Column(name = "name")
    var name: String,

    @Column (name = "categoria")
    var categoria: String? = null,

    @Column(name = "quantidade")
    var quantidade: Long,

    @Column(name = "valor")
    var valor: BigDecimal,
    )
