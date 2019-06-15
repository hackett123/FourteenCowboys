package hackett.view;

import hackett.controller.IController;
import hackett.view.gui.GuiHandler;

public class GuiView implements IView {

    IController controller;
    GuiHandler guiHanlder;

    public GuiView(IController controller) {
        this.controller = controller;
        guiHanlder = new GuiHandler(this);

    }

}
