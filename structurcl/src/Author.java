import java.time.LocalDate;

public class Author {

    String name;
    String surname;
    int quantityBook;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.quantityBook++;


    }

    public Book newBook(String title) {
        quantityBook++;
        return new Book(title, this, LocalDate.now().getYear());

    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", quantityBook=" + quantityBook +
                '}';
    }
}
