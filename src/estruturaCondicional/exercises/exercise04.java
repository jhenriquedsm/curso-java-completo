package estruturaCondicional.exercises;

import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/
public class exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        System.out.print("Insira a hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Insira a hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORAS(S)", duracao);
        sc.close();
    }
}
