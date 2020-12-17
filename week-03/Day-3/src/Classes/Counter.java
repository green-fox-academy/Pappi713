package Classes;

public class Counter {
    private int number;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number){
        this.number+=number;
    }

    public Counter() {

    }

    public Counter(int value) {
        this.number = value;
    }


    public void add(int number) {
        this.setNumber(number);
    }

    public int get() {
        return number;
    }

    public void reset() {
        number = 0;
    }


}
