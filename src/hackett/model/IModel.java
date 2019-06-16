package hackett.model;

import hackett.util.annotations.ImplementedBy;

@ImplementedBy(ModelManager.class)
public interface IModel {

    /**
     * @return board state as a 1 dimensional rank array
     */
    Rank[] relayBoardState();

    /**
     * Accepts user input from {@link hackett.controller.IController}
     * and updates logic of board.
     * @param move
     */
    void acceptMove(String move);

}
