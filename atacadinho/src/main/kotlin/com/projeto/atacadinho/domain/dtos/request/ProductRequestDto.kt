package com.projeto.atacadinho.domain.dtos.request

import java.math.BigDecimal

data class ProductRequestDto(
    val name: String,
    val quantidade: Long,
    val categoria: String,
    val valor: BigDecimal,
)


