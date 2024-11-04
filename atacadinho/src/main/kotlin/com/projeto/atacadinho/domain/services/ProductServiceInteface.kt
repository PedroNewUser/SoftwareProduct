package com.projeto.atacadinho.domain.services

import com.projeto.atacadinho.domain.dtos.request.ProductHistoryRequestDto
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.dtos.response.ProductHistoryResponseDto
import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto

interface ProductServiceInteface {

    fun comprar(productRequestDto: ProductRequestDto)

    fun carrinho(productHistoryRequestDto: ProductHistoryRequestDto)//List<ProductHistoryResponseDto>

}

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
// fun update(id: Long, productRequestDto: ProductRequestDto): ProductResponseDto
// fun productGetEveryThing(productNameRequest: ProductNameRequest): ProductResponseDto
//fun save(productRequestDto: ProductRequestDto)
