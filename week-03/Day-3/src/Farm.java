import Classes.Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> animals =new ArrayList<>();
    int freeSpace;

    public void breed(){
        if(freeSpace>0){
            animals.add(new Animal());
            freeSpace--;
        }
    }
    public void slaughter(){
        int leastHungry=Integer.MAX_VALUE;
        int posinlist=0;
        for(int i=0;i<animals.size();i++){
            if(animals.get(i).hunger<leastHungry){
                leastHungry=animals.get(i).hunger;
                posinlist=i;
            }
        }
        animals.remove(posinlist);
    }
}
