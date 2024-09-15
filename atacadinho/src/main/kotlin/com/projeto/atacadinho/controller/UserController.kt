package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dto.request.UserRequestDto
import com.projeto.atacadinho.domain.dto.response.UserResponseDto
import com.projeto.atacadinho.services.UserServiceInterface
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuario")
class UserController(
    val userService: UserServiceInterface) {

    @PostMapping("/cadastrar")
    fun save(@RequestBody userRequestDto: UserRequestDto) : UserResponseDto {
        return userService.save(userRequestDto)
    }
}