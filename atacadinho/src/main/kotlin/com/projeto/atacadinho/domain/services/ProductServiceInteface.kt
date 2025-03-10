package com.projeto.atacadinho.domain.services

import com.projeto.atacadinho.domain.dtos.request.ProductHistoryRequestDto
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.dtos.response.ProductHistoryResponseDto
import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto
import com.projeto.atacadinho.domain.model.Produto

interface ProductServiceInteface {

    fun comprar(productRequestDto: ProductRequestDto)
    fun carrinho(productHistoryRequestDto: ProductHistoryRequestDto)//List<ProductHistoryResponseDto>
    fun delete(productRequestDto: ProductRequestDto)
    fun criarProduto (productRequestDto: ProductRequestDto): Produto
}
