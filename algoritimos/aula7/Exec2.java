package aula7;

import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("  MAQUINA DE VENDAS");

        System.out.print("Digite a opçao: ");
        String opcao = input.nextLine();

        switch (opcao) {
            case "coca":
                System.out.println("Custa R$ 10,00");
                break;

            case "suco":
                System.out.println("Custa R$ 7,00");
                break;

            case "agua":
                System.out.println("Custa R$ 5,00");
                break;

            case "cafe":
                System.out.println("Custa R$ 3,00");
                break;

            default:
                System.out.println("COLOQUE UMA OPÇÃO VÁLIDA");
        }
        input.close();
    }
}
