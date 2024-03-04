package br.tihasg.com.foru

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ForuApplication

fun main(args: Array<String>) {
	runApplication<ForuApplication>(*args)
}
