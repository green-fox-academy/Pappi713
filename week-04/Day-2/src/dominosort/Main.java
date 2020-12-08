package dominosort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        Collections.sort(dominoes);
        System.out.println(dominoes);

        ToDo thg1 = new ToDo("Get milk");
        ToDo thg2 = new ToDo("Remove the obstacles");
        ToDo thg3 = new ToDo("Stand up");
        thg3.complete();
        ToDo thg4 = new ToDo("Eat lunch");
        thg4.complete();

        List<ToDo> toDos =new ArrayList<>();
        toDos.add(thg1);
        toDos.add(thg2);
        toDos.add(thg3);
        toDos.add(thg4);
        Collections.sort(toDos);
        System.out.println(toDos);

    }

}
