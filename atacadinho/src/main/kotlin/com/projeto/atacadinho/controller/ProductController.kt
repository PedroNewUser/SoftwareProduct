package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dtos.request.CarrinhoRequestDto
import com.projeto.atacadinho.domain.dtos.request.CompraRequestDto
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.dtos.response.CarrinhoResponseDto
import com.projeto.atacadinho.domain.model.Produto
import com.projeto.atacadinho.domain.model.ProdutoHistorico
import com.projeto.atacadinho.domain.services.ProductServiceInteface
import com.projeto.atacadinho.infrastructure.repository.CarrinhoRepository
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@CrossOrigin("*")
@RestController
@RequestMapping("/produto")
class ProductController(
    val productService: ProductServiceInteface,
    val produtoHistory: CarrinhoRepository
) {
    private val logger = LoggerFactory.getLogger(ProductController::class.java)

    // Criar Produto
    @PostMapping("/criarProduto")
    fun criarProduto(@RequestBody productRequestDto: ProductRequestDto): ResponseEntity<Produto> {
        val novoProduto= productService.criarProduto(productRequestDto)
        return ResponseEntity.ok(novoProduto)
    }

    // Atualizar Produto
    @PostMapping("/atualizarProduto")
    fun atualizarProduto(@RequestBody productRequestDto: ProductRequestDto): ResponseEntity<Produto> {
        val novoProduto= productService.atualizarProduto(productRequestDto)
        return ResponseEntity.ok(novoProduto)
    }

    @PostMapping("/adicionar")
    fun adicionarAoCarrinho(@RequestBody carrinhoRequestDto: CarrinhoRequestDto){
        return productService.carrinho(carrinhoRequestDto)
    }

    //Comprar Produto
    @PostMapping("/comprar")
    fun comprarProduto(@RequestBody productRequestDto: CompraRequestDto): List<ProdutoHistorico>{
        return productService.comprar(productRequestDto)
    }

    // Função abaixo de listar produtos para historico
    @GetMapping("/listproduct")
    fun listProduct():List<CarrinhoResponseDto>{
        val items = produtoHistory.findAll()
        return items.map {
            CarrinhoResponseDto(
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
}
