package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.model.Produto
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ProdutoRepository: CrudRepository<Produto, Long> {

    @Query("SELECT name FROM Produto p WHERE p.name = :name")
    fun findByName(@Param("name") name: String): String

    @Modifying
    @Transactional
    @Query("UPDATE Produto AS p SET p.quantidade  = p.quantidade - :quantidade WHERE p.name = :name")
    fun deleteQuantidade(@Param("name") name: String, @Param("quantidade") quantidade:Long)
}