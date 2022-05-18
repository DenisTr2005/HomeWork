package HW1_10;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author authorName;
    private int yearPublishing;

    public Book(String name, Author authorName, int yearPublishing) {
        this.name = name;
        this.authorName = authorName;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return name;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return "Название кники: " + name + " | Автор: " + authorName + " | Год публикации: " + yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}