package com.projeto.atacadinho.domain.services.impl

import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.model.ProdutoHistory
import com.projeto.atacadinho.domain.services.ProductServiceInteface
import com.projeto.atacadinho.infrastructure.repository.ProdutoHistoryRepositoy
import com.projeto.atacadinho.infrastructure.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(
    val productData: ProdutoRepository,
    val productHistory: ProdutoHistoryRepositoy
): ProductServiceInteface {

    override fun comprar(productRequestDto: ProductRequestDto) {

       productHistory.save(
            ProdutoHistory(
                name = productRequestDto.name,
                quantidade = productRequestDto.quantidade
            )
        )

        if (productRequestDto.name == productData.findByName(productRequestDto.name)) {
            val itens = productData.deleteQuantidade(productRequestDto.name, productRequestDto.quantidade)

        }
    }
}

//------------------------------------------------------------------------------------->


//    override fun save(productRequestDto: ProductRequestDto) {
//        val produto = productHistory.save(
//            ProdutoHistory(
//                name = productRequestDto.name,
//                quantidade = productRequestDto.quantidade
//            )
//        )
//
//        return ProductResponseDto(
//            name = produto.name,
//            quantidade = produto.quantidade
//        )
//    }

//    override fun productGetEveryThing(productNameRequest: ProductNameRequest): ProductResponseDto {
//        val productName = productData.findByName(productNameRequest.name)
//
//        return ProductResponseDto(
//            name = productName.name,
//            quantidade = productName.quantidade
//        )
//
//    }
//    override fun relatorio(pageable: Pageable):Page<Produto>{
//        return productData.findAll(pageable)
//    }
