package patterns206.behavioral.command;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

class Test extends JFrame {
	private static final long serialVersionUID = 1L;

	Test() {
		Action ea = new ExitAction("Exit", null, this);
		Action sa = new SubmitAction("Submit", null, this);

		JMenuBar jbr = new JMenuBar();
		JMenu dropmenu = new JMenu("File");
		JMenuItem submitmenu = new JMenuItem(sa);
		JMenuItem exitmenu = new JMenuItem(ea);
		dropmenu.add(submitmenu);
		dropmenu.add(exitmenu);
		jbr.add(dropmenu);
		setJMenuBar(jbr);

		final JPopupMenu pop = new JPopupMenu("PopMenu");
		pop.add(sa);
		pop.add(ea);
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				showPopup(e);
			}

			public void mouseReleased(MouseEvent e) {
				showPopup(e);
			}

			private void showPopup(MouseEvent e) {
				if (e.isPopupTrigger()) {
					pop.show(e.getComponent(), e.getX(), e.getY());
				}
			}

		});
		JPanel jp = new JPanel();
		JButton subbtn = new JButton(sa);
		JButton exitbtn = new JButton(ea);
		jp.add(subbtn);
		jp.add(exitbtn);

		Container con = getContentPane();
		con.add(jp, "South");

		setTitle("Command pattern example");
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test();
	}
}
