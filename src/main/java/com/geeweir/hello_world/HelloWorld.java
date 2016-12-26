package com.geeweir.hello_world;

public class HelloWorld {
	
	public String sayHello() {
		return "Hello World.";
	}

	public static void main(String[] args) {
		System.out.println(new HelloWorld().sayHello());
	}

}