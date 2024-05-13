package aula8.aula8_AC2;

import java.util.Scanner;

public class Ac2 {
    public static void main(String[] args) {
        boolean check = false;                                            //permite iterações dentro do while
        boolean prodigio = true;                                          //controla if responsável pela exibição de notas abaixo da minima
        
        //VARIÁVEIS 'ARMAZÉM'
        String nota_menor = "\nNotas abaixo da nota mínima necessária: "; //armazena notas abaixo da nota minima global
        String nota2 = "\n\n\n";                                          //armazena todas as notas a serem exibidas
        float media = 0;                                                  //armazena a média final
        float peso2 = 0;                                                  //armazena a somatória dos pesos
        
        //VARIÁVEIS 'OPERADORAS'
        String nota = "";                                                 //nome da nota por iteração
        float peso = 0;                                                   //peso da nota por iteração
        float valor = 0;                                                  //valor da nota por iteração

        // INTRODUCAO
        Scanner input = new Scanner(System.in);
        System.out.println("\n>> MEDIA FINAL <<");

        // NOTA MINIMA
        System.out.print("Insira nota minina global: ");
        float minima = input.nextFloat();

        // NUMERO DE NOTAS
        System.out.print("Digite quantas notas serão calculadas: ");
        int quantia = input.nextInt();



        for (int i = 1; i <= quantia; i++){
            check = false;
            //reseta a verificacao

            //NOME DA NOTA
            System.out.print("\nNome da nota: ");
            input.nextLine();
            nota = input.nextLine();
            //tive q colocar essa linha extra para conseguir limpar o buffer e remover possíveis "\n"
            //que ficaram, ele tava skippando esse primeiro scanner

            //PESO
            System.out.print("Peso: ");
            peso = input.nextFloat();
            peso2 += peso;

            //VERIFICACAO DE PESO
            while (check == false){   
                if(peso2 > 1){
                    System.out.println("Somatória dos pesos: " + peso2);
                    System.out.print("A somatória dos pesos é maior que 100%, por favor insira um valor menor: ");
                    peso2 -= peso;
                    peso = input.nextFloat();
                    peso2 += peso;
                
                }else{
                    check = true;
                }
            }

            //NOTA
            System.out.print("Nota: ");
            valor = input.nextFloat();
            nota = nota +": "+ valor + " ";
            nota2 = nota2 + nota + "\n";

            //NOTAS MINIMAS
            if (minima > valor){
                nota_menor += nota;
                prodigio = false; 
            }

            //MEDIA
            valor *= peso;
            media += valor;
        }



        // SAÍDA
        System.out.println(nota2);
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
