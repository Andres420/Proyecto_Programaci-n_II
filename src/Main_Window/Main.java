package Main_Window;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main extends JApplet {

    private JPanel main_menu_center, main_menu_up, main_menu_down;
    private JLabel lbltittle;
    private JRadioButton jrboption1, jrboption2;
    private JButton btniniciar;
    private JFrame start;

    public static void main(String[] args) {
        Main wd = new Main();
        wd.Windows();
    }

    public void Windows() {
        start = new JFrame("Juegos");
        build(start.getContentPane());
        start.pack();
        start.setLocationRelativeTo(null);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setVisible(true);

    }

    @Override
    public void start() {
        build(this);
    }

    public void build(Container pane) {

        pane.setLayout(new BorderLayout());
        Components();
        Components_1();
        Components_2();
        pane.setLayout(new BorderLayout());
        pane.add(main_menu_up, BorderLayout.NORTH);
        pane.add(main_menu_center, BorderLayout.CENTER);
        pane.add(main_menu_down, BorderLayout.SOUTH);
    }

    public void Components() {
        lbltittle = new JLabel("Menu Principal");
        main_menu_up = new JPanel(new FlowLayout(FlowLayout.CENTER));
        main_menu_up.add(lbltittle);
    }
    
    public void Components_1() {
        ButtonGroup buttonGroup = new ButtonGroup();
        jrboption1 = new JRadioButton("Juego de natación", false);
        jrboption2 = new JRadioButton("Juego preguntas y respuestas", false);
        jrboption2.setEnabled(false);

        buttonGroup.add(jrboption1);
        buttonGroup.add(jrboption2);

        main_menu_center = new JPanel(new FlowLayout(FlowLayout.CENTER));
        main_menu_center.add(jrboption1);
        main_menu_center.add(jrboption2);
    }

    public void Components_2() {
        main_menu_down = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btniniciar = new JButton("Iniciar Juego");
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jrboption1.isSelected() == true) {
                    JOptionPane.showMessageDialog(null, "Opcion1");
                    //start.setVisible(false);
                } else if (jrboption2.isSelected() == true) {
                    JOptionPane.showMessageDialog(null, "Opcion2");
                    //start.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                }
            }
        };
        btniniciar.addActionListener(listener);
        main_menu_down.add(btniniciar);
    }
}