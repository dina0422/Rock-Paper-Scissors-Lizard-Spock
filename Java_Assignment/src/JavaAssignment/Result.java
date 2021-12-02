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
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import static java.awt.Color.*;

public class Result extends JFrame implements ActionListener
{
    JLabel lbTitle, lbPic, lbTeam1, lbTeam2, lbWinner,lbempty1,lbempty2,lbempty3,lbempty4,lbempty5;
    JTextField lbPlayer1,lbRound1a,lbRound2a,lbRound3a,lbTotal1,lbp1t1,lbp1t2,
            lbPlayer2,lbRound1b,lbRound2b,lbRound3b,lbTotal2,lbp2t1,lbp2t2;
    JTextField tf1a,tf2a,tf3a,tfTotal1a,tf1b,tf2b,tf3b,tfTotal1b,       //a-round 1, b-round 2
            tf1aa,tf2aa,tf3aa,tfTotal2a,tf1bb,tf2bb,tf3bb,tfTotal2b,
            tfTeam1Score,tfTeam2Score,lbWinnerName;
    JButton btExit;
    ImageIcon partyIcon;
    Image image,newimg;
    JPanel p1,p2,p3,p4,p5,aa1,aa2,bb1,bb2,cc1,cc2;
    public Color clr[] = {RED, GREEN, BLUE, YELLOW, GRAY};

