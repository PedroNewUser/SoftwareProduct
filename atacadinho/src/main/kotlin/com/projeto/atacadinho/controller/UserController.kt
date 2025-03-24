package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dtos.request.UserLoginRequestDto
import com.projeto.atacadinho.domain.dtos.request.UserRequestDto
import com.projeto.atacadinho.domain.dtos.request.UserUpdateRequestDto
import com.projeto.atacadinho.domain.dtos.response.UserResponseDto
import com.projeto.atacadinho.domain.services.UserServiceInterface
import org.springframework.web.bind.annotation.*

@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
class UserController(
    val userService: UserServiceInterface
) {

    @PostMapping("/cadastrar")
    fun save(@RequestBody userRequestDto: UserRequestDto) : UserResponseDto {
        return userService.save(userRequestDto)
    }

    @PutMapping("/atualizar/usuario")
    fun updateUser(@RequestBody userUpdateRequestDto: UserUpdateRequestDto): UserResponseDto {
        return userService.update(userUpdateRequestDto)
    }

    @PostMapping("/login")
    fun login(@RequestBody userLoginRequestDto: UserLoginRequestDto) : String {
        return userService.login(userLoginRequestDto)
    }
}
