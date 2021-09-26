package Estrutura_Sequencial;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercícios sobre estrutura Sequencial (entrada, processamento, saída)

//Faça um programa para ler o valor do reio de um circulo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais.
public class atividade_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.print("Digite o valor do raio: ");
        float raio = input.nextFloat();

        double formula = pi*raio*raio;

        System.out.printf("A= %.4f%n",formula);
    }
}
