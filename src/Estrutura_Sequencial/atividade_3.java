package Estrutura_Sequencial;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercícios sobre estrutura Sequencial (entrada, processamento, saída)

//fazer um programa para ler quatro valores inteiros A,B,C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIEFERENÇA = (A*B-C*D)
public class atividade_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor 'A': ");
        int A = input.nextInt();
        System.out.println("Digite o valor 'B': ");
        int B = input.nextInt();
        System.out.println("Digite o valor 'C': ");
        int C = input.nextInt();
        System.out.println("Digite o valor 'D': ");
        int D = input.nextInt();

        int dif = (A * B) - (C * D);

        System.out.printf("DIFERENÇA = %d",dif);
    }
}
