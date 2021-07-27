package com.microservices.chapter2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller


@SpringBootApplication
class Chapter2Application

fun main(args: Array<String>) {
	runApplication<Chapter2Application>(*args)
}
