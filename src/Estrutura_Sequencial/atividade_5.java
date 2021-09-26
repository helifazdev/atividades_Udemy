package Estrutura_Sequencial;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercícios sobre estrutura Sequencial (entrada, processamento, saída)

//Fazer um programa para ler o código de uma peça 1, o número da peça1, o valor unitário de cada peça 1, o código de uma
//peça 2, o numero da de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
public class atividade_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o código da primeira peça: ");
        int codpeça1 = input.nextInt();
        System.out.print("Digite o número de peças: ");
        int numpeça1 = input.nextInt();
        System.out.print("Digite o valor da peça: ");
        double valpeça1 = input.nextDouble();
        System.out.print("Digite o código da Segunda peça: ");
        int codpeça2 = input.nextInt();
        System.out.print("Digite número de peças: ");
        int numpeça2 = input.nextInt();
        System.out.print("Digite o valor da peça: ");
        double valpeça2 = input.nextDouble();

        double prod1 = (numpeça1 * valpeça1);
        double prod2 = (numpeça2 * valpeça2);
        double total = prod1 + prod2;

        System.out.printf("VALOR A PAGAR: R$ %.2f",total);
    }
}
