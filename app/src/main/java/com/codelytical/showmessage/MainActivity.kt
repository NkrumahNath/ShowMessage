package com.codelytical.showmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val helloText = findViewById<TextView>(R.id.helloMessage)

		val message = MyMessage()

		val helloMessage = message.sayHello()

		helloText.text = helloMessage
	}
}