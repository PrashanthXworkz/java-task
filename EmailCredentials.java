public class EmailCredentials {
    private String email;
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        EmailCredentials credentials = new EmailCredentials();
        credentials.setEmail("example@email.com");
        credentials.setPassword("password123");

        String email = credentials.getEmail();
        String password = credentials.getPassword();

        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
