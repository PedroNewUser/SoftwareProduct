package com.projeto.atacadinho.domain.dtos.response

data class UserResponseDto(
    val id: Long?,
    val name: String,
    val email: String,
    val senha: String
)
