package aula7;

import java.util.Scanner;

public class ManTarNoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TA NA FINLANDIA FDP????");

        System.out.print("Digite a hora do dia: ");
        float horas = input.nextFloat();

        if (horas <= 12) {
            System.out.println("MANHA");

        } else if (horas >= 12.31 && horas < 18) {
            System.out.println("TARDE");

        } else if (horas >= 18 && horas <= 24) {
            System.out.println("NOITE");

        } else {
            System.out.println("TU DIGITOU " + horas + " ISSO É HORA POR ACASO?!");
        }
        input.close();
    }
}
