package aula4;

import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args){
        System.out.println("CALCULADOR DO PERIMETRO DE UM RETANGULO QUALQUER");
        Scanner input = new Scanner(System.in);

        System.out.print("Coloque uma aresta do retangulo: ");
        int are1 = input.nextInt();

        System.out.print("Coloque a segunda aresta do retangulo: ");
        int are2 = input.nextInt();

        int peri = 2 * are1 + 2 * are2;
        //aqui eu fui humilde de criar uma variável para o perímetro, mas foi só por prática mesmo
        System.out.println("O perimetro do retangulo qualquer que voce descreveu é " + peri);
        input.close();
    }
}
