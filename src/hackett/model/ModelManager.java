package hackett.model;

import hackett.controller.IController;

public class ModelManager implements IModel {

    private IController controller;

    public ModelManager(IController controller) {
        this.controller = controller;
    }
}
