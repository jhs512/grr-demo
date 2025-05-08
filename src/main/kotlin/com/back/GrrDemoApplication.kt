package com.back

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrrDemoApplication

fun main(args: Array<String>) {
    runApplication<GrrDemoApplication>(*args)
}
