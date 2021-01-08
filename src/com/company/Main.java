//IntelliJ IDEA Full Course 2020 YT videos
// https://github.com/amigoscode/spring-boot-react-fullstack

package com.company;

import com.company.model.Product;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String helloWorld = "Hello World";
        System.out.println(helloWorld);

        System.out.println("Hello World");

        Product product = new Product("Keyboard");

        System.out.println(product.getName());
    }
}
