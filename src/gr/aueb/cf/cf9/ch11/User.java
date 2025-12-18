package gr.aueb.cf.cf9.ch11;

/**
 * Define User Java Bean.
 */

public class User {
    private long id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private boolean stock;

  // Overloaded Constructor
    public User(long id, String firstname, String lastname, String username, String password, boolean stock) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.stock = stock;
    }
   // Default Constructor
    public User(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return true;
    }
}
