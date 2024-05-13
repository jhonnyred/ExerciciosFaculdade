package aula10.aula10_AC2;

import java.util.Scanner;

public class Ac2 {
    public static void main(String[] args) {
        // VARIÁVEIS BOOLEANS
        boolean prodigio = true;   //controla if responsavel pela exibicao de notas abaixo da minima (opera a nivel do while)
        boolean first = true;      //controla primeiro if dentro do for                              (opera a nivel do while)
        boolean check = false;     //permite a iteração dentro do while                              (opera a nivel do for)
        boolean reinserir = false; //permite reinsercao dos daos dos alunos

        // VARIÁVEIS 'ARMAZÉM'    (operam a nivel do WHILE)
        String nota_menor = "";    //armazena todas notas abaixo da minima de um aluno por iteração
        String ficha = "";         //armazena a ficha de um aluno por iteração
        float peso2 = 0;           //armazena o peso de um aluno por iteração
        float media = 0;           //armazena a media de um aluno por iteração
        int quantia = 0;           //armazena a quantia de notas

        // VARIÁVEIS 'OPERADORAS' (operam a nivel do FOR)
        String nota = "";          //nome da nota por iteração
        float valor = 0;           //valor da nota por iteração
        float peso = 0;            //peso da nota por iteração

        // INTRODUCAO
        Scanner input = new Scanner(System.in);
        System.out.println("\n>> MEDIA FINAL <<");

        // NOTA MINIMA
        System.out.print("Insira nota minina global: ");
        float minima = input.nextFloat();

        // NUMERO DE NOTAS
        System.out.print("Digite quantas notas serão calculadas: ");
        quantia = input.nextInt();


        while (true){ // WHILE
            //RESET DE VARIAVEIS
            reinserir = false;
            prodigio = true;
            first = true;
            nota_menor = "\nNotas abaixo da nota mínima necessária: ";
            peso2 = 0;
            media = 0;

            System.out.print("\n\nNome: ");
            input.nextLine();
            ficha = "\n\n"+ input.nextLine() +"\n";

            for (int i = 1; i <= quantia; i++){// FOR
                //RESET DE VARIAVEIS
                check = false;

                //NOME DA NOTA
                System.out.print("\nNome da nota: ");
                if (first == false){
                    input.nextLine();
                }else{
                    first = false;
                }
                nota = input.nextLine();
                
                //NOTA
                System.out.print("Nota: ");
                valor = input.nextFloat();
                nota = nota + ": "+ valor + " ";
                ficha = ficha + nota + "\n";

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
                
                //NOTAS MINIMAS
                if (minima > valor){
                    nota_menor = nota_menor + nota;
                    prodigio = false; 
                }

                //MEDIA
                valor *= peso;
                media += valor;
            
            }//*fim do for*

            //REINSERIR DADOS
            System.out.print(ficha + "\n\nDESEJA REINSERIR OS DADOS PARA O ALUNO ATUAL? \n(1)SIM (2)NAO\n===> ");
            valor = input.nextFloat();
            if(valor == 1){
                reinserir = true;
            }
            if (reinserir == false){

                //SAÍDA
                System.out.print(ficha);
                System.out.format("Media Final: %.2f", media);
                if (prodigio == false) {
                    System.out.println(nota_menor);
                } else {
                    System.out.println("\nTodas a notas do aluno estao acima da nota minima, bixao é brabo mesmo");
                }
    
                //APROVACAO
                if (media <= 2) {
                    System.out.println("REPROVADO\n");
                } else if (media <= 4.9) {
                    System.out.println("SUBSTITUTIVA NECESSARIA\n");
                } else {
                    System.out.println("APROVADO\n");
                }
    
                //INSERIR NOVO ALUNO
                System.out.print("\n\nDESEJA INSERIR NOVO ALUNO? \n(1) SIM (2) NAO\n===> ");
                valor = input.nextFloat();
                if (valor == 2){
                    break;
                }else{
                    continue;
                }
            
            }else{
                continue;
            }

        }//*fim while*
        
        input.close();

    }
}