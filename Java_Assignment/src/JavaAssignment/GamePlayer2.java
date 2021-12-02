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
import static java.awt.Color.*;

public class GamePlayer2 extends JFrame implements ActionListener {
    JLabel lbTitle, lbRound, lbTeam1, lbTeam2, lbPic1, lbPic2;
    JLabel lbempty1, lbempty2, lbempty3, lbempty4, lbempty5;
    JTextField lbPlayer2, lbRound1, lbRound2, lbRound3, lbTotal;
    JButton btBoom1, btBoom2, btDraw, btResult;
    ImageIcon lizard, paper, rock, scissors, spock;
    Image pic0, newpic0, pic1, newpic1, pic2, newpic2, pic3, newpic3, pic4, newpic4;
    JPanel p2, p3, aa1, aa2, aa3, bb1, bb2, bb3, cc1, cc2, cc3, dd1, dd2;
    public static JTextField tfTeam1, p1r1, p1r2, p1r3, total1;
    public static JTextField tfTeam2, p2r1, p2r2, p2r3, total2;
    static int random1, random2;
    static int totalP2T2, totalP2T1, FinalT1, FinalT2;
    public Color clr[] = {RED, GREEN, BLUE, YELLOW, GRAY};

    public static void main(String[] args) {
        GamePlayer2 f4 = new GamePlayer2();

        f4.setSize(800, 550);
        f4.setTitle("Java Assignment - GamePage: Player 2");
        f4.setVisible(true);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public GamePlayer2() {
        //get image from file named "media"
        lizard = new ImageIcon(getClass().getResource("media/lizard.png"));
        paper = new ImageIcon(getClass().getResource("media/paper.png"));
        rock = new ImageIcon(getClass().getResource("media/rock.png"));
        scissors = new ImageIcon(getClass().getResource("media/scissors.png"));
        spock = new ImageIcon(getClass().getResource("media/spock.png"));

        //to scale the image
        pic0 = lizard.getImage(); //transform it
        newpic0 = pic0.getScaledInstance(120, 120, Image.SCALE_SMOOTH); //to set the size , SCALE_SMOOTH to scale it the smooth way
        lizard = new ImageIcon(newpic0);

        pic1 = paper.getImage(); //transform it
        newpic1 = pic1.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        paper = new ImageIcon(newpic1);

        pic2 = rock.getImage(); //transform it
        newpic2 = pic2.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        rock = new ImageIcon(newpic2);

        pic3 = scissors.getImage(); //transform it
        newpic3 = pic3.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        scissors = new ImageIcon(newpic3);

        pic4 = spock.getImage(); //transform it
        newpic4 = pic4.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        spock = new ImageIcon(newpic4);

        //declarations
        lbTitle = new JLabel("Rock-Paper-Scissors-Lizard-Spock");
        lbRound = new JLabel("Round 1");
        lbTeam1 = new JLabel(Team.txt2.getText());
        lbTeam2 = new JLabel(Team.txt4.getText());
        lbPic1 = new JLabel();
        lbPic1.setHorizontalAlignment(JLabel.CENTER);
        lbPic2 = new JLabel();
        lbPic2.setHorizontalAlignment(JLabel.CENTER);
        lbempty1 = new JLabel();
        lbempty2 = new JLabel();
        lbempty3 = new JLabel();
        lbempty4 = new JLabel();
        lbempty5 = new JLabel();

        lbPlayer2 = new JTextField("Player 1"); lbPlayer2.setFont(new Font("Courier", Font.BOLD, 13));
        lbPlayer2.setEditable(false);
        lbRound1 = new JTextField("Round 1");   lbRound1.setFont(new Font("Courier", Font.BOLD, 13));
        lbRound1.setEditable(false);
        lbRound2 = new JTextField("Round 2");   lbRound2.setFont(new Font("Courier", Font.BOLD, 13));
        lbRound2.setEditable(false);
        lbRound3 = new JTextField("Round 3");   lbRound3.setFont(new Font("Courier", Font.BOLD, 13));
        lbRound3.setEditable(false);
        lbTotal = new JTextField("Total");      lbTotal.setFont(new Font("Courier", Font.BOLD, 13));
        lbTotal.setEditable(false);

        tfTeam1 = new JTextField("Team 1: " + Team.txt2.getText());
        tfTeam1.setHorizontalAlignment(JLabel.CENTER);
        tfTeam1.setEditable(false);
        tfTeam2 = new JTextField("Team 1: " + Team.txt4.getText());
        tfTeam2.setHorizontalAlignment(JLabel.CENTER);
        tfTeam2.setEditable(false);

        p1r1 = new JTextField();
        p1r1.setHorizontalAlignment(JTextField.CENTER);
        p1r1.setEditable(false);
        p2r1 = new JTextField();
        p2r1.setHorizontalAlignment(JTextField.CENTER);
        p2r1.setEditable(false);
        p1r2 = new JTextField();
        p1r2.setHorizontalAlignment(JTextField.CENTER);
        p1r2.setEditable(false);
        p2r2 = new JTextField();
        p2r2.setHorizontalAlignment(JTextField.CENTER);
        p2r2.setEditable(false);
        p1r3 = new JTextField();
        p1r3.setHorizontalAlignment(JTextField.CENTER);
        p1r3.setEditable(false);
        p2r3 = new JTextField();
        p2r3.setHorizontalAlignment(JTextField.CENTER);
        p2r3.setEditable(false);
        total1 = new JTextField();
        total1.setHorizontalAlignment(JTextField.CENTER);
        total1.setEditable(false);
        total2 = new JTextField();
        total2.setHorizontalAlignment(JTextField.CENTER);
        total2.setEditable(false);

        btBoom1 = new JButton("BOOM!");
        btBoom2 = new JButton("BOOM!");
        btResult = new JButton("Result");
        btDraw = new JButton("Draw");
        //declarations ends here

        //to create a black line
        Border blackline = BorderFactory.createLineBorder(Color.BLACK);

        //1st panel on the north side to set the title
        JPanel p1 = new JPanel();
        p1.setBorder(blackline);
        p1.add(lbTitle);
        p1.setBackground(new Color(255, 106, 0));

        //2nd panel to place the round and both image
        p2 = new JPanel();

        //3 row for the "Round", image, and one empty row
        p2.setLayout(new GridLayout(3, 1));

        //aa panels to add inside p2
        aa1 = new JPanel();
        aa2 = new JPanel();
        aa3 = new JPanel();

        aa1.setLayout(new FlowLayout(FlowLayout.CENTER)); //to set the flowlayout
        aa2.setLayout(new GridLayout(1, 3));  //3 columns to put each image on both left and right

        aa1.add(lbRound);
        lbRound.setFont(new Font("Verdana", Font.PLAIN, 18));
        aa1.setBorder(new EmptyBorder(50, 0, 0, 0));
        aa2.add(lbPic1);
        lbPic1.setBorder(blackline);
        aa2.add(lbempty2);
        aa2.add(lbempty3);
        aa2.add(lbPic2);
        lbPic2.setBorder(blackline);
        aa3.add(btDraw);

        p2.add(aa1);
        p2.add(aa2);
        p2.add(aa3);

        //3rd panel on the east position to place the name and the "BOOM" button for player 2 in team 1
        p3 = new JPanel();
        p3.setLayout(new GridLayout(3, 1));

        //bb panels inside p3
        bb1 = new JPanel();
        bb2 = new JPanel();
        bb3 = new JPanel();

        //adjust to 4 rows so that the name and boom button is in the middle
        bb2.setLayout(new GridLayout(4, 1));
        bb2.setBorder(new EmptyBorder(0, 10, 0, 5));

        bb1.add(lbempty4);
        bb2.add(lbTeam1);
        lbTeam1.setHorizontalAlignment(JLabel.CENTER);
        bb2.add(btBoom1);

        p3.add(bb1);
        p3.add(bb2);
        p3.add(bb3);

        //4th panel on the east position to place the name and the "BOOM" button for player 2 in team 2
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(3, 1));

        cc1 = new JPanel();
        cc2 = new JPanel();
        cc3 = new JPanel();

        //adjust to 4 rows so that the name and boom button is in the middle
        cc2.setLayout(new GridLayout(4, 1));
        cc2.setBorder(new EmptyBorder(0, 5, 0, 10));

        //components added into panel cc2
        //components added into panel cc2
        cc1.add(lbempty5);
        cc2.add(lbTeam2);
        lbTeam2.setHorizontalAlignment(JLabel.CENTER);
        cc2.add(btBoom2);

        p4.add(cc1);
        p4.add(cc2);
        p4.add(cc3);

        //5th panel in the south to create the table and button for result page
        JPanel p5 = new JPanel();
        p5.setLayout(new GridLayout(2, 1));
        p5.setPreferredSize(new Dimension(100, 200));

        dd1 = new JPanel();
        dd2 = new JPanel();
        dd1.setLayout(new GridLayout(3, 5));
        dd1.setBorder(blackline);
        dd1.setBorder(new EmptyBorder(0, 20, 0, 20));

        dd1.add(lbPlayer2);
        dd1.add(lbRound1);
        dd1.add(lbRound2);
        dd1.add(lbRound3);
        dd1.add(lbTotal);
        dd1.add(tfTeam1);
        dd1.add(p1r1);
        dd1.add(p1r2);
        dd1.add(p1r3);
        dd1.add(total1);
        dd1.add(tfTeam2);
        dd1.add(p2r1);
        dd1.add(p2r2);
        dd1.add(p2r3);
        dd1.add(total2);

        lbPlayer2.setHorizontalAlignment(JLabel.CENTER);
        lbRound1.setHorizontalAlignment(JLabel.CENTER);
        lbRound2.setHorizontalAlignment(JLabel.CENTER);
        lbRound3.setHorizontalAlignment(JLabel.CENTER);
        lbTotal.setHorizontalAlignment(JLabel.CENTER);

        lbPlayer2.setBorder(blackline);
        lbRound1.setBorder(blackline);
        lbRound2.setBorder(blackline);
        lbRound3.setBorder(blackline);
        lbTotal.setBorder(blackline);
        tfTeam1.setBorder(blackline);
        p1r1.setBorder(blackline);
        p1r2.setBorder(blackline);
        p1r3.setBorder(blackline);
        total1.setBorder(blackline);
        tfTeam2.setBorder(blackline);
        p2r1.setBorder(blackline);
        p2r2.setBorder(blackline);
        p2r3.setBorder(blackline);
        total2.setBorder(blackline);

        dd2.add(btResult);
        p5.add(dd1);
        p5.add(dd2);

        //the positions for the panels
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.WEST);
        add(p4, BorderLayout.EAST);
        add(p5, BorderLayout.SOUTH);

