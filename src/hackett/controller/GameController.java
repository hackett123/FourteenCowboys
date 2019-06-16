package hackett.controller;

import hackett.model.IModel;
import hackett.model.ModelManager;
import hackett.model.Rank;
import hackett.view.CliView;
import hackett.view.IView;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class GameController implements IController {

    private IView view;
    private IModel model;

    public GameController() {
        view = new CliView(this);
        model = new ModelManager(this);
        startGame();
    }

    @Override
    public void startGame() {
        view.sendStartMessage();
    }

    @Override
    public void volleyMove(String move) {
        throw new NotImplementedException();
    }

    @Override
    public void volleyBoardState(Rank[] ranks) {
        throw new NotImplementedException();
    }

}
