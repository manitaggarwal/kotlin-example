package com.manitaggarwal.kotlinexample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api")
class GreetingController {

    @Autowired
    lateinit var greetingService: GreetingService

    @GetMapping("/greeting/{name}")
    fun greet(@PathVariable name: String): String {
        return greetingService.greet(name)
    }

}