package com.projeto.atacadinho.services

import com.projeto.atacadinho.request.UserRequestDto
import com.projeto.atacadinho.domain.dto.UserResponseDto
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
                name = userRequestDto.name,
                email = userRequestDto.email,
                senha = userRequestDto.senha
                )
            )
        return UserResponseDto(
            id = user.id,
            name = user.name,
            email = user.email,
            senha = user.senha
        )
    }
}