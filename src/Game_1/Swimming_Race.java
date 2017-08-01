package Game_1;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;
import java.awt.FlowLayout;

public class Swimming_Race extends JApplet {

    public static JLabel lblBandera, lblline, lblswimmer1,
            lblswimmer2, lblswimmer3, lblswimmer4, lblswimmer5;
    private JPanel pane_game_center, pane_game_up, pane_game_left, pane_game_right;
    public static JButton btnstart, btnrestart, btnback;
    private JScrollPane jspScroll;
    public static JTextArea txtinfo;
    private JLabel lbltimer, lblreport_1, lblreport_2, lblreport_3, lblreport_4, lblreport_5;
    public JFrame frame;
    private JRadioButton jrbswimmer1, jrbswimmer2, jrbswimmer3, jrbswimmer4, jrbswimmer5;

    public void InitWindows() {
        Windows();
    }

    private void Windows() {
        frame = new JFrame("Juego 1");

        Build(frame.getContentPane());
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(new java.awt.Color(255, 0, 51));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
    }

    public void Build(Container pane) {
        pane.setLayout(new BorderLayout());
        Components();
        Components_1();
        Components_2();
        pane.setLayout(new BorderLayout());
        pane.add(pane_game_up, BorderLayout.NORTH);
        pane.add(pane_game_left, BorderLayout.WEST);
        pane.add(pane_game_right, BorderLayout.EAST);
    }

    @Override
    public void start() {
        Build(this);
    }

    public void Components() {
        //pane_game_up = new JPanel();
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

    public void Components_1() {
        pane_game_left = new JPanel();
        pane_game_left.setLayout(new BoxLayout(pane_game_left, BoxLayout.Y_AXIS));
        pane_game_left.add(lblreport_1 = new JLabel("Reporte 1"));
        pane_game_left.add(lblreport_2 = new JLabel("Reporte 2"));
        pane_game_left.add(lblreport_3 = new JLabel("Reporte 3"));
        pane_game_left.add(lblreport_4 = new JLabel("Reporte 4"));
        pane_game_left.add(lblreport_5 = new JLabel("Reporte 5"));

    }

    public void Components_2() {
        btnback = new JButton("Atras");
        btnstart = new JButton("Iniciar");
        btnrestart = new JButton("Reiniciar");
        pane_game_right = new JPanel();
        pane_game_right.setLayout(new BoxLayout(pane_game_right, BoxLayout.Y_AXIS));

        pane_game_right.add(btnstart);
        pane_game_right.add(btnrestart);
        pane_game_right.add(btnback);

    }
    public void Components_3(){
    //TODO EL CODIGO DEL CENTRO
    }
}
