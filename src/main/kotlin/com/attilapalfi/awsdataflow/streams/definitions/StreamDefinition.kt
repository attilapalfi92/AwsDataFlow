package com.attilapalfi.awsdataflow.streams.definitions

import javax.persistence.Id


data class StreamDefinition(@Id val name: String = "", val definition: String = "", val deploy: Boolean = false)