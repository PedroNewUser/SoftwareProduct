package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.dto.ProductResponseDto
import com.projeto.atacadinho.model.Produto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ProdutoInterfaceRepository: JpaRepository<Produto, Long>{

    //@Query("SELECT name FROM Produto p WHERE p.name = :name")
    fun findByName(@Param("name") name: String): ProductResponseDto
}