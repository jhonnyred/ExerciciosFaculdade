package aula7;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("   POSITIVO OU NEGATIVO \n");

        System.out.print("Digite um numero: ");
        int nume = input.nextInt();

        if (nume > 0) {
            System.out.println("\nPOSITIVO");

        } else {
            System.out.println("\nNEGATIVO");
        }

        input.close();
    }
}
