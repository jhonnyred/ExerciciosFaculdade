package aula7;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("   CALCULADORA DE IMC");

        //INPUT PESO
        System.out.print("Digite seu peso em kilogramas(kg): ");
        String string = input.nextLine();
        float peso = Float.parseFloat(string.replace(",","."));

        //INPUT ALTURA
        System.out.print("Digite a sua altura em metros(m): ");
        string = input.nextLine();
        float altura = Float.parseFloat(string.replace(",","."));

        //MUITO ABAIXO
        if(peso/(altura*altura) <= 16.9){

            System.out.println("Seu IMC é: " +(peso/(altura*altura)+ " muito abaixo do peso, seu magro raquítico"));
        
        //POUCO ABAIXO
        }else if(peso/(altura*altura) >= 17 && peso/(altura*altura) <= 18.4 ){

            System.out.println("Seu IMC é: " +(peso/(altura*altura)+ " ta só abaixo do peso, come mais feijão"));
        
        //PESO NORMAL
        }else if(peso/(altura*altura) >= 18.5 && peso/(altura*altura) <= 24.9){

            System.out.println("Seu IMC é: " +(peso/(altura*altura)+ " ta mec pai"));
        
        //ACIMA DP PESO
        }else if(peso/(altura*altura) >= 25 && peso/(altura*altura) <= 29.9){

            System.out.println("Seu IMC é: " +(peso/(altura*altura)+ " ta meio gordinho ein"));
        
        //OBESIDADE GRAU I
        }else if(peso/(altura*altura) >= 30 && peso/(altura*altura) <= 34.9){

            System.out.println("Seu IMC é: " +(peso/(altura*altura)+ " obesidade grau I amigão"));
        
        //OBESIDADE GRAU II
        }else if(peso/(altura*altura) >= 35 && peso/(altura*altura) <= 40){

            System.out.println("Seu IMC é: " +(peso/(altura*altura)+ " obesidade grau II parceiro, ja tá tenso"));
        
        //OBESIDADE GRAU III
        }else if(peso/(altura*altura) > 40){

            System.out.println("Seu IMC é: " +(peso/(altura*altura)+ " obesidade grau III, num da nem pra brincar que a situação ta crítica"));
        }
        input.close();
    }
}
