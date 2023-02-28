package com.codecool.helloworld.app;

import com.codecool.helloworld.hello.HelloWorld;

public class App {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.welcome(args[0]);
    }
}
