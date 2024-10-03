package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dtos.request.UserRequestDto
import com.projeto.atacadinho.domain.dtos.response.UserResponseDto
import com.projeto.atacadinho.domain.services.UserServiceInterface
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuario")
@CrossOrigin("http://localhost:63342")
class UserController(
    val userService: UserServiceInterface
) {

    @PostMapping("/cadastrar")
    fun save(@RequestBody userRequestDto: UserRequestDto) : UserResponseDto {
        return userService.save(userRequestDto)
    }

}

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//    @PostMapping("/cadastrar")
//    fun save(@RequestBody userRequestDto: UserRequestDto): String {
//        userService.save(userRequestDto)
//        return "Usuário cadastrado com sucesso!

