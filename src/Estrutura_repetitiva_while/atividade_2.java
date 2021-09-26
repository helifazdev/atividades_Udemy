package Estrutura_repetitiva_while;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercícios sobre estrutura repetitiva While

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para
//cada ponto escrever o quadrante a que ele pertence. o algoritimo será encerrado quando pela menos uma de duas coordenadas
//for nula(nesta situação sem escrever mensagem nenhuma).
public class atividade_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de 'X': ");
        int x = input.nextInt();
        System.out.print("Digite o valor de 'y': ");
        int y = input.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            System.out.print("Digite novamente o valor de 'X': ");
             x = input.nextInt();
            System.out.print("Digite novamente o valor de 'y': ");
             y = input.nextInt();
        }
    }
}
