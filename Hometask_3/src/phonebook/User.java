package phonebook;

public class User {
    private String lastName;
    private String telNumber;

    public User(String lastName, String telNumber) {
        this.lastName = lastName;
        this.telNumber = telNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }
}
