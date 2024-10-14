// Déclaration de la classe Livre, qui étend la classe Document
public final class Livre extends Document {
    // Attributs privés de la classe Livre
    private String titre;
    private Auteur auteur;
    private int anneePublication ;
    private int nombrePages;

    // Constructeur par défaut
    public Livre() {
        // Appelle le constructeur paramétré avec des valeurs par défaut
        this("", new Auteur(), 0, 0);
    }

    // Constructeur paramétré
    public Livre(String titre, Auteur auteur, int anneePublication, int nombrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.nombrePages = nombrePages;
    }

    // Méthodes pour obtenir et définir chaque attribut
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    // Redéfinition de la méthode toString() pour fournir une représentation sous forme de chaîne personnalisée de l'objet Livre
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur=" + auteur +
                ", anneePublication=" + anneePublication +
                ", nombrePages=" + nombrePages +
                '}';
    }

    // Autres méthodes spécifiques à la classe Livre qui imprime des informations sur l'objet Livre
    @Override
    public void afficherInfo() {
        System.out.println(toString());
    }
}
