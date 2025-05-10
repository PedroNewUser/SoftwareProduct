package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.model.Carrinho
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository


@Repository
interface CarrinhoRepository: CrudRepository<Carrinho, Long>{
    @Query("SELECT name FROM Carrinho p WHERE p.name = :name")
    fun findByName(@Param("name") name: String): String

    @Modifying
    @Transactional
    @Query("DELETE FROM Carrinho p WHERE p.name = :name")
    fun deleteName(name: String)
}