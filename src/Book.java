public class Book {

    Book(String titleBook, Author author, int datePublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.datePublication = datePublication;
    }

    private final String titleBook;
    private final Author author;
    private int datePublication;

    public String getTitleBook() {
        return titleBook;
    }
    public int getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }

    @Override
    public String toString() {
        return "Название книги: " + titleBook + "\nАвтор: " + author + "\nДата публикации: " + datePublication;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass() || this.hashCode() != other.hashCode()) {
            return false;
        }
        Book book2 = (Book) other;
        return titleBook.equals(book2.getTitleBook()) && author.equals(book2.author) && datePublication == book2.getDatePublication();
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(titleBook) + author.hashCode() + datePublication;
    }
}
