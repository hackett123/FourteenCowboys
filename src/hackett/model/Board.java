package hackett.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Board implements IBoard {

    IModel model;
    private int boardLength;

    Board(IModel model) {
        this.model = model;
        this.boardLength = 4;
    }

    @Override
    public void acceptMove(String move) {
        throw new NotImplementedException();
    }

    @Override
    public Rank[] relayBoardState() {
        throw new NotImplementedException();
    }

}
