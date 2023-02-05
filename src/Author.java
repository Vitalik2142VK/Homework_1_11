public class Author {

    Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private final String name;
    private final String surname;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass() || this.hashCode() != other.hashCode()) {
            return false;
        }
        Author author2 = (Author) other;
        return name.equals(author2.name) && surname.equals(author2.surname);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(name + surname);
    }
}
