package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dtos.request.ProductHistoryRequestDto
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.dtos.response.ProductHistoryResponseDto
import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto
import com.projeto.atacadinho.domain.model.ProdutoHistory
import com.projeto.atacadinho.domain.services.ProductServiceInteface
import com.projeto.atacadinho.infrastructure.repository.ProdutoHistoryRepositoy
import org.slf4j.LoggerFactory
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
    @PostMapping("/delete/{id}")
    fun deleteProduto(@PathVariable id: Long){
        return productService.delete(id)
    }
}

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//    @PostMapping("/save")
//    fun save(@RequestBody productRequestDto: ProductRequestDto): ProductResponseDto {
//        logger.info("Recebida requisição POST para /produto/save com body: $productRequestDto")
//        return productService.save(productRequestDto)
//    }

// PEGAR PRODUTO POR NOME
//    @GetMapping("/pegar")
//    fun findProduct(@Valid @RequestBody productNameRequest: ProductNameRequest): ResponseEntity<Any> {
//        logger.info("Recebida requisição GET para /produto/pegar com body: $productNameRequest")
//        return ResponseEntity.ok(
//            productService.productGetEveryThing(productNameRequest)
//        )
//    }