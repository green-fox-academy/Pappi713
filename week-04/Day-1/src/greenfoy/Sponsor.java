package greenfoy;

public class Sponsor extends Person {

    protected String company;
    protected Integer hiredStudents = 0;

    public Sponsor() {
        this.company = "Google";
    }

    public Sponsor(String name, Integer age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public void introduce() {
        System.out.println(super.commonintroduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

}
