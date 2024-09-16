package com.projeto.atacadinho.services

import com.projeto.atacadinho.request.ProductNameRequest
import com.projeto.atacadinho.request.ProductRequestDto
import com.projeto.atacadinho.domain.dto.ProductResponseDto
import com.projeto.atacadinho.infrastructure.repository.ProdutoInterfaceRepository
import com.projeto.atacadinho.model.Produto
import org.springframework.stereotype.Service


@Service
class ProductServiceImpl(
      //val productDto: ProductDto,
      val productRepository: ProdutoInterfaceRepository

):ProductServiceInteface {

    //------------------------------------------------------------------------------------->
    override fun save(productRequestDto: ProductRequestDto): ProductResponseDto {
        val produto = productRepository.save(
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
        val productName = productRepository.findByName(productNameRequest.name)

//        val productNameReturn = productDto.fromModel(
//            productName.name,
//            productName.quantidade
//        )

        return  ProductResponseDto(
            productName.name,
            productName.quantidade
        )

    }
}