package Chapter11_School;

public class FacultyMember extends Person{
    private String name;
    private String hours;
    private String rank;

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setMail(String mail) {
        super.setMail(mail);
    }

    @Override
    public String getMail(){
        return super.getMail();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getPhoneNumber(){
        return super.getPhoneNumber();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    public void setWorkHours(String workHours) {
        this.hours = workHours;
    }

    public String getWorkHours() {
        return hours;
    }


    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

}
