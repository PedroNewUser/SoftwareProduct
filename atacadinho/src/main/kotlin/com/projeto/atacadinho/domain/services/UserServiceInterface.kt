package com.projeto.atacadinho.domain.services

import com.projeto.atacadinho.domain.dtos.response.UserResponseDto
import com.projeto.atacadinho.domain.dtos.request.UserRequestDto

interface UserServiceInterface{
   fun save(userRequestDto: UserRequestDto): UserResponseDto
   fun update(id: Long, userRequestDto: UserRequestDto): UserResponseDto}
