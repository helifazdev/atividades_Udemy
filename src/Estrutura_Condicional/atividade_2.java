package Estrutura_Condicional;
import java.util.Scanner;

//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercíco sobre Estrututra condicional(if-else)

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class atividade_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  num;
        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }

    }
}
