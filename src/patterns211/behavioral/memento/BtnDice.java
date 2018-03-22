package patterns211.behavioral.memento;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnDice extends JButton implements Command {
	private static final long serialVersionUID = 1L;
	Mediator med;
    BtnDice(ActionListener al, Mediator m) {
        super("Throw Dice");
        addActionListener(al);
        med = m;
        med.registerDice(this);
    }
    public void execute() {
       med.throwit();
    }
}
