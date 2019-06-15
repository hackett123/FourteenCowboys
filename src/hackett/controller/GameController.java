package hackett.controller;

import hackett.model.IModel;
import hackett.model.ModelManager;
import hackett.view.CliView;
import hackett.view.IView;

public class GameController implements IController {

    private IView view;
    private IModel model;

    public GameController() {
        view = new CliView(this);
        model = new ModelManager(this);
    }

}