    public static void main(String[] args)
    {
        Result f5 = new Result();

        f5.setSize(800,550);
        f5.setTitle("Java Assignment - Result");
        f5.setVisible(true);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Result()
    {
        btExit = new JButton("EXIT");

        //to display the image
        partyIcon = new ImageIcon(getClass().getResource("media/party.png"));
        image = partyIcon.getImage(); //transform it
        newimg = image.getScaledInstance(150,120, BufferedImage.SCALE_SMOOTH); //to set the size
        partyIcon = new ImageIcon(newimg);
        lbPic = new JLabel(partyIcon);

        lbTitle = new JLabel("Rock-Paper-Scissors-Lizard-Spock");
        lbTeam1 = new JLabel("Team 1:");
        tfTeam1Score = new JTextField("Score 1");
        tfTeam1Score.setHorizontalAlignment(JTextField.LEFT);
        tfTeam1Score.setBorder(BorderFactory.createEmptyBorder());
        tfTeam1Score.setEditable(false);
        lbTeam2 = new JLabel("Team 2:");
        tfTeam2Score = new JTextField("Score 2");
        tfTeam2Score.setBorder(BorderFactory.createEmptyBorder());
        tfTeam2Score.setHorizontalAlignment(JTextField.LEFT);
        tfTeam2Score.setEditable(false);
        lbWinner = new JLabel("Congratulation!! ");
        lbWinnerName = new JTextField("Game Over");
        lbWinnerName.setBorder(BorderFactory.createEmptyBorder());
        lbWinnerName.setEditable(false);

        lbTeam1.setFont (new Font ( "Courier",Font.PLAIN, 20));
        lbTeam2.setFont (new Font ("Courier", Font.PLAIN, 20));
        lbWinner.setFont (new Font ("Courier", Font.BOLD, 25));
        lbWinnerName.setFont (new Font ("Courier", Font.BOLD, 26));
        lbWinnerName.setForeground(Color.pink);
        tfTeam2Score.setFont(new Font ( "Courier",Font.PLAIN, 20));
        tfTeam1Score.setFont(new Font ( "Courier",Font.PLAIN, 20));

        lbempty1 = new JLabel();
        lbempty2 = new JLabel();
        lbempty3 = new JLabel();
        lbempty4 = new JLabel();
        lbempty5 = new JLabel();

        lbPlayer1 = new JTextField("Player 1");  lbPlayer1.setEditable(false);
        lbRound1a = new JTextField("Round 1");   lbRound1a.setEditable(false);
        lbRound2a = new JTextField("Round 2");   lbRound2a.setEditable(false);
        lbRound3a = new JTextField("Round 3");   lbRound3a.setEditable(false);
        lbTotal1 = new JTextField("Total");      lbTotal1.setEditable(false);
        lbp1t1 = new JTextField();               lbp1t1.setEditable(false);
        lbp1t2 = new JTextField();               lbp1t2.setEditable(false);
        lbPlayer2 = new JTextField("Player 2");  lbPlayer2.setEditable(false);
        lbRound1b = new JTextField("Round 1");   lbRound1b.setEditable(false);
        lbRound2b = new JTextField("Round 2");   lbRound2b.setEditable(false);
        lbRound3b = new JTextField("Round 3");   lbRound3b.setEditable(false);
        lbTotal2 = new JTextField("Total");      lbTotal2.setEditable(false);
        lbp2t1 = new JTextField();               lbp2t1.setEditable(false);
        lbp2t2 = new JTextField();               lbp2t2.setEditable(false);

        lbp1t1.setHorizontalAlignment(JLabel.CENTER);
        lbp1t2.setHorizontalAlignment(JLabel.CENTER);
        lbp2t1.setHorizontalAlignment(JLabel.CENTER);
        lbp2t2.setHorizontalAlignment(JLabel.CENTER);

        lbPlayer1.setFont(new Font("Courier", Font.BOLD, 13));
        lbRound1a.setFont(new Font("Courier", Font.BOLD, 13));
        lbRound2a.setFont(new Font("Courier", Font.BOLD, 13));
        lbRound3a.setFont(new Font("Courier", Font.BOLD, 13));
        lbTotal1.setFont(new Font("Courier", Font.BOLD, 13));
        lbp1t1.setFont(new Font("Courier", Font.BOLD, 13));
        lbp1t2.setFont(new Font("Courier", Font.BOLD, 13));
        lbPlayer2.setFont(new Font("Courier", Font.BOLD, 13));
        lbRound1b.setFont(new Font("Courier", Font.BOLD, 13));
        lbRound2b.setFont(new Font("Courier", Font.BOLD, 13));
        lbRound3b.setFont(new Font("Courier", Font.BOLD, 13));
        lbTotal2.setFont(new Font("Courier", Font.BOLD, 13));
        lbp2t1.setFont(new Font("Courier", Font.BOLD, 13));
        lbp2t2.setFont(new Font("Courier", Font.BOLD, 13));

        tf1a = new JTextField();       tf1a.setEditable(false);
        tf2a = new JTextField();       tf2a.setEditable(false);
        tf3a = new JTextField();       tf3a.setEditable(false);
        tfTotal1a = new JTextField();  tfTotal1a.setEditable(false);
        tf1b = new JTextField();       tf1b.setEditable(false);
        tf2b = new JTextField();       tf2b.setEditable(false);
        tf3b = new JTextField();       tf3b.setEditable(false);
        tfTotal1b = new JTextField();  tfTotal1b.setEditable(false);
        tf1aa = new JTextField();      tf1aa.setEditable(false);
        tf2aa = new JTextField();      tf2aa.setEditable(false);
        tf3aa = new JTextField();      tf3aa.setEditable(false);
        tfTotal2a = new JTextField();  tfTotal2a.setEditable(false);
        tf1bb = new JTextField();      tf1bb.setEditable(false);
        tf2bb = new JTextField();      tf2bb.setEditable(false);
        tf3bb = new JTextField();      tf3bb.setEditable(false);
        tfTotal2b = new JTextField();  tfTotal2b.setEditable(false);

        tf1a.setHorizontalAlignment(JTextField.CENTER);
        tf2a.setHorizontalAlignment(JTextField.CENTER);
        tf3a.setHorizontalAlignment(JTextField.CENTER);
        tfTotal1a.setHorizontalAlignment(JTextField.CENTER);
        tf1b.setHorizontalAlignment(JTextField.CENTER);
        tf2b.setHorizontalAlignment(JTextField.CENTER);
        tf3b.setHorizontalAlignment(JTextField.CENTER);
        tfTotal1b.setHorizontalAlignment(JTextField.CENTER);
        tf1aa.setHorizontalAlignment(JTextField.CENTER);
        tf2aa.setHorizontalAlignment(JTextField.CENTER);
        tf3aa.setHorizontalAlignment(JTextField.CENTER);
        tfTotal2a.setHorizontalAlignment(JTextField.CENTER);
        tf1bb.setHorizontalAlignment(JTextField.CENTER);
        tf2bb.setHorizontalAlignment(JTextField.CENTER);
        tf3bb.setHorizontalAlignment(JTextField.CENTER);
        tfTotal2b.setHorizontalAlignment(JTextField.CENTER);
        Border blackline = BorderFactory.createLineBorder(Color.BLACK);

        //1st panel for the title
        p1 = new JPanel();
        p1.setBorder(blackline);
        p1.add(lbTitle);
        p1.setBackground(new Color(255, 106, 0));

        //2nd panel in the center to display team score and winner using gridlayout
        p2 = new JPanel();
        p2.setBorder(new EmptyBorder(0, 0, 0, 0));
        p2.setLayout(new GridLayout(2,1));

        aa1 = new JPanel();
        aa2 = new JPanel();

        aa1.setLayout(new GridLayout(2,4));
        aa2.setLayout(new FlowLayout(FlowLayout.LEFT));

        aa1.add(lbempty1);aa1.add(lbempty2);aa1.add(lbempty3);aa1.add(lbempty4);
        aa1.add(lbTeam1);aa1.add(tfTeam1Score);aa1.add(lbTeam2);aa1.add(tfTeam2Score);
        aa2.add(lbWinner);aa2.add(lbWinnerName);

        p2.add(aa1);
        p2.add(aa2);

        //3rd panel on the west side to display the image
        p3 = new JPanel();
        p3.setLayout(new GridLayout(1,1));

        p3.add(lbPic);
        lbPic.setBorder(new EmptyBorder(20, 20, 10, 20));
        lbPic.setOpaque(true);

        //4th panel on the east side to display the exit button
        p4 = new JPanel();
        p4.setLayout(new GridLayout(3,1));

        bb1 = new JPanel();
        bb2 = new JPanel();

        bb2.setLayout(new GridLayout(3,1));
        bb2.setBorder(new EmptyBorder(0, 10, 0, 5));

        bb1.add(btExit);
        bb2.add(lbempty5);

        p4.add(bb1);
        p4.add(bb2);

        //5th panel on the south position to make a table using gridlayout
        p5 = new JPanel();
        p5.setLayout(new GridLayout(2,1));
        p5.setPreferredSize(new Dimension(100,270));

        cc1 = new JPanel();
        cc2 = new JPanel();

        cc1.setLayout(new GridLayout(3,5));
        cc1.setBorder(new EmptyBorder(0, 20, 10, 20));
        cc2.setLayout(new GridLayout(3,5));
        cc2.setBorder(new EmptyBorder(0, 20, 10, 20));

        //Arranged as it is to visualize the table with the codes
        cc1.add(lbPlayer1);cc1.add(lbRound1a);cc1.add(lbRound2a);cc1.add(lbRound3a);cc1.add(lbTotal1);
        cc1.add(lbp1t1);cc1.add(tf1a);cc1.add(tf2a);cc1.add(tf3a);cc1.add(tfTotal1a);
        cc1.add(lbp1t2);cc1.add(tf1b);cc1.add(tf2b);cc1.add(tf3b);cc1.add(tfTotal1b);
        cc2.add(lbPlayer2);cc2.add(lbRound1b);cc2.add(lbRound2b);cc2.add(lbRound3b);cc2.add(lbTotal2);
        cc2.add(lbp2t1);cc2.add(tf1aa);cc2.add(tf2aa);cc2.add(tf3aa);cc2.add(tfTotal2a);
        cc2.add(lbp2t2);cc2.add(tf1bb);cc2.add(tf2bb);cc2.add(tf3bb);cc2.add(tfTotal2b);

        lbPlayer1.setBorder(new EmptyBorder(10, 10, 0, 5));

        lbPlayer1.setHorizontalAlignment(JLabel.CENTER);lbRound1a.setHorizontalAlignment(JLabel.CENTER);lbRound2a.setHorizontalAlignment(JLabel.CENTER);
        lbRound3a.setHorizontalAlignment(JLabel.CENTER);lbTotal1.setHorizontalAlignment(JLabel.CENTER);

        lbPlayer2.setHorizontalAlignment(JLabel.CENTER);lbRound1b.setHorizontalAlignment(JLabel.CENTER);lbRound2b.setHorizontalAlignment(JLabel.CENTER);
        lbRound3b.setHorizontalAlignment(JLabel.CENTER);lbTotal2.setHorizontalAlignment(JLabel.CENTER);

        lbPlayer1.setBorder(blackline);lbRound1a.setBorder(blackline);lbRound2a.setBorder(blackline);lbRound3a.setBorder(blackline);lbTotal1.setBorder(blackline);
        lbp1t1.setBorder(blackline);tf1a.setBorder(blackline);tf2a.setBorder(blackline);tf3a.setBorder(blackline);tfTotal1a.setBorder(blackline);
        lbp1t2.setBorder(blackline);tf1b.setBorder(blackline);tf2b.setBorder(blackline);tf3b.setBorder(blackline);tfTotal1b.setBorder(blackline);
        lbPlayer2.setBorder(blackline);lbRound1b.setBorder(blackline);lbRound2b.setBorder(blackline);lbRound3b.setBorder(blackline);lbTotal2.setBorder(blackline);
        lbp2t1.setBorder(blackline);tf1aa.setBorder(blackline);tf2aa.setBorder(blackline);tf3aa.setBorder(blackline);tfTotal2a.setBorder(blackline);
        lbp2t2.setBorder(blackline);tf1bb.setBorder(blackline);tf2bb.setBorder(blackline);tf3bb.setBorder(blackline);tfTotal2b.setBorder(blackline);

        p5.add(cc1);
        p5.add(cc2);

        //the positions for the panels
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.WEST);
        add(p4,BorderLayout.EAST);
        add(p5,BorderLayout.SOUTH);

        btExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btExit)
        {
            int x = JOptionPane.showConfirmDialog
                    (this, "Are You Sure You Want To Exit The Program?", "Application Exit Confirm", JOptionPane.YES_NO_OPTION);
            if(x == JOptionPane.NO_OPTION);
            else if (x == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(this, "Thanks For Playing The Game!");
                System.exit(0);
            }
        }
    }
}
