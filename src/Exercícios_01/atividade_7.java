package Exercícios_01;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercíco sobre Estrututra condicional(if-else)

//Leia 2 valores com uma casa decimal (x,y), que devem representar as coordenadas de um ponto em um plano. A seguir,
//determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x=y=0).
//se o ponto estiver na origem,escreva a mensagem "Origem"
//Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", Comforme for a situação
public class atividade_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor X: ");
        double x = input.nextDouble();
        System.out.print("Digite o valor Y: ");
        double y = input.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }else if (x == 0.0){
            System.out.println("Eixo Y");
        }else if (y == 0.0){
            System.out.println("Eixo x");
        }else if (x > 0.0 && y > 0.0){
            System.out.println("Q1");
        }else if (x < 0.0 && y < 0.0){
            System.out.println("Q3");
        }else if (x < 0.0 && y > 0.0){
            System.out.println("Q2");
        }else {
            System.out.println("Q4");
        }
    }
}
