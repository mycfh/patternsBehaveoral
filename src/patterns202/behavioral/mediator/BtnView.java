package patterns202.behavioral.mediator;

import java.awt.event.ActionListener;
import javax.swing.JButton;

class BtnView extends JButton implements Command {
	private static final long serialVersionUID = 1L;
	Mediator med;
    BtnView(ActionListener al, Mediator m) {
        super("View");
        addActionListener(al);
        med = m;
        med.registerView(this);
    }
    public void execute() {
       med.view();
    }
}