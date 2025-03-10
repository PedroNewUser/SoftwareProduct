package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dtos.request.UserRequestDto
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

    @PutMapping("/atualizar/{id}")
    fun update(@PathVariable id: Long, @RequestBody userRequestDto: UserRequestDto): UserResponseDto {
        return userService.update(id, userRequestDto)
    }

}
