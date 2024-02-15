package app.user;

public class User {
    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", e-mail: " + email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
