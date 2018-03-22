package patterns211.behavioral.memento;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnPrevious extends JButton implements Command {
	private static final long serialVersionUID = 1L;
	Mediator med;
    BtnPrevious(ActionListener al, Mediator m) {
        super("Previous");
        addActionListener(al);
        med = m;
        med.registerPrevious(this);
    }
    public void execute() {
       med.previous();
    }
}
