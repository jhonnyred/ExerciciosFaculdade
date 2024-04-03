package aula4;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args){
        System.out.println("CALCULADOR DO PERIMETRO DE UM QUADRADO QUALQUER");
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de um dos lados do quadrado: ");
        int val = input.nextInt();

        System.out.println("O perimetro desse quadrado é: " + val*4);
        input.close();
    }
}
