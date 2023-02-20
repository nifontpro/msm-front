package ru.nb.medalist.msmfront.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.reactive.result.view.RedirectView

@Controller
class RedirectController {

	@GetMapping("/")
	fun index(): RedirectView {
		return RedirectView().apply {
			url = "http://localhost:3000"
		}
	}

	@GetMapping("/redirect")
	fun redirect(): RedirectView {
		return RedirectView().apply {
			url = "http://localhost:3000/redirect"
		}
	}

}