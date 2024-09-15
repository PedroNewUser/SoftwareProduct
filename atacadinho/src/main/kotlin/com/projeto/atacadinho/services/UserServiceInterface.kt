package com.projeto.atacadinho.services

import com.projeto.atacadinho.domain.dto.request.UserRequestDto
import com.projeto.atacadinho.domain.dto.response.UserResponseDto

interface UserServiceInterface {
   fun save(userRequestDto: UserRequestDto): UserResponseDto
}