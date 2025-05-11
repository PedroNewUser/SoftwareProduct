package com.projeto.atacadinho.domain.services.impl
import com.projeto.atacadinho.domain.dtos.request.CarrinhoRequestDto
import com.projeto.atacadinho.domain.dtos.request.CompraRequestDto
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.model.Produto
import com.projeto.atacadinho.domain.model.Carrinho
import com.projeto.atacadinho.domain.model.ProdutoHistorico
import com.projeto.atacadinho.domain.services.ProductServiceInteface
import com.projeto.atacadinho.infrastructure.repository.CarrinhoRepository
import com.projeto.atacadinho.infrastructure.repository.ProdutoHistoricoRepository
import com.projeto.atacadinho.infrastructure.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(
    val productData: ProdutoRepository,
    val carinho: CarrinhoRepository,
    val produtoHistoricoRepository: ProdutoHistoricoRepository

) : ProductServiceInteface {

    override fun comprar(compratRequestDto: CompraRequestDto) {
        val produtoExistente = productData.findByName(compratRequestDto.name)
        produtoHistoricoRepository.save(
            ProdutoHistorico(
                name = compratRequestDto.name,
                quantidade = compratRequestDto.quantidade,
                categoria = produtoExistente.get().categoria,
                valor = produtoExistente.get().valor
            )
        )

        if (compratRequestDto.name == productData.findProductByName(compratRequestDto.name)) {
            productData.deleteQuantidade(compratRequestDto.name, compratRequestDto.quantidade)
            carinho.deleteName(compratRequestDto.name)
        }
    }

    override fun carrinhoAdicionar(carrinhoRequestDto: CarrinhoRequestDto) {
        carinho.save(
            Carrinho(
                name = carrinhoRequestDto.name,
                quantidade = carrinhoRequestDto.quantidade
            )
        )
    }

    override fun delete(productRequestDto: CompraRequestDto) {
        if (productRequestDto.name == carinho.findByName(productRequestDto.name)) {
            carinho.deleteName(productRequestDto.name)
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

    override fun atualizarProduto(productRequestDto: ProductRequestDto): Produto {
        val produtoExistente = productData.findByName(productRequestDto.name)

        if (produtoExistente.isPresent) {
            val produtoAtualizado = produtoExistente.get().apply {
                quantidade = productRequestDto.quantidade
                categoria = productRequestDto.categoria
                valor = productRequestDto.valor
            }
            return productData.save(produtoAtualizado)
        } else {
            throw Exception("Produto não encontrado")
        }
    }
}
