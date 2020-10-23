import java.lang.*;

public class Author {
    private String Name;
    private String Email;
    private char Gender;

    public Author(String name, String email, char gender) {
        Name = name;
        this.Email = email;
        this.Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return (Name + " (" + Gender + ") at " + Email);
    }
}
