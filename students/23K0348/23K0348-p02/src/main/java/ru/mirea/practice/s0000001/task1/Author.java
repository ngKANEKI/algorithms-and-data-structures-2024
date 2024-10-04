package ru.mirea.practice.s0000001.task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Author{name='" + name + "', email='" + email + "', gender=" + gender + "}";
    }
}

class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "john.doe@example.com", 'M');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.toString());
    }
}
