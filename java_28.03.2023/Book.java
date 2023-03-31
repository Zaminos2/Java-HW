public class Book {
    String description;
    String title;
    String author;
    String genre;
    int qantity;

    public Book (String description, String title, String author, String genre, int qantity){
        this.description = description;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.qantity = qantity;

    }
    public void out(){
    System.out.println("description " + description + "\n"
            + "title: " + title + "\n"
            + "author" + author + "\n"
            + "genre" + "\n"
            + "qantity" + qantity);
    }
}
