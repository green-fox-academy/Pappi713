package greenfoy;

public class Person {

    protected String name;
    protected Integer age;
    protected String gender;

    protected String commonintroduce() {
        return "Hi my name is " + name + " a " + age + "year old " + gender;
    }
    public void introduce(){
        System.out.println(commonintroduce()+".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }
}
