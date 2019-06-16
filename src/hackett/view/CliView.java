package hackett.view;

import hackett.controller.IController;
import hackett.model.Rank;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

    @Override
    public void volleyInput(String input) {
        throw new NotImplementedException();
    }

    @Override
    public void acceptAndRenderState(Rank[] tiles) { throw new NotImplementedException(); }
}
