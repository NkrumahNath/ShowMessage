package com.codelytical.showmessage

class MyMessage {
	fun sayHello(): String {
		return "Hello, World!"
	}

	fun sayCustomHello(message: String): String {
		return "Hello, $message!"
	}
}