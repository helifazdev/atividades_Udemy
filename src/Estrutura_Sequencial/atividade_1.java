package Estrutura_Sequencial;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercícios sobre estrutura Sequencial (entrada, processamento, saída)

//Faça um programa para ler dois valores inteiros e depois mostrar na tela a soma desses númeors com uma mensagem
//explicativa.

public class atividade_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int val1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        int val2 = input.nextInt();

        int soma = (val1 + val2);

        System.out.printf("Soma = %d", soma);

    }
}
