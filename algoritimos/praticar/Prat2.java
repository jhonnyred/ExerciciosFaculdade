package praticar;

import java.util.Scanner;

public class Prat2 {
    public static void main(String[] args){
        System.out.println("CALCULADOR DE IDADE EM DIAS");
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a idade a ser convertida para dias: ");
        int idad = input.nextInt();

        int dias = idad * 365;
        System.out.println(idad + " anos corresponde a aproximadamente " + dias + " dias, sem considerar os anos bissextos");
        input.close();
    }
}
