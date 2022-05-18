package HW1_10;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Антуан", "Экзюпери");
        Author author2 = new Author("Джоан", "Роулинг");
        Book book1 = new Book("Маленький принц", author1, 1943);
        Book book2 = new Book("Гарри Поттер и философский камень", author2, 1997);
        Book[] books = {book1, book2};
        for (Book book : books) {
            System.out.println(book);
        }
    }
}