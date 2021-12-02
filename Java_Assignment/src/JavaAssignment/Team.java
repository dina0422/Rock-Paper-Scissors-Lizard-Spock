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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.awt.Color.*;

public class Team extends JFrame implements ActionListener {
    JLabel header, team1, team2, enter1, enter2, p1t1, p2t1, p1t2, p2t2;
    public JButton btenter1, btenter2;
    public static JTextField txt1, txt2, txt3, txt4;
    public JPanel p2,p3,p4,a1,b1;
    public JPanel aa1,aa2,aa3,aa4,aa5,aa6,aa7,aa8,aa9,aa10,aa11,aa12,aa13,aa14;
    public JPanel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14;
    public Color clr[] = {RED, GREEN, BLUE, YELLOW, GRAY};

    public static void main(String[] args) {
        Team f2 = new Team();
        f2.setSize(800, 550);
        f2.setTitle("JavaAssignment - Team Details");
        f2.setVisible(true);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Team(){

        //declarations
        header = new JLabel("Rock-Paper-Scissors-Lizard-Spock");
        team1 = new JLabel("Team 1"); team1.setFont (new Font ( "Courier",Font.PLAIN, 20));
        team2 = new JLabel("Team 2"); team2.setFont (new Font ( "Courier",Font.PLAIN, 20));
        enter1 = new JLabel("Enter player names:"); enter1.setFont (new Font ( "Courier",Font.PLAIN, 18));
        enter2 = new JLabel("Enter player names:"); enter2.setFont (new Font ( "Courier",Font.PLAIN, 18));
        p1t1 = new JLabel("Player 1: ");
        p2t1 = new JLabel("Player 2: ");
        p1t2 = new JLabel("Player 1: ");
        p2t2 = new JLabel("Player 2: ");

        btenter1 = new JButton("Enter");
        btenter2 = new JButton("Enter");

        txt1 = new JTextField(17);
        txt2 = new JTextField(17);
        txt3 = new JTextField(17);
        txt4 = new JTextField(17);
        //declarations ends here

        //1st panel on the north side to set the title
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255, 106, 0));
        p1.add(header);

        //2nd panel in the middle to place the team1 details one the left and team2 details and the button
        p2 = new JPanel();
        //on the right using gridlayout
        p2.setLayout(new GridLayout(1,2));

        //a1 on the left side of p2
        //b1 on the right side of p2
        a1 = new JPanel();
        b1 = new JPanel();

        //both gridlayout set to 14 rows so that components size's fit suitably
        a1.setLayout(new GridLayout(14,1));
        b1.setLayout(new GridLayout(14,1));

        //aa inside panel a1 on the left side
        aa1 = new JPanel();
        aa2 = new JPanel();
        aa3 = new JPanel();
        aa4 = new JPanel();
        aa5 = new JPanel();
        aa6 = new JPanel();
        aa7 = new JPanel();
        aa8 = new JPanel();
        aa9 = new JPanel();
        aa10 = new JPanel();
        aa11 = new JPanel();
        aa12 = new JPanel();
        aa13 = new JPanel();
        aa14 = new JPanel();

        bb1 = new JPanel();
        bb2 = new JPanel();
        bb3 = new JPanel();
        bb4 = new JPanel();
        bb5 = new JPanel();
        bb6 = new JPanel();
        bb7 = new JPanel();
        bb8 = new JPanel();
        bb9 = new JPanel();
        bb10 = new JPanel();
        bb11 = new JPanel();
        bb12 = new JPanel();
        bb13 = new JPanel();
        bb14 = new JPanel();
        aa4.setLayout(new FlowLayout(FlowLayout.CENTER));
        aa5.setLayout(new FlowLayout(FlowLayout.CENTER));
        aa6.setLayout(new FlowLayout(FlowLayout.CENTER));
        aa7.setLayout(new FlowLayout(FlowLayout.CENTER));
        aa8.setLayout(new FlowLayout(FlowLayout.CENTER));
        aa9.setLayout(new FlowLayout(FlowLayout.CENTER));
        aa10.setLayout(new FlowLayout(FlowLayout.CENTER));

        //bb inside panel b1 on the right side
        bb4.setLayout(new FlowLayout(FlowLayout.CENTER));
        bb5.setLayout(new FlowLayout(FlowLayout.CENTER));
        bb6.setLayout(new FlowLayout(FlowLayout.CENTER));
        bb7.setLayout(new FlowLayout(FlowLayout.CENTER));
        bb8.setLayout(new FlowLayout(FlowLayout.CENTER));

        //team 1 components
        aa4.add(team1);
        aa5.add(enter1);
        aa6.add(p1t1);
        aa6.add(txt1);
        aa7.add(p2t1);
        aa7.add(txt2);
        aa8.add(btenter1);

        //team 2 components
        bb4.add(team2);
        bb5.add(enter2);
        bb6.add(p1t2);
        bb6.add(txt3);
        bb7.add(p2t2);
        bb7.add(txt4);
        bb8.add(btenter2);

        //panel aa's are added in the panel a1
        a1.add(aa1);
        a1.add(aa2);
        a1.add(aa3);
        a1.add(aa4);
        a1.add(aa5);
        a1.add(aa6);
        a1.add(aa7);
        a1.add(aa8);
        a1.add(aa9);
        a1.add(aa10);
        a1.add(aa11);
        a1.add(aa12);
        a1.add(aa13);
        a1.add(aa14);

