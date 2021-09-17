package Exercícios_01;
import java.util.Scanner;

//Curso Java Completo (Udemy) | Prof. Dr. Nelio Alves
//Exercíco sobre Estrututra condicional(if-else)

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo. Sabendo que o mesmo pode começar
//em um dia e terminar em outro, tendo uma duração minima de 1 hora e máxima de 24 horas.
public class atividade_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaI,horaF, duracao;
        System.out.print("Digite a hora inicial do jogo: ");
        horaI = input.nextInt();
        System.out.print("Digite a hora Final do jogo: ");
        horaF = input.nextInt();
        if (horaI < horaF){
            duracao = horaF - horaI;
        }else {
            duracao = 24 - horaI + horaF;
        }
        System.out.println("O JOGO DUROU " + duracao + " hora(s)");
    }
}
