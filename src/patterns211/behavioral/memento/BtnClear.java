package patterns211.behavioral.memento;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnClear extends JButton implements Command {
	private static final long serialVersionUID = 1L;
	Mediator med;
    BtnClear(ActionListener al, Mediator m) {
        super("Clear");
        addActionListener(al);
        med = m;
        med.registerClear(this);
    }
    public void execute() {
       med.clear();
    }
}
