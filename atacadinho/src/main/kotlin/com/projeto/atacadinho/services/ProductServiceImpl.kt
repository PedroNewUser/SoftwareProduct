package com.projeto.atacadinho.services

import com.projeto.atacadinho.domain.dto.request.ProductRequestDto
import com.projeto.atacadinho.domain.dto.response.ProductResponseDto
import com.projeto.atacadinho.infrastructure.repository.ProdutoInterface
import com.projeto.atacadinho.model.Produto
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(

    val productService: ProdutoInterface

):ProductServiceInteface {

    //------------------------------------------------------------------------------------->
    override fun save(productRequestDto: ProductRequestDto): ProductResponseDto {
        val produto = productService.save(
            Produto(
                name = productRequestDto.name,
                quantidade = productRequestDto.quantidade
            )
        )

        return ProductResponseDto(
            name = produto.name,
            quantidade = produto.quantidade
        )
    }
    //------------------------------------------------------------------------------------->


    //------------------------------------------------------------------------------------->
    override fun findByName(nome: String): ProductResponseDto {
        val produto = productService.findByName(nome)

        return ProductResponseDto(
            name = produto.name,
            quantidade = produto.quantidade
        )
    }
}