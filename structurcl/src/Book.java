

public class Book {
    String title;
    Author author;
    int creatData;
    int rating = 3;
    String text = "     ";

    public Book(String title, Author author, int creatData) {
        this.title = title;
        this.author = author;
        this.creatData = creatData;
    }

    public void up() {
        if (rating < 5) {
            this.rating++;
        }
    }

    public void down() {
        if (rating > 0) {
            this.rating--;
        }
    }

    public void append(String text) {

        this.text += text;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", creatData=" + creatData +
                ", rating=" + rating +
                ", text='" + text + '\'' +
                '}';
    }
}