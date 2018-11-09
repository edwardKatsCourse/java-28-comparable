package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        String[] names = new String[0];
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter some text (or \"exit\" to quit)");
            String text = scanner.nextLine();
            //String [] namesTemp = new String[names.length + 1];
            String[] namesTemp = Arrays.copyOf(names, names.length + 1);

            if (text.equals("exit")) {
                break;
            }

            namesTemp[namesTemp.length - 1] = text;
            names = namesTemp;
        }


//        boolean shouldSort = new Scanner(System.in).nextBoolean();
        System.out.println("Sort? (\"yes\" / \"no\")");
        String yesNo = new Scanner(System.in).nextLine();
        boolean shouldSort = yesNo.equalsIgnoreCase("yes") ? true : false;

//        boolean shouldSort = false;
//        if (yesNo.equalsIgnoreCase("yes")) {
//            shouldSort = true;
//        } else {
//            shouldSort = false;
//        }
        if (shouldSort) {
            Arrays.sort(names);
        }


        for (String element : names) {
            System.out.println(element);
        }
    }
}
