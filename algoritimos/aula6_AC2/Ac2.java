package aula6_AC2;

import java.util.Scanner;

public class Ac2 {
    public static void main(String[] args){
        double media;
        boolean prodigio = true;
        String nota_menor = "\nNotas abaixo da nota mínima necessária: ";
        //Como não aprendemos array nem listas, eu achei melhor armazenar as informações em uma string

        //INTRODUCAO
        Scanner input = new Scanner(System.in);
        System.out.println("\n>> MEDIA FINAL <<");

        //NOTA MINIMA
        System.out.print("Insira nota minina global: ");
        float minima = input.nextFloat();

        
        //AC1
        System.out.print("\nAC1: ");
        double ac1 = input.nextDouble();
        media = ac1*0.15;
        if (minima > ac1){
            nota_menor += "\nAC1: " + ac1;
            prodigio = false;
        }

        //AC2
        System.out.print("AC2: ");
        double ac2 = input.nextDouble();
        media += + (ac2*0.30);
        if (minima > ac2){
            nota_menor += "\nAC2: " + ac2;
            prodigio = false;
        }
        
        //AG
        System.out.print("AG: ");
        double ag = input.nextDouble();
        media += (ag*0.10);
        if (minima > ag){
            nota_menor += "\nAG: " + ag;
            prodigio = false;
        }

        //AF
        System.out.print("AF: ");
        double af = input.nextDouble();
        media = media + (af*0.45);
        if (minima > af){
            nota_menor += "\nAF: " + af;
            prodigio = false;
        }
        
        //MÉDIA FINAL
        if (minima > media){
            nota_menor += "\nMedia Final: " + media;
            prodigio = false;
        }
        
        //SAÍDA
        System.out.format("\nMedia Final: %.2f", media);

        if (prodigio == false){
            System.out.println("\n" + nota_menor);     
        }else{
            System.out.println("\nTodas suas notas estao acima da nota minima, Parabens!!! :D");
        }

        input.close();
    }
}
