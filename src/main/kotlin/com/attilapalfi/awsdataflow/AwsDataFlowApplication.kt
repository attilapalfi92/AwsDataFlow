package com.attilapalfi.awsdataflow

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AwsDataFlowApplication

fun main(args: Array<String>) {
    SpringApplication.run(AwsDataFlowApplication::class.java, *args)
}
