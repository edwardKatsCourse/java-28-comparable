package com.company.product;

import java.util.Arrays;

public class ProductRunner {

    public static void main(String[] args) {
        Product p1 = new Product(
                "z",
                "seller",
                1.0);

        Product p2 = new Product(
                "a",
                "seller",
                1.0);

        Product p3 = new Product(
                "a",
                "seller",
                10.0);

        Product[] products = new Product[]{p1, p2, p3};

        Arrays.sort(products);
//
        for (Product p : products) {
            System.out.println(p);
        }

//        String [] names = new String[] {"a", "b", "c"};
//        Arrays.sort(names);
//
//        for (String s : names) {
//            System.out.println(s);
//        }



    }
}
