import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class App {
    public static void main(String [ ] args){
        MainDialog dialog = new MainDialog();
        dialog.pack();
        GameOfLife gameOfLife = new GameOfLife(dialog);
        gameOfLife.run();

    }
}

