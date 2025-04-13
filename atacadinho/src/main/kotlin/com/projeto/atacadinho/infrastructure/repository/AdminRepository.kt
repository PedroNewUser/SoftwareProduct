package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.model.LoginAdmin
import com.projeto.atacadinho.domain.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.Optional
import javax.validation.constraints.Email

@Repository
interface AdminRepository: JpaRepository<LoginAdmin, Long>{
    fun findByEmail(@Param("email") email: String): Optional<LoginAdmin>
}