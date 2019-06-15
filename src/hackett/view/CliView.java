package hackett.view;

import hackett.controller.IController;

public class CliView implements IView{

    private IController controller;

    public CliView(IController controller) {
        this.controller = controller;
    }

    private void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void sendStartMessage() {
        sendMessage("Welcome to Fourteen Cowboys. Press any key to begin the game");
    }
}
