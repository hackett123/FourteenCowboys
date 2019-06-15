package hackett.view;

import hackett.controller.IController;
import hackett.view.gui.GuiHandler;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class GuiView implements IView {

    IController controller;
    GuiHandler guiHanlder;

    public GuiView(IController controller) {
        this.controller = controller;
        guiHanlder = new GuiHandler(this);

    }

    @Override
    public void sendStartMessage() {
        throw new NotImplementedException();
    }

}
