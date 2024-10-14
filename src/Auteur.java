
public class Auteur {
    // Attributs privés de la classe Auteur
    private String nom;
    private String nationalite;

    // Constructeur par défaut
    public Auteur() {
        // Appelle le constructeur paramétré avec des valeurs par défaut
        this("", "");
    }

    // Constructeur paramétré
    public Auteur(String nom, String nationalite) {
        this.nom = nom;
        this.nationalite = nationalite;
    }

    // Méthodes pour obtenir et définir chaque attribut
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    // Redéfinition de la méthode toString() pour fournir une représentation sous forme de chaîne personnalisée de l'objet Auteur
    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", nationalite='" + nationalite + '\'' +
                '}';
    }
}
