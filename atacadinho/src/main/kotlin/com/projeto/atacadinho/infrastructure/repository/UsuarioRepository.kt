package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UsuarioRepository: JpaRepository<Usuario, Long>
