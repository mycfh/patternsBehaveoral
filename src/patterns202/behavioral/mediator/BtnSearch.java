package patterns202.behavioral.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnSearch extends JButton implements Command {
	private static final long serialVersionUID = 1L;
	Mediator med;
    BtnSearch(ActionListener al, Mediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }
    public void execute() {
       med.search();
    }
}