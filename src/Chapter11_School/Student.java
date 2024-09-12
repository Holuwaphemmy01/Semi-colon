package Chapter11_School;

public class Student extends Person {
    public  ClassStatus status;

    public Student(){

    }

    public Student(String name){
        super(name);
    }
    public Student(String name, String mail){
        super(name, mail);
    }

    public Student(String name, String mail, String address){
        super(name, mail, address);
    }

    public Student(String name, String mail, String address, String number){
        super(name, mail, address, number);

    }

    public Student(String name, String mail, String address, String number, ClassStatus status ) {
         super(name, mail, address, number);
          this.status = status;
    }

    public ClassStatus getStatus (){
        return status;
    }




}
