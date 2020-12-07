package greenfoy;

public class Mentor extends Person {

    protected String level;

    public Mentor() {
        super();
        level = "intermediate";
    }

    public Mentor(String name, Integer age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }
    public void introduce(){
        System.out.println(super.commonintroduce()+" " + level + " mentor.");
    }
}
