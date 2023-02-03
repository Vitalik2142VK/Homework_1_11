public class Book {

    Book(String titleBook, Author author, int datePublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.datePublication = datePublication;
    }

    private String titleBook;
    private Author author;
    private int datePublication;

    public String getTitleBook() {
        return titleBook;
    }
    public String getAuthor() {
        return author.getName() + " " + author.getSurname();
    }
    public int getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }
}
