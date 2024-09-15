package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dto.request.ProductRequestDto
import com.projeto.atacadinho.domain.dto.response.ProductResponseDto
import com.projeto.atacadinho.services.ProductServiceInteface
import org.springframework.web.bind.annotation.*


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
    @GetMapping("/comprar/{name}")
    fun findProduct(@PathVariable name: String):ProductResponseDto{
        return productService.findByName(name)
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