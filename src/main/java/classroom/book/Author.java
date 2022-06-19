package classroom.book;

import lombok.ToString;

@ToString
public class Author {

    String name;
    String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
