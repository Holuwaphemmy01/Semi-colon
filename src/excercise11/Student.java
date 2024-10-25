package excercise11;

public class Student extends Person {


    private Status status;

    public String setStatus(String status) {
        for(Status students : Status.values()){
            if(students.name().equals(status)){
                this.status = students;
               return status;
            }

            }
        throw new IllegalArgumentException("Invalid status");

    }

    public String getStatus() {
        System.out.println(status);
        return Status.values()[status.ordinal()].toString();
    }
}
