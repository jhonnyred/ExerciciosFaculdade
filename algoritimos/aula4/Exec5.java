package aula4;

import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args){
        System.out.println("CONVERSOR °C PARA °F");
        Scanner input = new Scanner(System.in);

        System.out.print("insira a temperatura que deseja converter: ");
        String str = input.nextLine();
        double val = Double.parseDouble(str.replace(",","."));
        //Aqui usei do mesmo código do exercício 6 da AC1
        //assim é possível conseguir um input com ou sem vírgula em double caso seja decimal

        //achei essa fórmula no google e deu certo
        double resu = val * 1.8 + 32;

        //esse if else aqui é uma frescura q eu decidi colocar pra praticar um pouco a syntaxe do java
        //basicamente fiz uma condição para deixar ou tirar os decimais a depender se é float ou int
        if (resu % 1 == 0){
            int resu2 = (int)resu;
            System.out.println(val + "°C corresponde a " + resu2 + "°F");
            //se não tiver sobra então pode formatar para int   
        }
        else{
            System.out.format(val + "°C corresponde a %.1f", resu);
            System.out.print("°F");
            //caso tenha sobra ele irá mostrar os números decimais (com no máximo um algorítmo na casa decimal)
        }
        input.close();
    }
}
