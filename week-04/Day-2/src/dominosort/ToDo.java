package dominosort;

import java.util.Collections;
import java.util.List;

public class ToDo implements Comparable<ToDo> {
    private String name;
    private boolean completed;

    public ToDo(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(ToDo o) {
        if(this.completed !=o.completed){
            return -1;
        }
        else if (this.completed=o.completed){
            return 1;
        }
        return this.name.compareTo(o.name);
    }
}

