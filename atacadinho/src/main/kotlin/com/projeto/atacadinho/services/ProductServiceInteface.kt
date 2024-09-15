package com.projeto.atacadinho.services

import com.projeto.atacadinho.request.ProductNameRequest
import com.projeto.atacadinho.request.ProductRequestDto
import com.projeto.atacadinho.domain.dto.ProductResponseDto

interface ProductServiceInteface {
    fun save(productRequestDto: ProductRequestDto): ProductResponseDto

    // fun update(id: Long, productRequestDto: ProductRequestDto): ProductResponseDto

    fun productGetEveryThing(productNameRequest: ProductNameRequest): ProductResponseDto
}