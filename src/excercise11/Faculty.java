package excercise11;

public class Faculty extends Employee{
    private String officeHour;
    private String rank;

    public void setOfficeHour(String resume, String closing) {
        this.officeHour = resume+" to " + closing;
    }
    public String getOfficeHour() {
        return officeHour;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getRank() {
        return rank;
    }
}

