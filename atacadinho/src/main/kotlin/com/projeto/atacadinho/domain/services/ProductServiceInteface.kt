package com.projeto.atacadinho.domain.services

import com.projeto.atacadinho.domain.dtos.request.CarrinhoRequestDto
import com.projeto.atacadinho.domain.dtos.request.CompraRequestDto
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.model.Produto
import com.projeto.atacadinho.domain.model.ProdutoHistorico

interface ProductServiceInteface {

    fun comprar(compratRequestDto: CompraRequestDto)
    fun carrinhoAdicionar(carrinhoRequestDto: CarrinhoRequestDto)//List<ProductHistoryResponseDto>
    fun delete(productRequestDto: CompraRequestDto)
    fun criarProduto (productRequestDto: ProductRequestDto): Produto
    fun atualizarProduto (productRequestDto: ProductRequestDto): Produto
}
