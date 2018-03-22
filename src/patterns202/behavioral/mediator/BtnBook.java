package patterns202.behavioral.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnBook extends JButton implements Command {
	private static final long serialVersionUID = 1L;
	Mediator med;
    BtnBook (ActionListener al, Mediator m) {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }
    public void execute() {
       med.book();
    }
}
