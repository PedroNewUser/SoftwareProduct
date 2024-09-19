package com.projeto.atacadinho.domain.services

import com.projeto.atacadinho.domain.dtos.request.ProductNameRequest
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto
import com.projeto.atacadinho.domain.model.Produto

interface ProductServiceInteface {
    fun save(productRequestDto: ProductRequestDto): ProductResponseDto

    // fun update(id: Long, productRequestDto: ProductRequestDto): ProductResponseDto

    fun productGetEveryThing(productNameRequest: ProductNameRequest): ProductResponseDto

//    fun relatorio(): MutableSet<ProductResponseDto>

    // fun acharProdutos(): List<ProductResponseDto>

}