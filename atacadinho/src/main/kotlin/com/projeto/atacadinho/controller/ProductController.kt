package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto
import com.projeto.atacadinho.domain.services.ProductServiceInteface
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = ["http://localhost:63342"])
class ProductController(
    val productService: ProductServiceInteface
) {
    private val logger = LoggerFactory.getLogger(ProductController::class.java)

    //Comprar Produto
    @PostMapping("/comprar")
    fun comprarProduto(@RequestBody productRequestDto: ProductRequestDto){
        return productService.comprar(productRequestDto)
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