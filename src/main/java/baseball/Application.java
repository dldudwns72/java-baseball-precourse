package baseball;

import baseball.ui.Game;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        int tryNumber = 1;

        while (tryNumber == 1) {
            new Game().start();
            String restart = Console.readLine();
            tryNumber = Integer.parseInt(restart);
        }
    }


}
