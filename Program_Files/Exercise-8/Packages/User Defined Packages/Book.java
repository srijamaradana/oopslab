package IDK;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void issue() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " issued.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James");
        b.issue();
        b.issue();
    }
}
