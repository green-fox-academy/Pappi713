import com.greenfoxacademy.Domino;
import com.greenfoxacademy.Todo;
import dominosort.ToDo;

import java.util.ArrayList;
import java.util.List;

public class Printall {
    public static void main(String[] args) {
        List<Domino>dominos = new ArrayList<>();
        List<Todo>todos = new ArrayList<>();
        dominos.add(new Domino(3,6));
        dominos.add(new Domino(4,2));
        dominos.add(new Domino(5,4));
        dominos.add(new Domino(2,5));
        dominos.add(new Domino(1,1));

        todos.add(new Todo("Buy milk","Low",false));
        todos.add(new Todo("Buy bread","Medium",true));
        todos.add(new Todo("Buy redbull","Very High",true));
        todos.add(new Todo("Buy life","High",false));

        for (Domino domino: dominos) {
            domino.printAllFields();
        }
        for (Todo todo: todos) {
            todo.printAllFields();
        }
    }
}
