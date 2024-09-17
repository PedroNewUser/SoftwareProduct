package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dtos.request.ProductNameRequest
import com.projeto.atacadinho.domain.dtos.request.ProductRequestDto
import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto
import com.projeto.atacadinho.domain.services.ProductServiceInteface
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/produto")
class ProductController(
    val productService: ProductServiceInteface
) {

    // CADASTRAR PRODUTO
    @PostMapping("/save")
    fun save(@RequestBody productRequestDto: ProductRequestDto) : ProductResponseDto {
        return productService.save(productRequestDto)
    }

    // PEGAR PRODUTO POR NOME
    @GetMapping("/pegar")
    fun findProduct(@Valid @RequestBody productNameRequest: ProductNameRequest): ResponseEntity<Any> {
        return ResponseEntity.ok(
            productService.productGetEveryThing(productNameRequest)
        )
    }

//    ATUALIZAR PRODUTO--------------------------->
//    @PutMapping("/{id}")
//    fun update(
//        @PathVariable id: Long,
//        @RequestBody productRequestDto: ProductRequestDto
//    ):ProductResponseDto{
//        return productService.update(id, productRequestDto)
//    }

//    // PEGAR TODOS PRODUTO
//    @GetMapping("/relatorio")
//    fun relatorio():List<TopicoPorCategoria>{
//        return serviceTopico.relatorio()
//    }
//
//    // DELETAR PRODUTO POR ID
//    @DeleteMapping("/{id}")
//    @CacheEvict(value = ["topicos"], allEntries = true)
//    fun deletar(@PathVariable id:Long){
//        serviceTopico.deletar(id)
//    }

}