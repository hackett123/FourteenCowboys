package hackett.model;

import hackett.controller.IController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ModelManager implements IModel {

    private IController controller;
    private IBoard board;

    public ModelManager(IController controller) {
        this.controller = controller;
        initBoard();
    }

    private void initBoard() {
        board = new Board(this);
    }

    @Override
    public Rank[] relayBoardState() {
        throw new NotImplementedException();
    }

    @Override
    public void acceptMove(String move) {
        throw new NotImplementedException();
    }
}
