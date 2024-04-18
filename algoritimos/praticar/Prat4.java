package praticar;

import java.util.Scanner;

public class Prat4 {
    public static void main(String[] args){
        System.out.println("CALCULADOR DE RESTO");
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um numero dividendo: ");
        int num = input.nextInt();

        System.out.print("Insira um numero divisor: ");
        int div = input.nextInt();

        int mod = num % div;
        System.out.println("O módulo (resto) desta operação é: " + mod);
        input.close();
    }
}
