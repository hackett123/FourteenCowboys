package hackett.view;

import hackett.controller.IController;

public class CliView implements IView{

    private IController controller;

    public CliView(IController controller) {
        this.controller = controller;
    }
}
