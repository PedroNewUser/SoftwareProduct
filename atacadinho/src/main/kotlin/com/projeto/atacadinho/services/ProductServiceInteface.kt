package com.projeto.atacadinho.services

import com.projeto.atacadinho.domain.dto.request.ProductRequestDto
import com.projeto.atacadinho.domain.dto.response.ProductResponseDto

interface ProductServiceInteface {
    fun save(productRequestDto: ProductRequestDto): ProductResponseDto

    // fun update(id: Long, productRequestDto: ProductRequestDto): ProductResponseDto

    fun findByName(name: String): ProductResponseDto
}