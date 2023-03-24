package com.manitaggarwal.kotlinexample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl : GreetingService {

    @Autowired
    lateinit var greetingRepository: GreetingRepository

    override fun greet(name: String): String {

        val message = "Hello $name"

        greetingRepository.save(GreetingEntity(message))

        return message
    }
}