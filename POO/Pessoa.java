/* 
Preste atenção nas correções feitas no seu código:

A estrutura da classe principal e escopo do método main:
O main está solto sem uma classe principal (apenas static void main).

Criação de exceções no construtor:
O construtor criado tem uma exceção com throws Exception, mas não é necessário.

Tratamento de nomes para e-mail:
A forma de construção do Array sempre existem três partes no nome (o que pode resultar em erro).

Declaração do método main:
A forma de declaração da mais está incorreta, faltando a palavra-chave public. Erro que ficou em evidencia apos a primeira correção.

 */

public class Main{
    
    static class Pessoa{       
        String complete_name;
        String data;
        String email;
        int idade;
        double altura;
                
        Pessoa(String nome, String aniversario, int idade, double altura) {
            this.complete_name = nome;
            this.idade = idade;
            this.altura = altura;
            
            String straniversario[] = aniversario.split("-");
            this.data = straniversario[2] +"/"+ straniversario[1] +"/"+ straniversario[0];

            String nomes[] = nome.split(" ");
            if (nomes.length >= 2){
               this.email = nomes[0] + "." + nomes[nomes.length - 1] + "@email.com";
            } else {
                this.email = nomes[0] + "@email.com";
            }
        }

    }

    public static void main(String[] args){

        Pessoa p1 = new Pessoa("Alberto Souza Lima", "1997-11-10", 26, 1.76);
        Pessoa p2 = new Pessoa("Isabela Alves Carvalho", "2005-07-10",19, 1.57);
        //Pessoa p3 = new Pessoa("Maria Campos Rocha", "2025-10-11", 24, 1.70);

        System.out.println("\n\nNome: " +p1.complete_name+ "\nIdade: " +p1.idade+ "\nAltura: " +p1.altura+ "\nData de nascimento: " +p1.data+ "\nemail: " +p1.email);
        System.out.println("\n\nNome: " +p2.complete_name+ "\nIdade: " +p2.idade+ "\nAltura: " +p2.altura+ "\nData de nascimento: " +p2.data+ "\nemail: " +p2.email);
        //System.out.println("\n\nNome: " +p3.complete_name+ "\nIdade: " +p3.idade+ "\nAltura: " +p3.altura+ "\nDAta de nascimento: " +p3.data+ "\nemail: " +p3.email);
    }
}