package aula7.aula7_AC2;

import java.util.Scanner;

public class Ac2 {
    public static void main(String[] args) {
        double media;
        boolean prodigio = true;
        String nota_menor = "\nNotas abaixo da nota mínima necessária: ";

        // INTRODUCAO
        Scanner input = new Scanner(System.in);
        System.out.println("\n>> MEDIA FINAL <<");

        // NOTA MINIMA
        System.out.print("Insira nota minina global: ");
        float minima = input.nextFloat();

        // AC1
        System.out.print("\nAC1: ");
        float ac1 = input.nextFloat();
        media = ac1 * 0.15;
        if (minima > ac1) {
            nota_menor += "\nAC1: " + ac1;
            prodigio = false;
        }

        // AC2
        System.out.print("AC2: ");
        float ac2 = input.nextFloat();
        media += (ac2 * 0.30);
        if (minima > ac2) {
            nota_menor += "\nAC2: " + ac2;
            prodigio = false;
        }

        // AG
        System.out.print("AG: ");
        float ag = input.nextFloat();
        media += (ag * 0.10);
        if (minima > ag) {
            nota_menor += "\nAG: " + ag;
            prodigio = false;
        }

        // AF
        System.out.print("AF: ");
        float af = input.nextFloat();
        media += (af * 0.45);
        if (minima > af) {
            nota_menor += "\nAF: " + af;
            prodigio = false;
        }

        // MÉDIA FINAL
        if (minima > media) {
            nota_menor += "\nMedia Final: " + media;
            prodigio = false;
        }

        // SAÍDA
        System.out.format("\nMedia Final: %.2f", media);
        if (prodigio == false) {
            System.out.println("\n" + nota_menor);

        } else {
            System.out.println("\nTodas suas notas estao acima da nota minima, Parabens!!! :D");
        }

        // APROVACAO
        if (media <= 2) {
            System.out.println("\nREPROVADO");
        } else if (media <= 4.9) {
            System.out.println("\nSUBSTITUTIVA NECESSARIA");
        } else {
            System.out.println("\nAPROVADO");
        }

        input.close();
    }
}
