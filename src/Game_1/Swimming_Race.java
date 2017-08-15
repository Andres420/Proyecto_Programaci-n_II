package Game_1;

import Main_Window.Main;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swimming_Race extends JApplet {
    
    public static JLabel lblflag, lblline, lblswimmer1,
            lblswimmer2, lblswimmer3, lblswimmer4, lblswimmer5;
    private JPanel pane_game_center, pane_game_up, pane_game_left, pane_game_right, pane_game_down;
    public static JButton btnstart, btnrestart, btnback, btnstatistics;
    static JTextArea txtreport = new JTextArea(20, 15);
    public JFrame frame;
    public static JRadioButton jrbswimmer1, jrbswimmer2, jrbswimmer3, jrbswimmer4, jrbswimmer5;
    public static JLabel lblseparator, lblseparator_1, lblseparator_2, lblseparator_3, lblseparator_4, lblseparator_5, lbltimer;
    boolean a, b, c, d, e;
    public static int games = 0, draws = 0;
    public static int swimmer1wins = 0, swimmer2wins = 0, swimmer3wins = 0, swimmer4wins = 0, swimmer5wins = 0;
    public static int swimmer1defeats = 0, swimmer2defeats = 0, swimmer3defeats = 0, swimmer4defeats = 0, swimmer5defeats = 0;
    public static int limit = 0;
    /*This method create the window if you stay in the main menu*/
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
        } catch (Exception ev) {
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
    /*This method creates the window or frame*/
    private void Windows() {
        frame = new JFrame("Juego 1");
        Build(frame.getContentPane());
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }
    /*This method calls other methods for creates the panels and set in of the frame*/
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
    }
    /*This method is used for try the panel, running this class*/
    @Override
    public void start() {
        Build(this);
    }
    /*This method creates the Radiobuttons and add in the panel*/
    public void Components() {
        pane_game_up = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jrbswimmer1 = new JRadioButton("Michael Phelps", false);
        jrbswimmer2 = new JRadioButton("Ian Thorphe", false);
        jrbswimmer3 = new JRadioButton("Ryan Lochte", false);
        jrbswimmer4 = new JRadioButton("Mark Spitz", false);
        jrbswimmer5 = new JRadioButton("Alexander Popov", false);
        pane_game_up.add(jrbswimmer1);
        pane_game_up.add(jrbswimmer2);
        pane_game_up.add(jrbswimmer3);
        pane_game_up.add(jrbswimmer4);
        pane_game_up.add(jrbswimmer5);
        
    }
    /*This method creates the textarea and add in the panel*/
    public void Components_1() {
        txtreport.setEditable(false);
        pane_game_left = new JPanel();
        pane_game_left.setLayout(new BoxLayout(pane_game_left, BoxLayout.Y_AXIS));
        pane_game_left.add(txtreport);
        
    }
    /*This method creates the buttons and actionlistener and add in the panel*/
    public void Components_2() {
        btnback = new JButton("Atras");
        btnstart = new JButton("Iniciar");
        btnrestart = new JButton("Reiniciar");
        btnstatistics = new JButton("Reiniciar Est");
        btnstatistics.setEnabled(false);
        btnrestart.setEnabled(false);
        
        ActionListener button_btnstart = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                if (jrbswimmer1.isSelected() == true) {
                    a = true;
                    limit += 1;
                }
                if (jrbswimmer2.isSelected() == true) {
                    b = true;
                    limit += 1;
                }
                if (jrbswimmer3.isSelected() == true) {
                    c = true;
                    limit += 1;
                }
                if (jrbswimmer4.isSelected() == true) {
                    d = true;
                    limit += 1;
                }
                if (jrbswimmer5.isSelected() == true) {
                    e = true;
                    limit += 1;
                }
                if (limit > 1) {
                    games++;
                    jrbswimmer1.setEnabled(false);
                    jrbswimmer2.setEnabled(false);
                    jrbswimmer3.setEnabled(false);
                    jrbswimmer4.setEnabled(false);
                    jrbswimmer5.setEnabled(false);
                    Race.iniciar(a, b, c, d, e);
                    a = false;
                    b = false;
                    c = false;
                    d = false;
                    e = false;
                    btnstart.setEnabled(false);
                    btnrestart.setEnabled(false);
                    btnstatistics.setEnabled(false);
                    btnback.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione mas jugadores");
                }
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
                jrbswimmer1.setSelected(false);
                jrbswimmer2.setSelected(false);
                jrbswimmer3.setSelected(false);
                jrbswimmer4.setSelected(false);
                jrbswimmer5.setSelected(false);
                jrbswimmer1.setEnabled(true);
                jrbswimmer2.setEnabled(true);
                jrbswimmer3.setEnabled(true);
                jrbswimmer4.setEnabled(true);
                jrbswimmer5.setEnabled(true);
                lbltimer.setText("Duracion de la carrera:");
                lblswimmer1.setLocation(Race.swimmer[0].getCoorX(), Race.swimmer[0].getCoorY());
                lblswimmer2.setLocation(Race.swimmer[1].getCoorX(), Race.swimmer[1].getCoorY());
                lblswimmer3.setLocation(Race.swimmer[2].getCoorX(), Race.swimmer[2].getCoorY());
                lblswimmer4.setLocation(Race.swimmer[3].getCoorX(), Race.swimmer[3].getCoorY());
                lblswimmer5.setLocation(Race.swimmer[4].getCoorX(), Race.swimmer[4].getCoorY());
                btnstart.setEnabled(true);
                btnrestart.setEnabled(false);
                btnback.setEnabled(true);
            }
            
        };
        btnrestart.addActionListener(button_btnrestart);
        ActionListener button_btnstatistics = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swimmer1wins = 0;
                swimmer2wins = 0;
                swimmer3wins = 0;
                swimmer4wins = 0;
                swimmer5wins = 0;
                swimmer1defeats = 0;
                swimmer2defeats = 0;
                swimmer3defeats = 0;
                swimmer4defeats = 0;
                swimmer5defeats = 0;
                draws = 0;
                games = 0;
                txtreport.setText("");
            }
            
        };
        btnstatistics.addActionListener(button_btnstatistics);
        pane_game_right = new JPanel();
        pane_game_right.setLayout(new BoxLayout(pane_game_right, BoxLayout.Y_AXIS));
        
        pane_game_right.add(btnstart);
        pane_game_right.add(btnrestart);
        pane_game_right.add(btnback);
        pane_game_right.add(btnstatistics);
        
    }
    /*This method creates the center panel and accommodate the images*/
    public void Components_3() {
        lblswimmer1 = new JLabel();
        lblswimmer2 = new JLabel();
        lblswimmer3 = new JLabel();
        lblswimmer4 = new JLabel();
        lblswimmer5 = new JLabel();
        lblline = new JLabel();
        lblseparator = new JLabel("___________________________________________________________________");
        lblseparator_1 = new JLabel("___________________________________________________________________");
        lblseparator_2 = new JLabel("___________________________________________________________________");
        lblseparator_3 = new JLabel("___________________________________________________________________");
        lblseparator_4 = new JLabel("___________________________________________________________________");
        lblseparator_5 = new JLabel("___________________________________________________________________");
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
    /*This method creates a label, if a race ends it sets the time of the race and add in the panel*/
    public void Components_4() {
        pane_game_down = new JPanel();
        lbltimer = new JLabel("Duracion de la carrera:");
        pane_game_down.add(lbltimer);
        
    }
    
}
