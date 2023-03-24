package com.manitaggarwal.kotlinexample

import org.springframework.data.repository.CrudRepository

interface GreetingRepository : CrudRepository<GreetingEntity, String> {
}