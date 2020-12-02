package Classes;

public class Counter {
    int number;

    public Counter(){

    }
    public Counter(int value){
        this.number=value;
    }
    public void add(int number){
        this.number=this.number+number;
    }
    public void add(){
        this.number++;
    }
    public int get(){
        return number;
    }
    public void reset(){
        number=0;
    }


}
