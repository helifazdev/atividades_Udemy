package Estrutura_Condicional;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercíco sobre Estrututra condicional(if-else)

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
public class atividade_1 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Por favor digite um número inteiro: ");
        num = input.nextInt();

        if (num >=0){
            System.out.println("NÃO NEGATIVO");
        }else {
            System.out.println("NEGATIVO");
        }
    }

}

