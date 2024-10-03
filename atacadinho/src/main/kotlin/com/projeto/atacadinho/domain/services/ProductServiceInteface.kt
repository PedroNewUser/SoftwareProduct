package com.projeto.atacadinho.domain.services

import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto

interface ProductServiceInteface {
    //fun save(productRequestDto: ProductRequestDto)

    fun comprar(productRequestDto: ProductRequestDto)

    // fun update(id: Long, productRequestDto: ProductRequestDto): ProductResponseDto

   // fun productGetEveryThing(productNameRequest: ProductNameRequest): ProductResponseDto

}