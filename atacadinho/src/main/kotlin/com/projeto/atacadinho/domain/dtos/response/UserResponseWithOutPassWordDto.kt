package com.projeto.atacadinho.domain.dtos.response

import javax.validation.constraints.Email

data class UserResponseWithOutPassWordDto(
    val name: String,
    val email: String
)