        //panel bb's are added in the panel b1
        b1.add(bb1);
        b1.add(bb2);
        b1.add(bb3);
        b1.add(bb4);
        b1.add(bb5);
        b1.add(bb6);
        b1.add(bb7);
        b1.add(bb8);
        b1.add(bb9);
        b1.add(bb10);
        b1.add(bb11);
        b1.add(bb12);
        b1.add(bb13);
        b1.add(bb14);

        //p2 panel adds a1 on the left side and b1 on the right side
        p2.add(a1);
        p2.add(b1);

        //to align the components in the center
        team1.setHorizontalAlignment(JLabel.CENTER);
        enter1.setHorizontalAlignment(JLabel.CENTER);
        team2.setHorizontalAlignment(JLabel.CENTER);
        enter2.setHorizontalAlignment(JLabel.CENTER);
        btenter1.setHorizontalAlignment(JLabel.CENTER);

        //p3 and p4 added to give space
        p3 = new JPanel();
        p4 = new JPanel();

        //the positions for the panels
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.EAST);
        add(p4, BorderLayout.WEST);

        btenter1.addActionListener(this);
        btenter2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //when btenter1 is clicked, a dialog message will come out and alert that it is saved
        if(e.getSource() == btenter1)
        {
            if(txt1.getText().equals("") || txt2.getText().equals("") ){
                JOptionPane.showMessageDialog(this,"Please Insert Name For Both Players From Team 1 And Team 2 To Continue.");
            }

            else if(txt1.getText()!= null && txt2.getText() != null &&  txt3.getText().equals("") && txt4.getText().equals("")){
                JOptionPane.showMessageDialog(this,"<html><br>Thank You.<br>Please Enter For Team 2.</html>");}

            else if (txt1.getText()!= null && txt2.getText()!= null && txt3.getText() !=null  && txt4.getText() != null){
                this.setVisible(false);

                GamePlayer1 f1 = new GamePlayer1();

                f1.setSize(800,550);
                f1.setTitle("Java Assignment - GamePage1: Player 1");
                f1.setVisible(true);
                f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f1.tfTeam1.setText("Team 1: "+txt1.getText());  //the value of the team names will be passed into the table
                f1.tfTeam2.setText("Team 2: "+txt3.getText());
                f1.lbTeam1.setText(txt1.getText());
                f1.lbTeam2.setText(txt3.getText());

                f1.aa1.setBackground(clr[Welcome.index]);
                f1.aa2.setBackground(clr[Welcome.index]);
                f1.aa3.setBackground(clr[Welcome.index]);
                f1.bb1.setBackground(clr[Welcome.index]);
                f1.bb2.setBackground(clr[Welcome.index]);
                f1.bb3.setBackground(clr[Welcome.index]);
                f1.cc1.setBackground(clr[Welcome.index]);
                f1.cc2.setBackground(clr[Welcome.index]);
                f1.cc3.setBackground(clr[Welcome.index]);
                f1.dd1.setBackground(clr[Welcome.index]);
                f1.dd2.setBackground(clr[Welcome.index]);
            }
        }


        if(e.getSource() == btenter2)
        {
            if(txt3.getText().equals("") || txt4.getText().equals("") ){
                JOptionPane.showMessageDialog(this,"Please Insert Name For Both Players From Team 1 And Team 2 To Continue.");
            }

            else if(txt3.getText()!= null && txt4.getText() != null &&  txt1.getText().equals("") && txt2.getText().equals("")){
                JOptionPane.showMessageDialog(this,"<html><br>Thank You.<br>Please Enter For Team 1.</html>");}

            else if (txt1.getText()!= null && txt2.getText()!= null && txt3.getText() !=null  && txt4.getText() != null){
                this.setVisible(false);

                GamePlayer1 f1 = new GamePlayer1();

                f1.setSize(800,550);
                f1.setTitle("Java Assignment - GamePage1: Player 1");
                f1.setVisible(true);
                f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //f1.tfTeam2.setText("Team 2: "+txt3.getText());
                f1.tfTeam1.setText("Team 1: "+txt1.getText());  //the value of the team names will be passed into the table
                f1.tfTeam2.setText("Team 2: "+txt3.getText());
                /*f1.lbTeam1.setText(txt1.getText());
                f1.lbTeam2.setText(txt3.getText());*/

                f1.aa1.setBackground(clr[Welcome.index]);
                f1.aa2.setBackground(clr[Welcome.index]);
                f1.aa3.setBackground(clr[Welcome.index]);
                f1.bb1.setBackground(clr[Welcome.index]);
                f1.bb2.setBackground(clr[Welcome.index]);
                f1.bb3.setBackground(clr[Welcome.index]);
                f1.cc1.setBackground(clr[Welcome.index]);
                f1.cc2.setBackground(clr[Welcome.index]);
                f1.cc3.setBackground(clr[Welcome.index]);
                f1.dd1.setBackground(clr[Welcome.index]);
                f1.dd2.setBackground(clr[Welcome.index]);
            }
        }
    }
}