package com.projeto.atacadinho.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.GenerationType
import jakarta.persistence.Column
import java.math.BigDecimal

@Table(name ="produto")
@Entity
data class Produto(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null,

    @Column (name = "categoria")
    var categoria: String? = null,

    @Column(name = "name")
    var name: String,

    @Column(name = "quantidade")
    var quantidade: Long,

    @Column(name = "valor")
    var valor: BigDecimal,
)

