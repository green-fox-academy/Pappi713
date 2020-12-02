import Classes.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    private ArrayList<Sharpie> sharpies;

    public int countUsuable(){
        int usuable=0;
        for (Sharpie sharpie : sharpies){
            if(sharpie.inkAmount>0){
                usuable++;
            }
        }
        return usuable;
    }

    public void removeTrash(){
        for(int i=0;i<sharpies.size();i++){
            if(sharpies.get(i).inkAmount==0){
                sharpies.remove(i);
            }
        }
    }
}
