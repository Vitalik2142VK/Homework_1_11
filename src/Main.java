public class Main {

    public static void lineDivider() {
        System.out.println("\n##########\n");
    }

    public static void main(String[] args) {
        lineDivider();

        Book[] book = new Book[3];
        book[0] = new Book("Мертвые души", new Author("Николай", "Гоголь"), 1842);
        book[1] = new Book("Судьба человека", new Author("Михаил", "Шолохов"), 1956);
        for (var i : book) {
            System.out.println(i);
            lineDivider();
        }
        book[1].setDatePublication(1957);
        System.out.println(book[1]);

        lineDivider();

        book[2] = new Book("Судьба человека", new Author("Михаил", "Шолохов"), 1957);
        if (book[1].equals(book[2])) {
            System.out.println("Книги однинаковы.");
        } else {
            System.out.println("Книги разные.");
        }
    }

}