        btBoom1.addActionListener(this);
        btBoom2.addActionListener(this);
        btResult.addActionListener(this);
        btDraw.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        ImageIcon icon[] = {lizard, paper, rock, scissors, spock};

        if (e.getSource() == btBoom1) {
            random1 = (int) (Math.random() * 5);
            lbPic1.setIcon(icon[random1]);
        }
        if (e.getSource() == btBoom2) {
            random2 = (int) (Math.random() * 5);
            lbPic2.setIcon(icon[random2]);
        }

        if (e.getSource() == btDraw) {
            if (lbPic2.getIcon() != null && lbPic1.getIcon() != null) {
                if (p1r1.getText().isEmpty()) {
                    lbRound.setText("Round 2");
                    if (random1 == 0 && random2 == 0) {
                        p1r1.setText("0");
                        p2r1.setText("0");
                    }
                    if (random1 == 0 && random2 == 1) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }

                    if (random1 == 0 && random2 == 2) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }
                    if (random1 == 0 && random2 == 3) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }
                    if (random1 == 0 && random2 == 4) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }

                    if (random1 == 1 && random2 == 0) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }
                    if (random1 == 1 && random2 == 1) {
                        p1r1.setText("0");
                        p2r1.setText("0");
                    }
                    if (random1 == 1 && random2 == 2) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }
                    if (random1 == 1 && random2 == 3) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }
                    if (random1 == 1 && random2 == 4) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }


                    if (random1 == 2 && random2 == 0) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }
                    if (random1 == 2 && random2 == 1) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }
                    if (random1 == 2 && random2 == 2) {
                        p1r1.setText("0");
                        p2r1.setText("0");
                    }
                    if (random1 == 2 && random2 == 3) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }
                    if (random1 == 2 && random2 == 4) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }

                    if (random1 == 3 && random2 == 0) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }
                    if (random1 == 3 && random2 == 1) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }
                    if (random1 == 3 && random2 == 2) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }
                    if (random1 == 3 && random2 == 3) {
                        p1r1.setText("0");
                        p2r1.setText("0");
                    }
                    if (random1 == 3 && random2 == 4) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }


                    if (random1 == 4 && random2 == 0) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }
                    if (random1 == 4 && random2 == 1) {
                        p1r1.setText("0");
                        p2r1.setText("1");
                    }
                    if (random1 == 4 && random2 == 2) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }
                    if (random1 == 4 && random2 == 3) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }
                    if (random1 == 4 && random2 == 4) {
                        p1r1.setText("0");
                        p2r1.setText("0");
                    }
                    if (random1 == 0 && random2 == 0) {
                        p1r1.setText("0");
                        p2r1.setText("0");
                    }
                    if (random1 == 0 && random2 == 1) {
                        p1r1.setText("1");
                        p2r1.setText("0");
                    }
                } else if (p1r2.getText().isEmpty()) {
                    lbRound.setText("Round 3");
                    if (random1 == 0 && random2 == 0) {
                        p1r2.setText("0");
                        p2r2.setText("0");
                    }
                    if (random1 == 0 && random2 == 1) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }

                    if (random1 == 0 && random2 == 2) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }
                    if (random1 == 0 && random2 == 3) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }
                    if (random1 == 0 && random2 == 4) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }

                    if (random1 == 1 && random2 == 0) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }
                    if (random1 == 1 && random2 == 1) {
                        p1r2.setText("0");
                        p2r2.setText("0");
                    }
                    if (random1 == 1 && random2 == 2) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }
                    if (random1 == 1 && random2 == 3) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }
                    if (random1 == 1 && random2 == 4) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }


                    if (random1 == 2 && random2 == 0) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }
                    if (random1 == 2 && random2 == 1) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }
                    if (random1 == 2 && random2 == 2) {
                        p1r2.setText("0");
                        p2r2.setText("0");
                    }
                    if (random1 == 2 && random2 == 3) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }
                    if (random1 == 2 && random2 == 4) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }

                    if (random1 == 3 && random2 == 0) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }
                    if (random1 == 3 && random2 == 1) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }
                    if (random1 == 3 && random2 == 2) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }
                    if (random1 == 3 && random2 == 3) {
                        p1r2.setText("0");
                        p2r2.setText("0");
                    }
                    if (random1 == 3 && random2 == 4) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }


                    if (random1 == 4 && random2 == 0) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }
                    if (random1 == 4 && random2 == 1) {
                        p1r2.setText("0");
                        p2r2.setText("1");
                    }
                    if (random1 == 4 && random2 == 2) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }
                    if (random1 == 4 && random2 == 3) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }
                    if (random1 == 4 && random2 == 4) {
                        p1r2.setText("0");
                        p2r2.setText("0");
                    }
                    if (random1 == 0 && random2 == 0) {
                        p1r2.setText("0");
                        p2r2.setText("0");
                    }
                    if (random1 == 0 && random2 == 1) {
                        p1r2.setText("1");
                        p2r2.setText("0");
                    }
                } else if (p1r3.getText().isEmpty()) {
                    if (random1 == 0 && random2 == 0) {
                        p1r3.setText("0");
                        p2r3.setText("0");
                    }
                    if (random1 == 0 && random2 == 1) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }

                    if (random1 == 0 && random2 == 2) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }
                    if (random1 == 0 && random2 == 3) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }
                    if (random1 == 0 && random2 == 4) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }

                    if (random1 == 1 && random2 == 0) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }
                    if (random1 == 1 && random2 == 1) {
                        p1r3.setText("0");
                        p2r3.setText("0");
                    }
                    if (random1 == 1 && random2 == 2) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }
                    if (random1 == 1 && random2 == 3) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }
                    if (random1 == 1 && random2 == 4) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }


                    if (random1 == 2 && random2 == 0) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }
                    if (random1 == 2 && random2 == 1) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }
                    if (random1 == 2 && random2 == 2) {
                        p1r3.setText("0");
                        p2r3.setText("0");
                    }
                    if (random1 == 2 && random2 == 3) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }
                    if (random1 == 2 && random2 == 4) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }

                    if (random1 == 3 && random2 == 0) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }
                    if (random1 == 3 && random2 == 1) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }
                    if (random1 == 3 && random2 == 2) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }
                    if (random1 == 3 && random2 == 3) {
                        p1r3.setText("0");
                        p2r3.setText("0");
                    }
                    if (random1 == 3 && random2 == 4) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }


                    if (random1 == 4 && random2 == 0) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }
                    if (random1 == 4 && random2 == 1) {
                        p1r3.setText("0");
                        p2r3.setText("1");
                    }
                    if (random1 == 4 && random2 == 2) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }
                    if (random1 == 4 && random2 == 3) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }
                    if (random1 == 4 && random2 == 4) {
                        p1r3.setText("0");
                        p2r3.setText("0");
                    }
                    if (random1 == 0 && random2 == 0) {
                        p1r3.setText("0");
                        p2r3.setText("0");
                    }
                    if (random1 == 0 && random2 == 1) {
                        p1r3.setText("1");
                        p2r3.setText("0");
                    }
                }


                if (!(p1r1.getText().equals("") || p1r2.getText().equals("") || p1r3.getText().equals(""))) {
                    int n1 = Integer.parseInt(p1r1.getText());
                    int n2 = Integer.parseInt(p1r2.getText());
                    int n3 = Integer.parseInt(p1r3.getText());
                    totalP2T1 = n1 + n2 + n3;
                    total1.setText(String.valueOf(totalP2T1));
                }
                if (!(p2r1.getText().equals("") || p2r2.getText().equals("") || p2r3.getText().equals(""))) {
                    int m1 = Integer.parseInt(p2r1.getText());
                    int m2 = Integer.parseInt(p2r2.getText());
                    int m3 = Integer.parseInt(p2r3.getText());
                    totalP2T2 = m1 + m2 + m3;
                    total2.setText(String.valueOf(totalP2T2));
                }
            }
        }

        if (e.getSource() == btResult) {
            if (!(total1.getText().equals("")) && !(total2.getText().equals(""))) {
                this.setVisible(false);

                Result f5 = new Result();

                f5.setSize(800, 550);
                f5.setTitle("Java Assignment - Result");
                f5.setVisible(true);
                f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                f5.lbp1t1.setText("Team 1: " + Team.txt1.getText());
                f5.lbp2t1.setText("Team 1: " + Team.txt2.getText());
                f5.lbp1t2.setText("Team 2: " + Team.txt3.getText());
                f5.lbp2t2.setText("Team 2: " + Team.txt4.getText());

                f5.tf1aa.setText(p1r1.getText());
                f5.tf2aa.setText(p1r2.getText());
                f5.tf3aa.setText(p1r3.getText());
                f5.tfTotal2a.setText(total1.getText());
                f5.tf1bb.setText(p2r1.getText());
                f5.tf2bb.setText(p2r2.getText());
                f5.tf3bb.setText(p2r3.getText());
                f5.tfTotal2b.setText(total2.getText());

                f5.tf1a.setText(GamePlayer1.p1r1.getText());
                f5.tf2a.setText(GamePlayer1.p1r2.getText());
                f5.tf3a.setText(GamePlayer1.p1r3.getText());
                f5.tfTotal1a.setText(GamePlayer1.total1.getText());
                f5.tf1b.setText(GamePlayer1.p2r1.getText());
                f5.tf2b.setText(GamePlayer1.p2r2.getText());
                f5.tf3b.setText(GamePlayer1.p2r3.getText());
                f5.tfTotal1b.setText(GamePlayer1.total2.getText());

                int FT1P1 = Integer.parseInt(GamePlayer1.total1.getText());
                int FT2P1 = Integer.parseInt(GamePlayer1.total2.getText());
                int FT1P2 = Integer.parseInt(GamePlayer2.total1.getText());
                int FT2P2 = Integer.parseInt(GamePlayer2.total2.getText());

                FinalT1 = FT1P1 + FT1P2;
                FinalT2 = FT2P1 + FT2P2;

                f5.tfTeam1Score.setText(String.valueOf(FinalT1));
                f5.tfTeam2Score.setText(String.valueOf(FinalT2));
                f5.tfTeam2Score.setHorizontalAlignment(JTextField.LEFT);
                f5.tfTeam2Score.setHorizontalAlignment(JTextField.LEFT);
                f5.tfTeam1Score.setFont (new Font ("Courier", Font.BOLD, 25));
                f5.tfTeam2Score.setFont (new Font ("Courier", Font.BOLD, 25));
                f5.lbTeam1.setFont (new Font ("Courier", Font.BOLD, 25));
                f5.lbTeam2.setFont (new Font ("Courier", Font.BOLD, 25));

                f5.p2.setBackground(clr[Welcome.index]);
                f5.p4.setBackground(clr[Welcome.index]);
                f5.p5.setBackground(clr[Welcome.index]);
                f5.aa1.setBackground(clr[Welcome.index]);
                f5.aa2.setBackground(clr[Welcome.index]);
                f5.bb1.setBackground(clr[Welcome.index]);
                f5.bb2.setBackground(clr[Welcome.index]);
                f5.cc1.setBackground(clr[Welcome.index]);
                f5.cc2.setBackground(clr[Welcome.index]);
                f5.tfTeam1Score.setBackground(clr[Welcome.index]);
                f5.tfTeam2Score.setBackground(clr[Welcome.index]);
                f5.lbWinnerName.setBackground(clr[Welcome.index]);
                f5.lbPic.setBackground(clr[Welcome.index]);

                if (FinalT1 > FinalT2) {
                    f5.lbWinnerName.setText("Team 1");
                }
                if (FinalT2 > FinalT1) {
                    f5.lbWinnerName.setText("Team 2");
                }
                if (FinalT2 == FinalT1) {
                    JOptionPane.showMessageDialog(this, "<html><br>Both team score is tied.<br>Please Replay To Determine The Winner.</html>");
                    f5.setVisible(false);

                    GamePlayer1 f3 = new GamePlayer1();

                    f3.setSize(800, 550);
                    f3.setTitle("Java Assignment - GamePage: Player 1");
                    f3.setVisible(true);
                    f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    f3.aa1.setBackground(clr[Welcome.index]);
                    f3.aa2.setBackground(clr[Welcome.index]);
                    f3.aa3.setBackground(clr[Welcome.index]);
                    f3.bb1.setBackground(clr[Welcome.index]);
                    f3.bb2.setBackground(clr[Welcome.index]);
                    f3.bb3.setBackground(clr[Welcome.index]);
                    f3.cc1.setBackground(clr[Welcome.index]);
                    f3.cc2.setBackground(clr[Welcome.index]);
                    f3.cc3.setBackground(clr[Welcome.index]);
                    f3.dd1.setBackground(clr[Welcome.index]);
                    f3.dd1.setBackground(clr[Welcome.index]);
                    f3.dd2.setBackground(clr[Welcome.index]);
                }
            }
        }
    }
}
