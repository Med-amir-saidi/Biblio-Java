import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    // Liste des documents dans la bibliothèque
    private List<Document> documents;
    // Constructeur par défaut
    public Bibliotheque() {
        // Initialise la liste des documents comme une ArrayList
        this.documents = new ArrayList<>();
    }

    public void ajouterDocument(Document document) throws BibliothequeException {
        // Vérifier si le document est un Livre
        if (document instanceof Livre) {
            Livre livre = (Livre) document;

            // Vérifier si l'année de publication est future
            if (livre.getAnneePublication() > 2023) {
                throw new BibliothequeException("Année de publication future pour le livre : " + livre.getTitre());
            }

            // Vérifier si le livre a un auteur
            if (livre.getAuteur() == null) {
                throw new BibliothequeException("Le livre doit avoir un auteur : " + livre.getTitre());
            }
        }

        // Ajouter le document à la liste
        documents.add(document);
    }

    // Méthode pour afficher la liste des documents dans la bibliothèque
    public void afficherDocuments() {
        System.out.println("Liste des documents dans la bibliothèque:");
        for (Document document : documents) {
            System.out.println(document);
        }
    }
}
