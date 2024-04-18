package aula7;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        // SCANNER E NOME DO PROGRAMA
        Scanner input = new Scanner(System.in);
        System.out.println("VERIFICADOR DE IDADE\n");

        System.out.print("Insira sua idade: ");
        int idade = input.nextInt();

        // CONDIÇÕES
        if (idade <= 12) {
            System.out.println("Você ainda é muleque");

        } else if (idade <= 19) {
            System.out.println("Adolescente");

        } else if (idade <= 25) {
            System.out.println("Jovem Adulto");

        } else if (idade <= 59) {
            System.out.println("Adulto");

        } else if (idade >= 60) {
            System.out.println("Idoso");

        } else {
            System.out.println("digite um valor inteiro positivo");
        }

        input.close();
    }
}