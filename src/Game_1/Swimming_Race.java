package Game_1;

import Main_Window.Main;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Swimming_Race extends JApplet {

    public static JLabel lblflag, lblline, lblswimmer1,
            lblswimmer2, lblswimmer3, lblswimmer4, lblswimmer5;
    private JPanel pane_game_center, pane_game_up, pane_game_left, pane_game_right, pane_game_down;
    public static JButton btnstart, btnrestart, btnback;
    private JLabel lbltimer, lblreport_1, lblreport_2, lblreport_3, lblreport_4, lblreport_5;
    public JFrame frame;
    public JRadioButton jrbswimmer1, jrbswimmer2, jrbswimmer3, jrbswimmer4, jrbswimmer5;
    public static JLabel lblseparator, lblseparator_1, lblseparator_2, lblseparator_3, lblseparator_4, lblseparator_5;
    boolean a, b, c, d, e;

    public void InitWindow() {
        try {
            frame.setVisible(true);
            btnstart.setEnabled(true);
            Race.Register_Swimmers();
            lblswimmer1.setText(Race.swimmer[0].getName());
            lblswimmer2.setText(Race.swimmer[1].getName());
            lblswimmer3.setText(Race.swimmer[2].getName());
            lblswimmer4.setText(Race.swimmer[3].getName());
            lblswimmer5.setText(Race.swimmer[4].getName());
        } catch (Exception e) {
            Windows();
            btnstart.setEnabled(true);
            Race.Register_Swimmers();
            lblswimmer1.setText(Race.swimmer[0].getName());
            lblswimmer2.setText(Race.swimmer[1].getName());
            lblswimmer3.setText(Race.swimmer[2].getName());
            lblswimmer4.setText(Race.swimmer[3].getName());
            lblswimmer5.setText(Race.swimmer[4].getName());

        }

    }

    private void Windows() {
        frame = new JFrame("Juego 1");
        Build(frame.getContentPane());
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void Build(Container pane) {
        pane.setLayout(new BorderLayout());
        Components();
        Components_1();
        Components_2();
        Components_3();
        Components_4();
        pane.setLayout(new BorderLayout());
        pane.add(pane_game_up, BorderLayout.NORTH);
        pane.add(pane_game_left, BorderLayout.WEST);
        pane.add(pane_game_right, BorderLayout.EAST);
        pane.add(pane_game_center, BorderLayout.CENTER);
        pane.add(pane_game_down, BorderLayout.SOUTH);

        MouseMotionListener ml = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                lblreport_1.setText("x = " + e.getX());
                lblreport_2.setText("y = " + e.getY());
            }
        };
        this.addMouseMotionListener(ml);

    }

    @Override
    public void start() {
        Build(this);
    }

    public void Components() {
        pane_game_up = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jrbswimmer1 = new JRadioButton("Michael Phelps", false);
        jrbswimmer2 = new JRadioButton("Ian Thorphe", false);
        jrbswimmer3 = new JRadioButton("Ryan Lochte", false);
        jrbswimmer4 = new JRadioButton("Mark Spitz", false);
        jrbswimmer5 = new JRadioButton("Alexander Popov", false);
        //jrbswimmer1.
        pane_game_up.add(jrbswimmer1);
        pane_game_up.add(jrbswimmer2);
        pane_game_up.add(jrbswimmer3);
        pane_game_up.add(jrbswimmer4);
        pane_game_up.add(jrbswimmer5);

    }

    public void Components_1() {
        pane_game_left = new JPanel();
        pane_game_left.setLayout(new BoxLayout(pane_game_left, BoxLayout.Y_AXIS));
        pane_game_left.add(lblreport_1 = new JLabel("Reporte 1"));
        pane_game_left.add(lblreport_2 = new JLabel("Reporte 2"));
        pane_game_left.add(lblreport_3 = new JLabel("Con más victorias es: " + System.lineSeparator()));
        pane_game_left.add(lblreport_4 = new JLabel("Con más derrotas es:" + System.lineSeparator()));
        pane_game_left.add(lblreport_5 = new JLabel("Empates registrados: "));

    }

    public void Components_2() {

        btnback = new JButton("Atras");
        btnstart = new JButton("Iniciar");
        btnrestart = new JButton("Reiniciar");
        btnrestart.setEnabled(false);

        ActionListener button_btnstart = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {

                if (jrbswimmer1.isSelected() == true) {
                    a = true;
                }
                if (jrbswimmer2.isSelected() == true) {
                    b = true;
                }
                if (jrbswimmer3.isSelected() == true) {
                    c = true;
                }
                if (jrbswimmer4.isSelected() == true) {
                    d = true;
                }
                if (jrbswimmer5.isSelected() == true) {
                    e = true;
                }
                Race.iniciar(a, b, c, d, e);
                a = false;
                b = false;
                c = false;
                d = false;
                e = false;
                btnstart.setEnabled(false);
                btnrestart.setEnabled(true);
                btnback.setEnabled(false);
            }

        };
        btnstart.addActionListener(button_btnstart);

        ActionListener button_btnback = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                Main mn = new Main();
                mn.InitWindow();
            }

        };
        btnback.addActionListener(button_btnback);

        ActionListener button_btnrestart = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Race.Restart();
                lblswimmer1.setLocation(Race.swimmer[0].getCoorX(), Race.swimmer[0].getCoorY());
                lblswimmer2.setLocation(Race.swimmer[1].getCoorX(), Race.swimmer[1].getCoorY());
                lblswimmer3.setLocation(Race.swimmer[2].getCoorX(), Race.swimmer[2].getCoorY());
                lblswimmer4.setLocation(Race.swimmer[3].getCoorX(), Race.swimmer[3].getCoorY());
                lblswimmer5.setLocation(Race.swimmer[4].getCoorX(), Race.swimmer[4].getCoorY());
                btnstart.setEnabled(true);
                btnback.setEnabled(true);
            }

        };
        btnrestart.addActionListener(button_btnrestart);

        pane_game_right = new JPanel();
        pane_game_right.setLayout(new BoxLayout(pane_game_right, BoxLayout.Y_AXIS));

        pane_game_right.add(btnstart);
        pane_game_right.add(btnrestart);
        pane_game_right.add(btnback);

    }

    public void Components_3() {
        lblswimmer1 = new JLabel();
        lblswimmer2 = new JLabel();
        lblswimmer3 = new JLabel();
        lblswimmer4 = new JLabel();
        lblswimmer5 = new JLabel();
        lblline = new JLabel();
        lblseparator = new JLabel("________________________________________________________________________________");
        lblseparator_1 = new JLabel("________________________________________________________________________________");
        lblseparator_2 = new JLabel("________________________________________________________________________________");
        lblseparator_3 = new JLabel("________________________________________________________________________________");
        lblseparator_4 = new JLabel("________________________________________________________________________________");
        lblseparator_5 = new JLabel("________________________________________________________________________________");
        pane_game_center = new JPanel();

        pane_game_center.setBackground(new java.awt.Color(12, 183, 242));
        ImageIcon icon = new ImageIcon(getClass().getResource("/Image/swimming.png"));
        ImageIcon icon_line = new ImageIcon(getClass().getResource("/Image/linea.png"));
        lblswimmer1.setIcon(icon);
        lblswimmer2.setIcon(icon);
        lblswimmer3.setIcon(icon);
        lblswimmer4.setIcon(icon);
        lblswimmer5.setIcon(icon);
        lblline.setIcon(icon_line);

        javax.swing.GroupLayout pane_game_centerLayout = new javax.swing.GroupLayout(pane_game_center);
        pane_game_center.setLayout(pane_game_centerLayout);
        pane_game_centerLayout.setHorizontalGroup(
                pane_game_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pane_game_centerLayout.createSequentialGroup()
                                .addGroup(pane_game_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblseparator_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblswimmer2)
                                        .addComponent(lblswimmer1)
                                        .addComponent(lblseparator)
                                        .addComponent(lblswimmer3)
                                        .addComponent(lblswimmer4)
                                        .addComponent(lblseparator_5)
                                        .addComponent(lblseparator_3)
                                        .addComponent(lblseparator_4)
                                        .addComponent(lblswimmer5)
                                        .addComponent(lblseparator_2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblline, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(140, Short.MAX_VALUE))
        );
        pane_game_centerLayout.setVerticalGroup(
                pane_game_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pane_game_centerLayout.createSequentialGroup()
                                .addGroup(pane_game_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pane_game_centerLayout.createSequentialGroup()
                                                .addComponent(lblseparator)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblswimmer1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblseparator_1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblswimmer2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblseparator_5)
                                                .addGap(30, 30, 30)
                                                .addComponent(lblswimmer3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblseparator_3)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblswimmer4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblseparator_4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblswimmer5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblseparator_2))
                                        .addGroup(pane_game_centerLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblline)))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
    }

    public void Components_4() {
        pane_game_down = new JPanel();
        lbltimer = new JLabel("0");
        pane_game_down.add(lbltimer);

    }

}
