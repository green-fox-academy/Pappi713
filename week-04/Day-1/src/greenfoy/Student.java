package greenfoy;

public class Student extends Person {

    protected String previousOrganization;
    protected Integer skippedDays;

    public Student() {
        previousOrganization = "School of life";
        skippedDays = 0;

    }


    public Student(String name, Integer age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }
    public void introduce(){
        System.out.println(super.commonintroduce()+" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }
    public void skipDays(Integer numberofDays) {
        skippedDays += numberofDays;
    }


}
