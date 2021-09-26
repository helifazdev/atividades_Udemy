package Estrutura_repetitiva_while;
import java.util.Scanner;
//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercícios sobre estrutura repetitiva While

//Um posto de combustível deseja determinar qual dos seus produtos tem a preferência dos seus clientes. Escreva um algoritmo
//para ler o tipo de combustível abastecido (codificação da seguinte forma: 1.alcool;2.gasolina;3.Diesel;4.fim). Caso
//o usuário informe um código inválido (Fora da faixa de 1 a 4) deve ser solicitado um novo código (Até que seja válido)
//O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a
//quantidade de clientes que abasteceram cada tipo de combustível.
public class atividade_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = input.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;

        while (number != 4){
            if (number == 1){
                alcool = alcool + 1;
            }else if (number == 2) {
                gasolina = gasolina + 1;
            }else if (number == 3){
                diesel = diesel + 1;
            }
            System.out.print("Digite outro número: ");
            number = input.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}