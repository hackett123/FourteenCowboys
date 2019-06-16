package hackett.model;

import hackett.util.annotations.ImplementedBy;

@ImplementedBy(Board.class)
public interface IBoard {

    void acceptMove(String move);

    Rank[] relayBoardState();

}
