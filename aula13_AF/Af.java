package aula13_AF;

import java.util.Scanner;

public class Af {
    public static void main(String[] args) {
        // VARIÁVEIS BOOLEANS
        boolean prodigio = true;   //controla if responsavel pela exibicao de notas abaixo da minima                      (opera a nivel do primeiro for)
        boolean first = true;      //controla primeiro if dentro do for                                                   (opera a nivel do primeiro for)
        boolean check = false;     //permite a iteração dentro do while                                                   (opera no verificador de peso e no DO WHILE)

        // VARIÁVEIS 'ARMAZÉM'    (operam a nivel do PRIMEIRO FOR ou acima dele)
        String[][] nomes;          //matriz com os nomes das notas e dos alunos
        float[][] data;            //matriz com as notas e as médias de cada aluno
        float pesoTmp = 0;         //armazena o peso total de todas as notas
        float medias = 0;          //armazena a somatoria das medias                                                      (opera no último FOR)
        float minima = 0;          //armazena a nota mínima global
        int quantia = 0;           //armazena a quantia de notas
        int alunos = 0;            //armazena quantia de alunos

        // VARIÁVEIS 'OPERADORAS' (operam a nivel do SEGUNDO FOR)
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
        data = new float[quantia+2][alunos*2];
        if(quantia >= alunos){
            nomes = new String[quantia][2];
        }else{
            nomes = new String[alunos][2];
        }


        //NOME DA NOTA
        System.out.println();
        for(int i=0; i < quantia; i++){
            System.out.print("Nome da " +(i+1)+"º nota: ");
            if (first == true){
                input.nextLine();
                first = false;
            }
            nomes[i][1] = input.nextLine();

        }
        
        //ATRIBUIÇÃO DE PESOS
        System.out.println();
        for (int i = 0; i < quantia; i++){
            check = false;
            System.out.print("peso para " +nomes[i][1]+ ": ");
            vetpesos[i] = input.nextFloat();
            pesoTmp += vetpesos[i];
            
            //VERIFICADOR DE PESO
            while(check == false){
                if(pesoTmp > 1){
                    System.out.println("Somatória dos pesos: " + pesoTmp);
                    System.out.print("A somatória dos pesos é maior que 100%, por favor insira um valor menor: ");
                    pesoTmp -= vetpesos[i];
                    vetpesos[i] = input.nextFloat();
                    pesoTmp += vetpesos[i];
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
            iteracao = 0;

            System.out.print("\n\nNome: ");
            input.nextLine();
            nomes[j][0] = input.nextLine();

            do{// DO WHILE

                //NOTA
                System.out.print(nomes[iteracao][1]+": ");
                data[iteracao][j] = input.nextFloat();
                 
                //NOTAS MINIMAS
                if (minima > data[iteracao][j]){
                    data[iteracao][j+alunos] = data[iteracao][j];
                    prodigio = false; 
                }

                //MEDIA
                data[quantia+1][j] += data[iteracao][j]*vetpesos[iteracao];

                //REINSERIR DADOS
                if(iteracao == (quantia-1)){
                    System.out.println("\n"+nomes[j][0]);
                    for(int i=0; i<quantia; i++){
                        System.out.println(nomes[i][1] +": "+ data[i][j]);
                    }
                    System.out.print("DESEJA REINSERIR OS DADOS PARA O ALUNO ATUAL? \n(1)SIM (2)NAO\n===> ");
                    resposta = input.nextFloat();

                    if (resposta == 2){
                        check = true; 
                    }else{
                        iteracao = 0;
                        System.out.println("nome: " +nomes[j][0]);
                        data[quantia+1][j] = 0;
                    }

                }else{
                    iteracao++;
                }
    
            }while(check == false);//*fim do DO WHILE*

            //ADICIONA A MÉDIA AO VETOR DE MÉDIAS
            vetmedias[j] = data[quantia+1][j];

            //SAÍDA
            System.out.println("\n\n\n" +nomes[j][0]);
            for(int i=0; i<quantia; i++){
                System.out.println(nomes[i][1] +": "+ data[i][j]);
            }
            if (prodigio == false) {
                System.out.print("notas abaixo da média: ");
                for(int i=0; i<quantia; i++){
                    if(data[i][j+alunos] != 0){
                        System.out.print(nomes[i][1] +": "+ data[i][j+alunos]);
                    }
                };
            } else {
                System.out.println("\nTodas a notas do aluno estao acima da nota minima, bixao é brabo mesmo");
            }
            System.out.format("\nMedia Final: %.2f", data[quantia+1][j]);

            //APROVACAO
            if (data[quantia+1][j] <= 2) {
                System.out.println("\nREPROVADO\n");
            } else if (data[quantia+1][j] <= 4.9) {
                System.out.println("\nSUBSTITUTIVA NECESSARIA\n");
            } else {
                System.out.println("\nAPROVADO\n");
            }

        }//*fim PRIMEIRO FOR*

        // MÉDIA DAS MÉDIAS
        for(int i = 0; i < alunos; i++){
            medias += data[quantia+1][i];
        }

        //VISUALIZADOR DE FICHA
        check = false;
        while(check == false){
            //"limpador de tela"
            for(int i=0; i <100; i++){
                System.out.println("\n");
            }

            //MAIN MENU
            System.out.print("\n\n\n(1) Para visualizar lista de alunos\n(2)SAIR\n==>  ");
            resposta = input.nextFloat();
            
            //MENU FICHA
            if(resposta == 2){
                check = true;
            }else{
                //limpador de tela
                for(int i=0; i <100; i++){
                    System.out.println("\n");
                }

                //lista de nomes
                for(int i=0; i<alunos; i++){
                    System.out.println("("+(i+1)+") "+nomes[i][0]);
                }
                System.out.println("Media dos alunos: " + (medias/alunos));
                System.out.print("\n\nDigite o numero correspondente para visualizar a ficha do aluno\n===> ");
                resposta = input.nextFloat();

                //limpador de tela
                for(int i=0; i <100; i++){
                    System.out.println("\n");
                }

                
                //exibição da ficha
                System.out.println(nomes[(int) (resposta-1)][0]);
                for(int i=0; i<quantia; i++){
                    System.out.println(nomes[i][1] +": "+ data[i][(int)(resposta-1)]);
                }
                System.out.format("\nMedia Final: %.2f", data[quantia+1][(int)(resposta-1)]);
                System.out.println();
                for(int i=0; i<quantia; i++){
                    if(data[i][(int)(resposta-1)+alunos] != 0){
                        System.out.print("Notas abaixo da media: " +nomes[i][1] +": "+ data[i][(int)(resposta-1)+alunos]);
                    }  
                }
                System.out.println("\n\npressione ENTER para voltar");
                input.nextLine();
                input.nextLine();
            }
        }

        
        input.close();
    }               
}
