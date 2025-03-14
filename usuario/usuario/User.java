package usuario;

public class User {

    private String email;
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String email, String password) {
        this.email = email.toLowerCase();
        this.name = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {

        if (email.toLowerCase().contains("@gmail.com") || email.toLowerCase().contains("@yahoo.com") || email.toLowerCase().contains("@outlook.com") || email.toLowerCase().contains("@hotmail.com")) {
            this.email = email.toLowerCase();
            return true;
        } else {
            System.out.println("Email sem provedor");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {

        String passwordToString = String.valueOf(password);

        if (passwordToString.length() < 8) {
            System.out.println("Senha menor que 8 caracteres");
            return false;
        } else {
            this.password = password;
            return true;
        }

    }

}
