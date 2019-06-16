package hackett.view;

import hackett.model.Rank;
import hackett.util.annotations.ImplementedBy;

@ImplementedBy(CliView.class) @ImplementedBy(GuiView.class)
public interface IView {

    void sendStartMessage();

    void volleyInput(String input);

    void acceptAndRenderState(Rank[] tiles);

}
