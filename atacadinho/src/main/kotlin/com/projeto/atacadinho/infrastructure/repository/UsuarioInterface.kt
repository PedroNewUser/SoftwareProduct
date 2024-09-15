package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioInterface: JpaRepository<Usuario, Long>