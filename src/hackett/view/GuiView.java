package hackett.view;

import hackett.controller.IController;
import hackett.model.Rank;
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

    @Override
    public void volleyInput(String input) { throw new NotImplementedException(); }

    @Override
    public void acceptAndRenderState(Rank[] tiles) { throw new NotImplementedException(); }

}
