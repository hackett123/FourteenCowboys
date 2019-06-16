package hackett.controller;

import hackett.model.Rank;
import hackett.util.annotations.ImplementedBy;

@ImplementedBy(GameController.class)
public interface IController {

    void startGame();

    /**
     * Accepts user input from {@link hackett.view.IView} and sends it
     * to {@link hackett.model.IModel}.
     * @param move
     */
    void volleyMove(String move);

    /**
     * Accepts board state from {@link hackett.model.IModel}
     * and relays it to {@link hackett.view.IView} for rendering.
     * @param ranks
     */
    void volleyBoardState(Rank[] ranks);

}
