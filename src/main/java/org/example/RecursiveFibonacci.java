package org.example;

public class RecursiveFibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(7));

    }
    public static int fibonacci(int numero){
        //base Case
        if(numero == 0  || numero == 1) return numero;
        else
            return fibonacci(numero -1) + fibonacci(numero-2);
    }
}
