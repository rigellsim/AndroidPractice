package android.sim.rigell.androidpractice.todo.view;

import android.sim.rigell.androidpractice.todo.present.ToDoPresenter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.sim.rigell.androidpractice.R;

public class ToDoActivity extends AppCompatActivity implements ToDoView {

    private ToDoPresenter toDoPresenter = new ToDoPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        toDoPresenter.onCreate();
    }

    public void clickAddTodoItemButton() {

    }

    public void clickSaveTodoItem() {

    }
}
