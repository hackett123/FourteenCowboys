package hackett.view.gui;

import hackett.view.IView;

public class GuiHandler implements Runnable {

    IView view;

    public GuiHandler(IView view) {
        this.view = view;
        run();
    }

    @Override
    public void run() {
        //TODO : Implement GUI Components
    }

}
