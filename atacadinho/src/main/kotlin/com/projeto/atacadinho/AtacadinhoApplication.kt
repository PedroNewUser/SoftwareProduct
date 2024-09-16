package com.projeto.atacadinho

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class AtacadinhoApplication

fun main(args: Array<String>) {
	runApplication<AtacadinhoApplication>(*args)
}
