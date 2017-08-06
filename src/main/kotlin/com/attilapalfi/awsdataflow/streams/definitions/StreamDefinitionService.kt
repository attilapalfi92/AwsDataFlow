package com.attilapalfi.awsdataflow.streams.definitions


interface StreamDefinitionService {
    fun saveDefinition(streamDefinition: StreamDefinitionDto): StreamDefinitionDto

    fun list(): List<StreamDefinitionDto>
}