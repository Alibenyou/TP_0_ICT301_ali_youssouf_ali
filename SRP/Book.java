public class Book {
    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // Responsabilité 1 : Gérer les données
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContent() { return content; }

    // Responsabilité 2 : Affichage
    public void printToScreen() {
        System.out.println("Titre: " + title);
        System.out.println("Auteur: " + author);
    }

    // Responsabilité 3 : Sauvegarde
    public void saveToDatabase() {
        System.out.println("Sauvegarde du livre '" + title + "'...");
    }

    // Responsabilité 4 : Logique métier
    public void emprunter(String lecteur) {
        System.out.println("Emprunt du livre par " + lecteur);
    }
}