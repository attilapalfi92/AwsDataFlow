package com.attilapalfi.awsdataflow.streams.definitions

import org.springframework.data.jpa.repository.JpaRepository


interface StreamDefinitionRepository : JpaRepository<StreamDefinition, String>