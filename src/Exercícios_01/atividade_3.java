package Exercícios_01;

//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercíco sobre Estrututra condicional(if-else)

import java.util.Scanner;

//Leia 2 valores (A e B). Após, o programa deve mostrar uma mensagem "São Multiplos" ou "não são multipos", indicando
// se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou
// decrescente.
public class atividade_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A,B;
        System.out.print("Digite um número Inteiro: ");
        A = input.nextInt();
        System.out.print("Digite mais um número Inteiro: ");
        B = input.nextInt();

        if (A % B == 0 | B % A == 0) {
            System.out.println("São múltiplos");
        }else {
            System.out.println("Não são múltiplos");
        }
    }

}
