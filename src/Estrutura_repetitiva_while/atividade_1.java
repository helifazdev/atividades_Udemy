package Estrutura_repetitiva_while;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercícios sobre estrutura repetitiva While

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta
//informada, escrever a mensagem "Senha invalida". Quando a senha for informada corretamente deve ser impressa
// a mensagem "Acesso permitido" e o algoritimo encerrado. considere que a senha correta é o valor 2002
public class atividade_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        int x = input.nextInt();
        while (x != 2002){
            System.out.println("Senha Invalida");
            System.out.print("Digite a senha novamente: ");
            x = input.nextInt();
        }
        System.out.println("Acesso Permitido");

    }

}
