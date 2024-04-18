package praticar;

import java.util.Scanner;

public class Prat3 {
    public static void main(String [] args){
        System.out.println("CALCULADOR DE QUADRADO DE UM NÚMERO");
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número para elevar ao quadrado: ");
        int num = input.nextInt();

        int num2 = num * num;
        System.out.println(num + " elevado ao quadrado é " + num2);
        input.close();
    }
}
