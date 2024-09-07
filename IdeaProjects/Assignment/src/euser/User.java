package euser;

public class User {
     int age;
     String email;
     String name;
     String password;
     String phoneNumber;
     USERS users;

    public User(int age, String email, String name, String password, String phoneNumber, USERS user) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.users = user;
    }

}
