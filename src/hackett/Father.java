package hackett;

import hackett.controller.GameController;

public class Father {
    public static void main(String[] args) {
        new Father();
    }

    Father() {
        new GameController();
    }
}
