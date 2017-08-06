package com.attilapalfi.awsdataflow.streams.definitions.converter

import com.attilapalfi.awsdataflow.streams.definitions.StreamDefinition
import com.attilapalfi.awsdataflow.streams.definitions.StreamDefinitionDto
import org.springframework.core.convert.converter.Converter

class StreamDefinitionConverter : Converter<StreamDefinition, StreamDefinitionDto> {

    override fun convert(source: StreamDefinition): StreamDefinitionDto {
        return StreamDefinitionDto(source.name, source.definition, source.deploy)
    }
}

class StreamDefinitionDtoConverter : Converter<StreamDefinitionDto, StreamDefinition> {

    override fun convert(source: StreamDefinitionDto): StreamDefinition {
        return StreamDefinition(source.name, source.definition, source.deploy)
    }
}