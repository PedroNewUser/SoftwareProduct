package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto
import com.projeto.atacadinho.domain.model.Produto
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ProdutoInterface: CrudRepository<Produto, Long> {
    fun findByName(@Param("name") name: String): ProductResponseDto

//    @Query("SELECT new com.projeto.atacadinho.domain.dtos.response.ProductResponseDto ** FROM Produto")
//    fun relatorio(): MutableSet<ProductResponseDto>
}