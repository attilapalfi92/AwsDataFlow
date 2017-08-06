package com.attilapalfi.awsdataflow

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@ComponentScan
@Import(LocalConfiguration::class, CloudConfiguration::class, ConverterConfiguration::class)
class AwsDataFlowApplication

fun main(args: Array<String>) {
    SpringApplication.run(AwsDataFlowApplication::class.java, *args)
}
