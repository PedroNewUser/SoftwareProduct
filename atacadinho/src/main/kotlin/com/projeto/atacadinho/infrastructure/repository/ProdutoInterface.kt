package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.dtos.response.ProductResponseDto
import com.projeto.atacadinho.domain.model.Produto
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ProdutoInterface: CrudRepository<Produto, Long> {

    //@Query("SELECT name FROM Produto p WHERE p.name = :name")
    fun findByName(@Param("name") name: String): ProductResponseDto
}