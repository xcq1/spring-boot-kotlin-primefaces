package com.example.demo

import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component("dummy")
class DummyBean {

    val text = "Hello from Spring: " + LocalDateTime.now().toString()
}