package com.projeto.atacadinho.services

import com.projeto.atacadinho.domain.dto.request.UserRequestDto
import com.projeto.atacadinho.domain.dto.response.UserResponseDto
import com.projeto.atacadinho.infrastructure.repository.UsuarioInterface
import com.projeto.atacadinho.model.Usuario
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    val userService: UsuarioInterface): UserServiceInterface
{
    override fun save(userRequestDto: UserRequestDto): UserResponseDto {
        val user = userService.save(
            Usuario(
                name = userRequestDto.nome,
                email = userRequestDto.email,
                senha = userRequestDto.senha
                )
            )
        return UserResponseDto(
            id = user.id,
            nome = user.name,
            email = user.email,
            senha = user.senha
        )
    }
}