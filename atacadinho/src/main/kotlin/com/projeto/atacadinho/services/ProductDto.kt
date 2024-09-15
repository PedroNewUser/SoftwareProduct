package com.projeto.atacadinho.services

import com.projeto.atacadinho.domain.dto.ProductResponseDto
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