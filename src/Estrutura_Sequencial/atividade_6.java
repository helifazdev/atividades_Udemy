package Estrutura_Sequencial;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercícios sobre estrutura Sequencial (entrada, processamento, saída)

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a)area do triângulo retângulo que tem A por base e C por altura
//b)a área do circulo de raio C. (pi = 3.14159).
//c)a area de trapézio que tem A e B por bases e C por altura.
//d)a área de quadrado que tem lado B.
//a area do retangulo que tem lados A e B.
public class atividade_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.print("Digite o valor 'A': ");
        double A = input.nextDouble();
        System.out.print("Digite o valor 'B': ");
        double B = input.nextDouble();
        System.out.print("Digite o valor 'C': ");
        double C = input.nextDouble();

        double tri = A * C / 2.0;
        double cir = pi * (C * C);
        double tra = ((A + B) * C / 2.0);
        double qua = B * B;
        double ret = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f",tri,cir,tra,qua,ret);
    }
}
