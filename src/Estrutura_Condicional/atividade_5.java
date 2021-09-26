package Estrutura_Condicional;

//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercíco sobre Estrututra condicional(if-else)

import java.util.Scanner;

//Com base na tabela (Descrita no exercício), escreva um programa que leia o código de um item e a quantidade deste item.
//A seguir, calcule e mostre o valor da conta a pagar.
public class atividade_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        int codp = input.nextInt();
        System.out.print("Digite a quantidade do produto: ");
        int quant = input.nextInt();

        double total;
        if(codp == 1){
            total = quant * 4.00;
        }else if (codp == 2){
            total = quant * 4.50;
        }else if (codp == 3){
            total = quant * 5.00;
        }else if (codp == 4){
            total = quant * 2.00;
        }else {
            total = quant * 1.50;
        }
        System.out.printf("Total R$ %.2f%n", total);


    }


}
