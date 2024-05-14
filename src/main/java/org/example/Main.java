package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RecursiveSolutions recursiveSolutions = new RecursiveSolutions();

        System.out.println(recursiveSolutions.factorial(10));

        System.out.println(recursiveSolutions.fibonacci(40));

        System.out.println("is Moon a palindorme" + recursiveSolutions.isPalindorme("Moon"));
        System.out.println("is Noon a palindorme" + recursiveSolutions.isPalindorme("noon"));

        double[] list = {24, 45, 1, 78, 8, 32, 9, 21};
        recursiveSolutions.selectionSort(list, 0, 7);
        for(double element : list)
            System.out.println(element);
    }


}