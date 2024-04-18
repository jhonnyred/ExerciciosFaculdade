package aula7;

import java.util.Scanner;

public class Metros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("     CONVERSOR DE METROS\n");
        
        System.out.println("(para selecionar uma opção basta digitar o número correspondente)");
        System.out.println("(1) KM   (2) M   (3) CM");
        int opcao = input.nextInt();
        
        //QUILOMETROS
        if (opcao == 1){
            
            System.out.println("METROS PARA KM");
            System.out.print("Digite a quantia em metros: ");
            float metros = input.nextFloat();

            System.out.println("\n" +metros+ "m corresponde a " +(metros/1000)+ "km");
        
        //METROS
        }else if(opcao == 2){
                        
            System.out.println("METROS PARA METROS");
            System.out.print("Digite a quantia em metros: ");
            float metros = input.nextFloat();

            System.out.println("\n" +metros+ "m corresponde a " +metros+ "m");
        
        //CENTIMETROS
        }else if(opcao == 3){
                        
            System.out.println("METROS PARA CM");
            System.out.print("Digite a quantia em metros: ");
            float metros = input.nextFloat();

            System.out.println("\n" +metros+ "m corresponde a " +(metros*100)+ "cm");
        
        //DEFAULT
        }else{
            
            System.out.println("Opcao digitada invalida, tente novamente desta vez selecionando uma das opcoes validas");
        }
        input.close();  
    }
}
