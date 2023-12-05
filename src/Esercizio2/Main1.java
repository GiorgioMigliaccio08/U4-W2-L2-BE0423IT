package Esercizio2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {

    // Funzione per generare una lista ordinata di N interi casuali da 0 a 100
    public static List<Integer> generateRandomList(int N) {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            randomList.add((int) (Math.random() * 101));
        }
        Collections.sort(randomList);
        return randomList;
    }

    // Funzione per creare una nuova lista con elementi seguiti dall'inverso
    public static List<Integer> createReversedList(List<Integer> originalList) {
        List<Integer> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);
        originalList.addAll(reversedList);
        return originalList;
    }

    // Funzione per stampare valori in posizioni pari o dispari in base al booleano
    public static void printValuesByPosition(List<Integer> list, boolean printEvenPositions) {
        for (int i = 0; i < list.size(); i++) {
            if ((i % 2 == 0 && printEvenPositions) || (i % 2 != 0 && !printEvenPositions)) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        // Utilizzo delle due funzioni
        List<Integer> randomList = generateRandomList(5);
        System.out.println("Lista casuale ordinata: " + randomList);

        List<Integer> combinedReversedList = createReversedList(new ArrayList<>(randomList));
        System.out.println("Lista combinata con l'inverso: " + combinedReversedList);

        System.out.println("Stampa valori in posizioni pari:");
        printValuesByPosition(combinedReversedList, true);

        System.out.println("Stampa valori in posizioni dispari:");
        printValuesByPosition(combinedReversedList, false);
    }
}

