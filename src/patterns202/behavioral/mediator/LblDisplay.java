package patterns202.behavioral.mediator;

import java.awt.Font;

import javax.swing.JLabel;

class LblDisplay extends JLabel{
	private static final long serialVersionUID = 1L;
	Mediator med;
    LblDisplay (Mediator m) {
        super("Just start...");
        med = m;
        med.registerDisplay(this);
        setFont(new Font("Arial",Font.BOLD,24));
    }
}
