package test.gradle.kotlin.dsl

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@Configuration
@PropertySource("classpath:application.properties")
class GradleKotlinDslApplication : ApplicationRunner {

    @Value("\${application.version}")
    private lateinit var appVersion: String

    override fun run(args: ApplicationArguments) {
        println("Testing gradle kotlin dsl - $appVersion")
    }
}

fun main(args: Array<String>) {
    SpringApplicationBuilder(GradleKotlinDslApplication::class.java).web(WebApplicationType.NONE).run(*args)
}