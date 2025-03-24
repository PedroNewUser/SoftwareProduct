package com.projeto.atacadinho.domain.services

import com.projeto.atacadinho.domain.dtos.request.UserLoginRequestDto
import com.projeto.atacadinho.domain.dtos.response.UserResponseDto
import com.projeto.atacadinho.domain.dtos.request.UserRequestDto
import com.projeto.atacadinho.domain.dtos.request.UserUpdateRequestDto

interface UserServiceInterface{
   fun save(userRequestDto: UserRequestDto): UserResponseDto
   fun update(userRequestDto: UserUpdateRequestDto): UserResponseDto
   fun login(userLoginRequestDto: UserLoginRequestDto): String
}
