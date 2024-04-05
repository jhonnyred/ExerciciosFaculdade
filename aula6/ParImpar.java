import java.util.Scanner;

public class ParImpar{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("PAR ou IMPAR: ");
        int numero = input.nextInt();
        
        if(numero < 20){


            if(numero%2 == 0){
                System.out.println("\n >>> PAR <<<\n");
            
                if(numero >= 10 && numero <= 50){
                    System.out.print("(dentro do range)");

                }else{
                    System.out.println("(fora do range)");
                }  
        
        
            }else{
                System.out.println("\n >>> IMPAR <<<\n");

                if(numero >= 11 && numero <= 51){
                    System.out.print("(dentro do range)");

                }else{
                    System.out.println("(fora do range)");
                }
            }
        
        }else{
            System.out.println("numero maior que 20");
        }
        
        input.close();
    }
}