package com.attilapalfi.awsdataflow.streams.definitions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class StreamDefinitionController(private val streamDefinitionService: StreamDefinitionService) {

    fun saveDefinition(streamDefinition: StreamDefinitionDto): ResponseEntity<StreamDefinitionDto> {
        val definition = streamDefinitionService.saveDefinition(streamDefinition)
        return ResponseEntity.status(HttpStatus.CREATED).body(definition)
    }

    fun list(): ResponseEntity<List<StreamDefinitionDto>> {
        return ResponseEntity.ok(streamDefinitionService.list())
    }
}