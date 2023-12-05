package Esercizio3;
import java.util.HashMap;
import java.util.Map;
public class Main2 {


    public class RubricaTelefonica {
        private Map<String, String> rubrica;

        public RubricaTelefonica() {
            this.rubrica = new HashMap<>();
        }

        public void inserisciContatto(String nome, String telefono) {
            rubrica.put(nome, telefono);
        }

        public void cancellaContattoPerNome(String nome) {
            rubrica.remove(nome);
        }

        public String cercaPersonaPerNumero(String telefono) {
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                if (entry.getValue().equals(telefono)) {
                    return entry.getKey();
                }
            }
            return "Numero non trovato";
        }

        public String cercaNumeroPerNome(String nome) {
            return rubrica.getOrDefault(nome, "Nome non trovato");
        }

        public void stampaContatti() {
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
            }
        }

        public void main(String[] args) {
            RubricaTelefonica rubricaTelefonica = new RubricaTelefonica();

            rubricaTelefonica.inserisciContatto("Mario", "123456789");
            rubricaTelefonica.inserisciContatto("Luigi", "987654321");

            System.out.println("Rubrica dopo l'inserimento:");
            rubricaTelefonica.stampaContatti();

            rubricaTelefonica.cancellaContattoPerNome("Mario");

            System.out.println("Rubrica dopo la cancellazione di Mario:");
            rubricaTelefonica.stampaContatti();

            System.out.println("Ricerca di Luigi tramite numero: " + rubricaTelefonica.cercaPersonaPerNumero("987654321"));
            System.out.println("Ricerca del numero di Luigi: " + rubricaTelefonica.cercaNumeroPerNome("Luigi"));
        }
    }
}
