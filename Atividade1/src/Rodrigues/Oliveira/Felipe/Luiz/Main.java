//Luiz Felipe de Oliveira Rodrigues 19.00574-0
package Rodrigues.Oliveira.Felipe.Luiz;

import java.util.Scanner;

public class Main {

    private static Contas[] c = new Contas[3]; // Cria o vetor de dados.
    private Scanner scanner;

    public static void main(String[] args) {

        Inter inter = new Inter();

        c[0] = new Contas("1", 1000.0, "All Might"); //Dados fornecidos.
        c[1] = new Contas("2", 250.0, "One For All");
        c[2] = new Contas("3", 3000.0, "Bakugo");

        inter.executar(); // Executa a interface.

    }
}
