package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.dto.response.ProductResponseDto
import com.projeto.atacadinho.model.Produto
import org.springframework.data.jpa.repository.JpaRepository

interface ProdutoInterface: JpaRepository<Produto, Long>{
    fun findByName(name: String): ProductResponseDto
}