package ru.nb.medalist.msmfront.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController {

	@GetMapping("test")
	suspend fun test(): String {
		return "Test front"
	}
}