public class StackTester {
    public static void main(String[] args) {
        Stack<Book> poorlyOrganizedLibrary = new ArrayStack<>();

        poorlyOrganizedLibrary.push(new Book("House of Leaves", "Mark Danielewski"));
        poorlyOrganizedLibrary.push(new Book("JK Rowling", "HP"));
        poorlyOrganizedLibrary.push(new Book("Jin", "My Life"));

        System.out.println(poorlyOrganizedLibrary);
    }
}

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
