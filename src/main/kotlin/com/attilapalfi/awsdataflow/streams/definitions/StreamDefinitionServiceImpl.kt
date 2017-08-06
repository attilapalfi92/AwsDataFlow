package com.attilapalfi.awsdataflow.streams.definitions

import org.springframework.core.convert.ConversionService

class StreamDefinitionServiceImpl(private val streamDefinitionRepository: StreamDefinitionRepository,
                                  private val converter: ConversionService) :
        StreamDefinitionService {

    override fun saveDefinition(streamDefinition: StreamDefinitionDto): StreamDefinitionDto {
        val definition = converter.convert(streamDefinition, StreamDefinition::class.java)
        val saved = streamDefinitionRepository.save(definition)
        return converter.convert(saved, StreamDefinitionDto::class.java)
    }

    override fun list(): List<StreamDefinitionDto> {
        return streamDefinitionRepository.findAll()
                .map { converter.convert(it, StreamDefinitionDto::class.java) }
    }
}