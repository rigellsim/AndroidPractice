package android.sim.rigell.androidpractice.tictactoe.presenter;

import android.sim.rigell.androidpractice.tictactoe.model.Board;
import android.sim.rigell.androidpractice.tictactoe.model.Player;
import android.sim.rigell.androidpractice.tictactoe.view.TicTacToeView;

/**
 * Created by simks88 on 2017. 10. 29..
 */

public class TicTacToePresenter implements Presenter {

    private TicTacToeView view;
    private Board model;

    public TicTacToePresenter(TicTacToeView view) {
        this.view = view;
        this.model = new Board();
    }

    @Override
    public void onCreate() {
        this.model = new Board();
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void onButtonSelected(int row, int col) {
        Player playerThatMoved = model.mark(row, col);

        if (playerThatMoved != null) {
            view.setButtonText(row, col, playerThatMoved.toString());

            if (model.getWinner() != null) {
                view.showWinner(playerThatMoved.toString());
            }
        }
    }

    public void onResetSelected() {
        view.clearWinnerDisplay();
        view.clearButtons();
        model.restart();
    }
}
