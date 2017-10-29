package android.sim.rigell.androidpractice.mvp.view;

/**
 * Created by simks88 on 2017. 10. 29..
 */

public interface TicTacToeView {
    void showWinner(String winningPlayerDisplayLabel);

    void clearWinnerDisplay();

    void clearButtons();

    void setButtonText(int row, int col, String text);
}
