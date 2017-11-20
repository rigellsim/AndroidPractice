package android.sim.rigell.androidpractice.todo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by simks88 on 2017. 11. 21..
 */

public class ToDoList {
    private List<ToDoItem> toDoItemList = new ArrayList<>();


    public int addToDoItem(ToDoItem toDoItem) {
        toDoItemList.add(toDoItem);

        return toDoItemList.indexOf(toDoItem);
    }

    public void toggleToDo(int index) {
        ToDoItem toDoItem = toDoItemList.get(index);
        toDoItem.toggle();
    }
}
