package pl.bruteforce.squadhealthcheck

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SquadHealthCheckApplication

fun main(args: Array<String>) {
    runApplication<SquadHealthCheckApplication>(*args)
}
