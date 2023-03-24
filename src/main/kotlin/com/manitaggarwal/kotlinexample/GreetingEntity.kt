package com.manitaggarwal.kotlinexample

import jakarta.persistence.*

@Entity
@Table(name = "greeting")
data class GreetingEntity(var message: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: String = ""

}