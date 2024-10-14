import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Saisie du nombre de livres
            System.out.print("Saisissez le nombre de livres : ");
            int nombreLivres = scanner.nextInt();
            scanner.nextLine();  // Consommer la nouvelle ligne

            // Création de la bibliothèque
            Bibliotheque bibliotheque = new Bibliotheque();
            List<Livre> livresCorrects = new ArrayList<>();
            List<String> erreursLivres = new ArrayList<>();

            // Saisie des informations pour chaque livre
            for (int i = 1; i <= nombreLivres; i++) {
                System.out.println("Livre " + i + ":");

                try {
                    // Saisie des détails de l'auteur
                    System.out.print("Saisissez le nom de l'auteur : ");
                    String nomAuteur = scanner.nextLine();
                    System.out.print("Saisissez la nationalité de l'auteur : ");
                    String nationaliteAuteur = scanner.nextLine();
                    Auteur auteur = new Auteur(nomAuteur, nationaliteAuteur);

                    // Saisie des détails du livre
                    System.out.print("Saisissez le titre du livre : ");
                    String titreLivre = scanner.nextLine();
                    System.out.print("Saisissez l'année de publication du livre : ");
                    int anneeLivre = scanner.nextInt();
                    System.out.print("Saisissez le nombre de pages du livre : ");
                    int pagesLivre = scanner.nextInt();
                    scanner.nextLine();  // Consommer la nouvelle ligne

                    // Création du livre et ajout à la bibliothèque
                    Livre livre = new Livre(titreLivre, auteur, anneeLivre, pagesLivre);
                    bibliotheque.ajouterDocument(livre);
                    livresCorrects.add(livre);

                } catch (BibliothequeException e) {
                    System.out.println("Erreur pour le livre " + i + ": " + e.getMessage());
                    erreursLivres.add("Erreur pour le livre " + i + ": " + e.getMessage());
                }
            }

            // Affichage des livres corrects dans la bibliothèque
            System.out.println("Liste des livres dans la bibliothèque :");
            afficherLivresNumerotes(livresCorrects);

            // Affichage des erreurs pour les livres
            System.out.println("\nErreurs pour les livres :");
            for (String erreur : erreursLivres) {
                System.out.println(erreur);
            }

        } catch (Exception e) {
            System.out.println("Erreur générale : " + e.getMessage());
        }
    }

    private static void afficherLivresNumerotes(List<Livre> livres) {
        for (int i = 0; i < livres.size(); i++) {
            Livre livre = livres.get(i);
            System.out.println("Livre " + (i + 1) + ": " + livre);
        }
    }
}
