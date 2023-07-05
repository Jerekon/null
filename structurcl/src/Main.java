public class Main {
    public static void main(String[] args) {

        Author author = new Author("Garry", "Oldman");
        Book book = new Book("Life", author, 2023);
        book.append("Short life");
        book.up();
        book.up();
        book.up();

        System.out.println(book.rating);
        book.down();
        book.down();
        book.down();
        book.down();
        book.down();
        book.down();
        Book book1 = author.newBook("Life.");
        System.out.println(book.rating);
        System.out.println(book.toString());
        System.out.println(book1);
        System.out.println(author.toString());

    }
}