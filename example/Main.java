package example;

import java.util.Scanner;

import static example.OneClassTasks.PrimeDivisors.primeDivisors;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(primeDivisors(sc.nextInt()));


    }


}