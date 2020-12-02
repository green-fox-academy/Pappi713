package Classes;

public class Animal {
    public int hunger;
    public int thirsty;



    public Animal(){
        hunger=50;
        thirsty=50;
    }

    public void eat (){
        hunger=hunger-1;
    }
    public void drink(){
        thirsty=thirsty-1;
    }
    public void play(){
        hunger--;
        thirsty--;
    }
}
