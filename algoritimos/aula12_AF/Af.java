package aula12_AF;

import java.util.Scanner;

public class Af {
    public static void main(String[] args) {
        // VARIÁVEIS BOOLEANS
        boolean prodigio = true;   //controla if responsavel pela exibicao de notas abaixo da minima                      (opera a nivel do primeiro for)
        boolean first = true;      //controla primeiro if dentro do for                                                   (opera a nivel do primeiro for)
        boolean check = false;     //permite a iteração dentro do while                                                   (opera no verificador de peso e no DO WHILE)
        boolean reinserir = false; //permite a reinserção de dados                                                        (opera no DO WHILE)

        // VARIÁVEIS 'ARMAZÉM'    (operam a nivel do PRIMEIRO FOR ou acima dele)
        String nota_menor = "";    //armazena todas notas abaixo da minima de um aluno por iteração
        String ficha = "";         //armazena a ficha de um aluno por iteração
        String nome = "";
        float peso = 0;            //armazena o peso total de todas as notas
        float media = 0;           //armazena a media de um aluno por iteração
        float medias = 0;          //armazena a somatoria das medias                                                      (opera no último FOR)
        float minima = 0;          //armazena a nota mínima global
        int quantia = 0;           //armazena a quantia de notas
        int alunos = 0;            //armazena quantia de alunos

        // VARIÁVEIS 'OPERADORAS' (operam a nivel do SEGUNDO FOR)
        String nota = "";          //nome da nota por iteração
        float resposta = 0;        //resposta para reinserção de dados
        int iteracao = 0;

        // INTRODUCAO
        Scanner input = new Scanner(System.in);
        System.out.println("\n>> MEDIA FINAL <<");
        
        // NOTA MINIMA
        System.out.print("Insira nota minina global: ");
        minima = input.nextFloat();

        // NUMERO DE ALUNOS
        System.out.print("Insira o numero de alunos: ");
        alunos = input.nextInt();
        float[] vetmedias = new float[alunos];

        // NUMERO DE NOTAS
        System.out.print("Digite quantas notas serão calculadas: ");
        quantia = input.nextInt();
        float[] vetpesos = new float[quantia];
        float[] todasnotas = new float[quantia];
        
        //ATRIBUIÇÃO DE PESOS
        for (int i = 0; i < quantia; i++){
            check = false;
            System.out.print("peso para a " +(i+1)+ "º nota: ");
            vetpesos[i] = input.nextFloat();
            peso += vetpesos[i];
            
            //VERIFICADOR DE PESO
            while(check == false){
                if(peso > 1){
                    System.out.println("Somatória dos pesos: " + peso);
                    System.out.print("A somatória dos pesos é maior que 100%, por favor insira um valor menor: ");
                    peso -= vetpesos[i];
                    vetpesos[i] = input.nextFloat();
                    peso += vetpesos[i];
                }else{
                    check = true;
                }
            }//fim WHILE
        }//fim FOR
        

        for (int j = 0; j < alunos; j++){ // PRIMEIRO FOR
            //MANUTENÇÃO DE VARIÁVEIS
            prodigio = true;
            first = true;
            check = false;
            nota_menor = "\nNotas abaixo da nota mínima necessária: ";
            iteracao = 0;
            media = 0;

            System.out.print("\n\nNome: ");
            input.nextLine();
            nome = input.nextLine();
            ficha = "\n\n"+ nome +"\n";

            do{// DO WHILE

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
                todasnotas[iteracao] = input.nextFloat();
                nota = nota + ": "+ todasnotas[iteracao] + " ";
                ficha = ficha + nota + "\n";
                
                //NOTAS MINIMAS
                if (minima > todasnotas[iteracao]){
                    nota_menor = nota_menor + nota;
                    prodigio = false; 
                }

                //MEDIA
                todasnotas[iteracao] *= vetpesos[iteracao];
                media += todasnotas[iteracao];

                //REINSERIR DADOS
                if(iteracao == (quantia-1)){
                    System.out.print(ficha + "\n\nDESEJA REINSERIR OS DADOS PARA O ALUNO ATUAL? \n(1)SIM (2)NAO\n===> ");
                    resposta = input.nextFloat();

                    if (resposta == 2){
                        check = true; 
                    }else{
                        reinserir = true;
                    }

                }else{
                    iteracao++;
                }
                
                //RESET DE VARIÁVEIS (REINSERIR)
                if (reinserir == true){
                    reinserir = false;
                    iteracao = 0;
                    ficha = "\n\n"+ nome +"\n";
                    nota_menor = "\nNotas abaixo da nota mínima necessária: ";
                    media = 0;
                }
    
            }while(check == false);//*fim do DO WHILE*

            //ADICIONA A MÉDIA AO VETOR DE MÉDIAS
            vetmedias[j] = media;

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

        }//*fim PRIMEIRO FOR*

        // MÉDIA DAS MÉDIAS
        for(int i = 0; i < vetmedias.length; i++){
            medias += vetmedias[i];
        }

        System.out.println("Media dos alunos: " + (medias/vetmedias.length));
        
        input.close();
    }               
}
