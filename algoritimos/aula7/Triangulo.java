package aula7;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("   IDENTIFICADOR DE TRIANGULO\n");
        //por algum motivo o código não rodou com o formato float

        //PRIMEIRO LADO
        System.out.print("Digite a medida do primeiro lado do triangulo: ");
        //String string = input.nextLine();
        //float primeiro = Float.parseFloat(string.replace(",","."));
        int primeiro = input.nextInt();

        //SEGUNDO LADO
        System.out.print("\nDigite a medida do segundo lado do triangulo: ");
        //string = input.nextLine();
        //float segundo = Float.parseFloat(string.replace(",","."));
        int segundo = input.nextInt();

        //TERCEIRO LADO
        System.out.print("\nDigite a medida do terceiro lado do triangulo: ");
        //string = input.nextLine();
        //float terceiro = Float.parseFloat(string.replace(",","."));
        int terceiro = input.nextInt();

        System.out.println(primeiro + segundo + terceiro);

        //IF ELSE DA VIDA
        //EQUILATERO
        if ((primeiro == segundo) && (primeiro == terceiro)){

            System.out.println("Eh um triangulo equilatero");

        //ISOCELES
        }else if((primeiro == segundo) && (primeiro != terceiro) || (primeiro == terceiro) && (primeiro != segundo) || (segundo == terceiro) && (segundo != primeiro)){

            System.out.println("Eh um triangulo isoceles");

        //ESCALENO
        }else if((primeiro != segundo) && (primeiro != terceiro) && (segundo != terceiro)){

            System.out.println("Eh um triangulo escaleno");

        //DEFAULT
        }else{

            System.out.println("O triangulo descrito não se encontra entre as descrições");
        }
        input.close();
    }    
}
