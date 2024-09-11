package Chapter11_School;

public class Person {
    private String address;
    private  String mail;
    private  String number;
    private String name;

    public Person() {

    }

    public Person(String name, String Street, String number, String mail) {
        this.name = name;
        this.number = number;
        this.address = Street;
        this.mail = mail;

    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String number) {
        this.number = number;
    }
    public String getPhoneNumber() {
        return number;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

}
