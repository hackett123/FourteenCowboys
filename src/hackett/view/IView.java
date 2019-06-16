package hackett.view;

import hackett.model.Rank;

public interface IView {

    void sendStartMessage();

    void volleyInput(String input);

    void acceptAndRenderState(Rank[] tiles);

}
