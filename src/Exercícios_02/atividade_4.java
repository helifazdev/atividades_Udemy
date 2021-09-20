package Exercícios_02;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercícios sobre estrutura Sequencial (entrada, processamento, saída)

//Fazer um programa que leia o númer de um funcionpario, seu número de horas trabalhadas, o valor que recebe por hora
// e calcula o salário desse funcionário. A seguir,mostre o número e o salário do funcionário,com duas casas deciamis
public class atividade_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número do funcionário: ");
        int numfun = input.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasT = input.nextDouble();
        System.out.print("Digite o Valor que o funcionário recebe por hora: ");
        double ValorpH = input.nextDouble();

        double calc = (ValorpH * horasT);

        System.out.printf("NUMBER = %d\nSALARY = %2f",numfun,calc);
    }
}
