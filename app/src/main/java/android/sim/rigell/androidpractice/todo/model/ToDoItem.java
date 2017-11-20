package android.sim.rigell.androidpractice.todo.model;

/**
 * Created by simks88 on 2017. 11. 21..
 */

public class ToDoItem {
    private String todo;
    private boolean isDone;

    public ToDoItem(String todo) {
        this.todo = todo;
    }

    public void toggle() {
        this.isDone = !this.isDone;
    }
}
