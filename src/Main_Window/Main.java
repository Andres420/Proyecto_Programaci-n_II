package Main_Window;

import Game_1.Swimming_Race;
import Game_2.ButtonPane;

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
    private JButton btnstart;
    public JFrame Main_frame;
    /*This method initializes the program calling other method*/
    public static void main(String[] args) {
        Main wd = new Main();
        wd.Window();
    }
    /*This method is used if you comeback of other window*/
    public void InitWindow(){
            Window();
    }
    /*This method creates the frame*/
    public void Window() {
        Main_frame = new JFrame("Juegos");
        build(Main_frame.getContentPane());
        Main_frame.pack();
        Main_frame.setLocationRelativeTo(null);
        Main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main_frame.setVisible(true);

    }
    /*This method is used for try the panel, running this class*/
    @Override
    public void start() {
        build(this);
    }
    /*This method calls other methods for creates the panels and set in of the frame*/
    public void build(Container pane) {

        pane.setLayout(new BorderLayout());
        Components();
        Components_1();
        Components_2();
        pane.add(main_menu_up, BorderLayout.NORTH);
        pane.add(main_menu_center, BorderLayout.CENTER);
        pane.add(main_menu_down, BorderLayout.SOUTH);
    }

    public void Components() {
        lbltittle = new JLabel("Menu Principal");
        main_menu_up = new JPanel(new FlowLayout(FlowLayout.CENTER));
        main_menu_up.add(lbltittle);
    }
    /*This method creates a radiobuttons and add in the panel*/
    public void Components_1() {
        ButtonGroup buttonGroup = new ButtonGroup();
        jrboption1 = new JRadioButton("Juego de natación", false);
        jrboption2 = new JRadioButton("Juego preguntas y respuestas", false);

        buttonGroup.add(jrboption1);
        buttonGroup.add(jrboption2);

        main_menu_center = new JPanel(new FlowLayout(FlowLayout.CENTER));
        main_menu_center.add(jrboption1);
        main_menu_center.add(jrboption2);
    }
    /*This method creates a one button  and valid if a radiobutton is selected finally open a new window*/
    public void Components_2() {
        main_menu_down = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnstart = new JButton("Iniciar Juego");
        ActionListener listener;
        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jrboption1.isSelected() == true) {
                    Main_frame.dispose();
                    Swimming_Race wd = new Swimming_Race();
                    wd.InitWindow();
                    
                } else if (jrboption2.isSelected() == true) {
                    ButtonPane.Init();
                    Main_frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                }
            }
        };
        btnstart.addActionListener(listener);
        main_menu_down.add(btnstart);
    }
}
