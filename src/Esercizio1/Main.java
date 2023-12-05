package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di elementi (N): ");
        int n = scanner.nextInt();

        Set<String> paroleSet = new HashSet<>();
        Set<String> duplicatiSet = new HashSet<>();

        System.out.println("Inserisci le parole:");

        for (int i = 0; i < n; i++) {
            String parola = scanner.next();

            if (!paroleSet.add(parola)) {
                duplicatiSet.add(parola);
            }
        }

        System.out.println("Parole duplicate: " + duplicatiSet);
        System.out.println("Numero di parole distinte: " + paroleSet.size());
        System.out.println("Elenco delle parole distinte: " + paroleSet);
    }
}