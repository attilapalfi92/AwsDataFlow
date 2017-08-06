package com.attilapalfi.awsdataflow

import com.attilapalfi.awsdataflow.streams.definitions.converter.StreamDefinitionConverter
import com.attilapalfi.awsdataflow.streams.definitions.converter.StreamDefinitionDtoConverter
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.aws.autoconfigure.actuate.CloudWatchMetricAutoConfiguration
import org.springframework.cloud.aws.autoconfigure.cache.ElastiCacheAutoConfiguration
import org.springframework.cloud.aws.autoconfigure.context.*
import org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfiguration
import org.springframework.cloud.aws.autoconfigure.mail.MailSenderAutoConfiguration
import org.springframework.cloud.aws.autoconfigure.messaging.MessagingAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.core.convert.ConversionService
import org.springframework.core.convert.support.DefaultConversionService

@Configuration
class ConverterConfiguration {

    @Bean
    fun conversionService(): ConversionService {
        val conversionService = DefaultConversionService()
        conversionService.addConverter(StreamDefinitionConverter())
        conversionService.addConverter(StreamDefinitionDtoConverter())
        return conversionService
    }
}

@Configuration
@Profile("default")
@EnableAutoConfiguration(exclude = arrayOf(ContextInstanceDataAutoConfiguration::class,
        ContextCredentialsAutoConfiguration::class,
        ContextRegionProviderAutoConfiguration::class,
        ContextResourceLoaderAutoConfiguration::class,
        ContextStackAutoConfiguration::class,
        MailSenderAutoConfiguration::class,
        ElastiCacheAutoConfiguration::class,
        MessagingAutoConfiguration::class,
        AmazonRdsDatabaseAutoConfiguration::class,
        CloudWatchMetricAutoConfiguration::class))
class LocalConfiguration


@Configuration
@Profile("cloud")
@EnableAutoConfiguration
class CloudConfiguration
