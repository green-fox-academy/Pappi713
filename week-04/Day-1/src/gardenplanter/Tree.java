package gardenplanter;

public class Tree  extends Plant{


    public Tree(String color) {
        super(color);
    }
    public  Double getAbsorbtionRate(){
        return 0.4;
    }
    public Integer getNeedWaterAt(){
        return 10;
    }

    public Integer waterMin(){
        return 10;
    }
    public String getType(){
        return "Tree";
    }
}
