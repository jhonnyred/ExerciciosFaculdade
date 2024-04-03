package aula4;

import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args){
        System.out.println("CALCULADOR DE AREA DE UM QUADRADO");
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de um aresta do quadrado: ");
        int val = input.nextInt();

        System.out.println("O valor da area deste quadrado é: " + (val*val));
        input.close();
    }
}
