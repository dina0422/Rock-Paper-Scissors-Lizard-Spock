/*
 Class Section: TT4V/TT6V
 Trimester 2 2020/21
 Members:
 ASRIL BIN SUDIRMAN       | 1191202710 | 013-8115171
 IRDINA BINTI AHMAD HILMI | 1191200368 | 013-2217568
 IVEN LOW ZI YIN          | 1191202539 | 012-4426389
 LAM JERN HERR            | 1191202333 | 010-3646438
 NUR IRDINA BINTI HASSAN  | 1191202351 | 010-8604152
*/
package JavaAssignment;

import javax.swing.*;import java.awt.*;
import java.awt.event.*;
import static java.awt.Color.*;

public class Welcome extends JFrame implements ActionListener {
    private JLabel lbTitle, lbWelcome, lbSelect;
    private JPanel p2, a1, a2, a3, e1, p3;
    private JButton btProceed;
    public JComboBox cbColor;
    public Color color[] = {RED, GREEN, BLUE, YELLOW, GRAY};
    public String clr[] = {"RED", "GREEN", "BLUE", "YELLOW", "GRAY"};
    static int index;

    public static void main(String[] args) {
        Welcome frame = new Welcome();
        frame.setTitle("JavaAssignment");
        frame.setSize(800, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Welcome() {

        lbTitle = new JLabel("Rock-Paper-Scissors-Lizard-Spock");
        lbWelcome = new JLabel("Welcome!");
        lbSelect = new JLabel("Please select the background color before you proceed:");

        lbWelcome.setFont(new Font("Courier", Font.PLAIN, 18));
        lbSelect.setFont(new Font("Courier", Font.PLAIN, 15));

        cbColor = new JComboBox(clr);

        btProceed = new JButton("Proceed");

        //1st panel on the north side to set the title
        JPanel p1 = new JPanel();
        p1.add(lbTitle);
        p1.setBackground(new Color(255, 106, 0));

        //2nd panel on the center position
        p2 = new JPanel();
        p2.setLayout(new GridLayout(14, 1));

        a1 = new JPanel();
        a2 = new JPanel();
        a3 = new JPanel();
        e1 = new JPanel();

        a1.add(lbWelcome);
        a2.add(lbSelect);
        a3.add(cbColor);

        p2.add(e1);
        p2.add(a1);
        p2.add(a2);
        p2.add(a3);

        //3rd panel on the south position to create proceed button
        p3 = new JPanel();
        p3.add(btProceed);

        //the positions for the panels
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        cbColor.addActionListener(this);
        btProceed.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        index = cbColor.getSelectedIndex();  //to get the index
        if (e.getSource() == cbColor) {
            index = cbColor.getSelectedIndex();
            p2.setBackground(color[index]);
            a1.setBackground(color[index]);
            a2.setBackground(color[index]);
            a3.setBackground(color[index]);
            e1.setBackground(color[index]);
            p3.setBackground(color[index]);

        }

        if (e.getSource() == btProceed) {
            this.setVisible(false);

            Team f2 = new Team();
            f2.setSize(800, 550);
            f2.setTitle("JavaAssignment - Team Details");
            f2.setVisible(true);

            f2.p3.setBackground(color[index]);
            f2.p4.setBackground(color[index]);
            f2.a1.setBackground(color[index]);
            f2.b1.setBackground(color[index]);
            f2.aa1.setBackground(color[index]);
            f2.aa2.setBackground(color[index]);
            f2.aa3.setBackground(color[index]);
            f2.aa4.setBackground(color[index]);
            f2.aa5.setBackground(color[index]);
            f2.aa6.setBackground(color[index]);
            f2.aa7.setBackground(color[index]);
            f2.aa8.setBackground(color[index]);
            f2.aa9.setBackground(color[index]);
            f2.aa10.setBackground(color[index]);
            f2.aa11.setBackground(color[index]);
            f2.aa12.setBackground(color[index]);
            f2.aa13.setBackground(color[index]);
            f2.aa14.setBackground(color[index]);
            f2.bb1.setBackground(color[index]);
            f2.bb2.setBackground(color[index]);
            f2.bb3.setBackground(color[index]);
            f2.bb4.setBackground(color[index]);
            f2.bb5.setBackground(color[index]);
            f2.bb6.setBackground(color[index]);
            f2.bb7.setBackground(color[index]);
            f2.bb8.setBackground(color[index]);
            f2.bb9.setBackground(color[index]);
            f2.bb10.setBackground(color[index]);
            f2.bb11.setBackground(color[index]);
            f2.bb12.setBackground(color[index]);
            f2.bb13.setBackground(color[index]);
            f2.bb14.setBackground(color[index]);
        }
    }
}


