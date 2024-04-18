package praticar;

import java.util.Scanner;

public class Prat1{
    public static void main(String[] args){
        System.out.println("COVERSOR DE HORAS EM MINUTOS");
        Scanner input = new Scanner(System.in);

        System.out.print("Insira quantas horas deseja converter em minuto: ");
        int hrs = input.nextInt();

        int min = hrs * 60;
        System.out.println(hrs + "h corresponde a " + min + " minutos");
        input.close();
    }
}