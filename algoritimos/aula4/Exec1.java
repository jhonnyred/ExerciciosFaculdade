package aula4;

import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" CALCULADOR DE RAIZ CÚBICA >:D ");
        
        System.out.print("Insira um número (não vale número quebrado pf): ");
        int numero = input.nextInt();

        System.out.println("A raiz cubica é: " + (numero*numero*numero));
        input.close();
    }
}
