package Game_1;

import javax.swing.*;

public class Swimming_Race extends JFrame{
    
   
    public static JLabel lblBandera,lblLinea,lblswimmer1,
            lblswimmer2,lblswimmer3,lblswimmer4,lblswimmer5;
    private JPanel pane_game_center,pane_game_up,pane_game_left,pane_game_right;
    public static JButton btniniciar,btnreiniciar;
    private JScrollPane jspScroll;    
    public static JTextArea txtinfo;
    private JLabel jLabel3,jLabel5,jLabel6;
    
    private void initComponents(){
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
    }
}
