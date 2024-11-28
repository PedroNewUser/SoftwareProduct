package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.model.ProdutoHistory
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.Optional


@Repository
interface ProdutoHistoryRepositoy: CrudRepository<ProdutoHistory, Long>{
    @Query("SELECT name FROM ProdutoHistory p WHERE p.name = :name")
    fun findByName(@Param("name") name: String): Optional<ProdutoHistory>

    @Modifying
    @Transactional
    @Query("DELETE FROM ProdutoHistory p WHERE p.name = :name")
    fun deleteName(name: String)
}