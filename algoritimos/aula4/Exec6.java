package aula4;

import java.util.Scanner;

public class Exec6 {
    public static void main(String[] args){
        System.out.println("TA QUERENDO SE INDIVIDAR NE?");
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor base (capital) em que o juros será cobrado: R$");
        String str = input.nextLine();
        double val = Double.parseDouble(str.replace(",","."));
        //o nextDouble() não aceitava decimais com ".", somente com "," 
        //então eu dei meu jeito de ele aceitar tanto vírgula quanto ponto

        System.out.print("Insira a quantia de parcelas: ");
        int par = input.nextInt();

        System.out.print("Insira a porcentagem da taxa de juros (não é necessário acrescentar '%'): ");
        double tax = input.nextInt();
        tax = (tax/100) * val;

        double jur = tax * par;
        double total = tax + val;


        System.out.format("\nOs juros a ser cobrado será: R$%.2f", jur);
        System.out.format(" e o valor total será R$%.2f", total);
        input.close();
        
    }
}
