package com.projeto.atacadinho.services

import com.projeto.atacadinho.request.UserRequestDto
import com.projeto.atacadinho.domain.dto.UserResponseDto


interface UserServiceInterface{
   fun save(userRequestDto: UserRequestDto): UserResponseDto
}