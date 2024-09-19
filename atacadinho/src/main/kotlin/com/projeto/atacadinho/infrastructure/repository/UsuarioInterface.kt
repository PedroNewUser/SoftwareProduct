package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UsuarioInterface: JpaRepository<Usuario, Long>

public interface UserRepository extends JpaRepository<User, Long> {
}