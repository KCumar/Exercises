public class Customer {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private static int id;

    public static int getId() {
        return id;
    }

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        Customer.id++;
    }
}
