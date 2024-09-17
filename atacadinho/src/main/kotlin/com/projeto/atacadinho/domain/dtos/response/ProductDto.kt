package com.projeto.atacadinho.domain.dtos.response

import org.springframework.stereotype.Component

@Component
class ProductDto {
    fun fromModel(
        name: String,
        quantidade: Long
    ): ProductResponseDto {
        return ProductResponseDto(
            name = name, quantidade = quantidade
        )
    }
}