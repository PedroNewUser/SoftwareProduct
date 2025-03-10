package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository: JpaRepository<Usuario, Long>{
    @Query("SELECT name FROM ProdutoHistory p WHERE p.name = :name")
    fun findByName(@Param("name") name: String): String
}