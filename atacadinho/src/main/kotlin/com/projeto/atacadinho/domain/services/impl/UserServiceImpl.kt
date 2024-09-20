package com.projeto.atacadinho.domain.services.impl

import com.projeto.atacadinho.domain.dtos.request.UserRequestDto
import com.projeto.atacadinho.domain.dtos.response.UserResponseDto
import com.projeto.atacadinho.infrastructure.repository.UsuarioRepository
import com.projeto.atacadinho.domain.model.Usuario
import com.projeto.atacadinho.domain.services.UserServiceInterface
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    val userService: UsuarioRepository): UserServiceInterface
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

//    fun save(userRequestDto: UserRequestDto): User {
//        val user = User(
//            nome = userRequestDto.nome,
//            email = userRequestDto.email,
//            password = userRequestDto.password
//        )
//        return userRepository.save(user)
//    }
}

