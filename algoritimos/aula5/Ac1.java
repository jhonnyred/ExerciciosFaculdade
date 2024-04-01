package aula5;

import java.util.Scanner;

public class Ac1 {
    public static void main(String[] args){
        double media;
        Scanner input = new Scanner(System.in);
        
        System.out.println(">> MÉDIA FINAL <<\n");
        
        //AC1
        System.out.print("AC1: ");
        double ac1 = input.nextDouble();
        media = ac1*0.15;

        //AC2
        System.out.print("AC2: ");
        double ac2 = input.nextDouble();
        media = media + (ac2*0.30);
        
        //AG
        System.out.print("AG: ");
        double ag = input.nextDouble();
        media = media + (ag*0.10);

        //AF
        System.out.print("AF: ");
        media = media + (input.nextDouble()*0.45);

        //SAÍDA
        System.out.format("Média Final: %.2f", media);

        input.close();
    }
}
