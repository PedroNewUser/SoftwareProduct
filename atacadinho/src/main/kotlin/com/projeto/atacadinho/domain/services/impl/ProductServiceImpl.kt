package com.projeto.atacadinho.domain.services.impl

import com.projeto.atacadinho.domain.model.Produto
import com.projeto.atacadinho.domain.dtos.request.ProductNameRequest
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto
import com.projeto.atacadinho.infrastructure.repository.ProdutoInterface
import com.projeto.atacadinho.domain.services.ProductServiceInteface

import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(
    val productData: ProdutoInterface
): ProductServiceInteface {

    //------------------------------------------------------------------------------------->
    override fun save(productRequestDto: ProductRequestDto): ProductResponseDto {
        val produto = productData.save(
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

    override fun productGetEveryThing(productNameRequest: ProductNameRequest): ProductResponseDto {
        val productName = productData.findByName(productNameRequest.name)

        return ProductResponseDto(
            name = productName.name,
            quantidade = productName.quantidade
        )

    }

//    override fun relatorio():MutableSet<ProductResponseDto>{
//        return productData.relatorio()
//    }

    //------------------------------------------------------------------------------------->
//    override fun acharProdutos():  List<ProductResponseDto> {
//        val produtos = productData.findAll()
//        return for (produto in produtos){
//
//        }
//    }
}