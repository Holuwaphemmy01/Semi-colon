package Chapter11_School;

public class Person {
    private String address;
    private  String mail;
    private  String number;
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name=name;
    }

    public Person(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public Person(String name, String mail, String address) {
        this.name = name;
        this.mail = mail;
        this.address = address;
    }


    public Person(String name, String mail, String Street, String number) {
        this.name = name;
        this.number = number;
        this.address = Street;
        this.mail = mail;

    }

    public void setName(String name) {
        this.name = name;
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
