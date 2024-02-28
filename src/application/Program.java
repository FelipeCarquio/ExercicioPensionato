package application;

import entities.Estudante;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estudante[] est = new Estudante[10];

        System.out.print("Digite quantos quartos vai registrar: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println((i+1) + "º registro:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            est[quarto] = new Estudante(nome, email, quarto);
        }

        System.out.println("Quartos alugados:");
        for (int i=0; i<10; i++) {
            if (est[i] != null) {
                System.out.println(est[i].toString());
            }
        }
    }
}
