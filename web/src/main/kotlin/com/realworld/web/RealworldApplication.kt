package com.realworld.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.realworld.*"])
class RealworldApplication

fun main(args: Array<String>) {
	runApplication<RealworldApplication>(*args)
}
