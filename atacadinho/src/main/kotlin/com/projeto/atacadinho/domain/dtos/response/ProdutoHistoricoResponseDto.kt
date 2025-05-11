package com.projeto.atacadinho.domain.dtos.response

import java.math.BigDecimal

data class ProdutoHistoricoResponseDto(
    val name: String,
    val quantidade: Long,
    val categoria: String,
    val valor: BigDecimal
)


