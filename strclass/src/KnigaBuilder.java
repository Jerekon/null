public class KnigaBuilder {
    private String name;
    private String author;

    public KnigaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public KnigaBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Kniga createKniga() {
        return Kniga.createKniga(name, author);
    }
}