package com.projeto.atacadinho.domain.model

import jakarta.persistence.*
import java.math.BigDecimal

@Table(name ="produto_history")
@Entity
data class ProdutoHistory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null,

    @Column(name = "name")
    var name: String,

    @Column(name = "quantidade")
    var quantidade: Long,

)
