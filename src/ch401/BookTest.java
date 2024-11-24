package ch401;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", "Michael Brown");

        System.out.println(book);

        String str = new String("test");
        System.out.println(str.toString());
    }
}
