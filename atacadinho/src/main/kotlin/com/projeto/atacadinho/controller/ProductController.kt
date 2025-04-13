package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dtos.request.ProductHistoryRequestDto
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.dtos.response.ProductHistoryResponseDto
import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto
import com.projeto.atacadinho.domain.model.Produto
import com.projeto.atacadinho.domain.model.ProdutoHistory
import com.projeto.atacadinho.domain.services.ProductServiceInteface
import com.projeto.atacadinho.infrastructure.repository.ProdutoHistoryRepositoy
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@CrossOrigin("*")
@RestController
@RequestMapping("/produto")
class ProductController(
    val productService: ProductServiceInteface,
    val produtoHistory: ProdutoHistoryRepositoy
) {
    private val logger = LoggerFactory.getLogger(ProductController::class.java)

    //Comprar Produto
    @PostMapping("/comprar")
    fun comprarProduto(@RequestBody productRequestDto: ProductRequestDto){
        return productService.comprar(productRequestDto)
    }

    @PostMapping("/adicionar")
    fun adicionarAoCarrinho(@RequestBody productHistoryRequestDto: ProductHistoryRequestDto){
        return productService.carrinho(productHistoryRequestDto)
    }

    // Função abaixo de listar produtos para historico
    @GetMapping("/listproduct")
    fun listProduct():List<ProductHistoryResponseDto>{
        val items = produtoHistory.findAll()
        return items.map {
            ProductHistoryResponseDto(
                name = it.name,
                quantidade = it.quantidade
            )
        }
    }

    //Comprar Produto
    @PostMapping("/delete")
    fun deleteProduto(@RequestBody productRequestDto: ProductRequestDto){
        return productService.delete(productRequestDto)
    }

    // Criar Produto
    @PostMapping("/criarProduto")
    fun criarProduto(@RequestBody productRequestDto: ProductRequestDto): ResponseEntity<Produto> {
        val novoProduto= productService.criarProduto(productRequestDto)
        return ResponseEntity.ok(novoProduto)
    }
}
