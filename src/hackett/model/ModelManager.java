package hackett.model;

import hackett.controller.IController;

public class ModelManager implements IModel {

    private IController controller;
    private IBoard board;

    public ModelManager(IController controller, IBoard board) {
        this.controller = controller;
        this.board = board;
    }
}
