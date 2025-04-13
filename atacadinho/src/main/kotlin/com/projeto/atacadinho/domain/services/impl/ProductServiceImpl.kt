package com.projeto.atacadinho.domain.services.impl
import com.projeto.atacadinho.domain.dtos.request.ProductHistoryRequestDto
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.model.Produto
import com.projeto.atacadinho.domain.model.ProdutoHistory
import com.projeto.atacadinho.domain.services.ProductServiceInteface
import com.projeto.atacadinho.infrastructure.repository.ProdutoHistoryRepositoy
import com.projeto.atacadinho.infrastructure.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(
    val productData: ProdutoRepository,
    val productHistory: ProdutoHistoryRepositoy
) : ProductServiceInteface {

    override fun comprar(productRequestDto: ProductRequestDto) {
        if (productRequestDto.name == productData.findByName(productRequestDto.name)) {
            productData.deleteQuantidade(productRequestDto.name, productRequestDto.quantidade)
            productHistory.deleteName(productRequestDto.name)
        }
    }

    override fun carrinho(productHistoryRequestDto: ProductHistoryRequestDto) {
        productHistory.save(
            ProdutoHistory(
                name = productHistoryRequestDto.name,
                quantidade = productHistoryRequestDto.quantidade,
            )
        )
    }

    override fun delete(productRequestDto: ProductRequestDto) {
        if (productRequestDto.name == productHistory.findByName(productRequestDto.name)) {
            productHistory.deleteName(productRequestDto.name)
        }
    }

    override fun criarProduto(productRequestDto: ProductRequestDto): Produto {
        val novoProduto = Produto(
            name = productRequestDto.name,
            quantidade = productRequestDto.quantidade,
            categoria = productRequestDto.categoria,
            valor = productRequestDto.valor
        )
        return productData.save(novoProduto)
    }
}
