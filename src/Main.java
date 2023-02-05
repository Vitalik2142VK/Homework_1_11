public class Main {

    public static String toString(Book book) {
        return "Название книги: " + book.getTitleBook() + "\nАвтор: " + book.getAuthor() + "\nДата публикации: " + book.getDatePublication();
    }

    public static void lineDivider() {
        System.out.println("\n##########\n");
    }

    public static void main(String[] args) {
        lineDivider();

        Book[] book = new Book[2];
        book[0] = new Book("Мертвые души", new Author("Николай", "Гоголь"), 1842);
        book[1] = new Book("Судьба человека", new Author("Михаил", "Шолохов"), 1956);
        for (var i : book) {
            System.out.println(toString(i));
            lineDivider();
        }
        book[1].setDatePublication(1957);
        System.out.println(toString(book[1]));
    }

}
