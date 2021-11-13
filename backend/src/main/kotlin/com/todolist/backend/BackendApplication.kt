package com.todolist.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BackendApplication

fun main(args: Array<String>) {
	//runApplication<BackendApplication>(*args)
	first()
	println("3 + 345 = ${plus(3, 345)}")
	valCheck()

	val rectangle = Rectangle(3.0,4.0)
	println(rectangle.perimeter)
	println(maxOf(4, 7))
	loopCheck()
}

fun first() {
	print("hi")
	print(41)
	println("hello world!")
}

fun plus(a: Int, b: Int): Int {
	return a + b
}

fun valCheck() {
	val a = 1
	val b: Int = 3
	var c: Int = a + b
	val d = "a is $a"
	var f = "${d.replace("is", "was")}, but now is $a"
	println(f)
}

class Rectangle(var height: Double, var length: Double){
	var perimeter: Double = (height + length) * 2
}

fun maxOf(a: Int, b: Int) = if(a>b) a else b

fun loopCheck() {
	val items = listOf("app", "bpp", "cpp")
	var index = 0
	println(items.size)
	for (i in items) {
		println(i)
	}
	for(i in items.indices) {
		println(i)
		println("이건 item at $i is ${items[i]}")
	}

	while (index < items.size){
		when(items[index]) {
			"app" -> println("this app")
			"bpp" -> println("this bpp")
			else -> println("cpp")
		}
		index++
	}
}