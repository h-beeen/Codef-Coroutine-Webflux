package dev.beeenflux.global.config

import io.r2dbc.spi.ConnectionFactories
import io.r2dbc.spi.ConnectionFactory
import io.r2dbc.spi.ConnectionFactoryOptions.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@Configuration
@EnableR2dbcRepositories
class MySQLConfig : AbstractR2dbcConfiguration() {
    @Bean
    override fun connectionFactory(): ConnectionFactory {
        return ConnectionFactories.get(
            builder()
                .option(DRIVER, "mysql")
                .option(HOST, "localhost")
                .option(PORT, 3306)
                .option(USER, "root")
                .option(DATABASE, "beeenflux")
                .build()
        )
    }
}
