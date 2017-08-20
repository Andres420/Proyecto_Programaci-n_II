package Game_2;

import Main_Window.Main;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonPane extends JPanel {

    public static JFrame f;
    public static JLabel corrects, corrects_q, incorrects, incorrects_q;
    public static JPanel up = new JPanel(), down = new JPanel();
    public static JButton[][] buttons;
    public static ArrayList<Integer> list_questions = new ArrayList<Integer>();
    public static ArrayList list = new ArrayList<>();
    public static int create = 0;
    public static int pos_y, pos_x, answers_correct = 0, answers_incorrect = 0, wildcard = 0;
    Random rnd = new Random();
    ImageIcon image = new ImageIcon(getClass().getResource("/Image/pared.jpg"));
    ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
    ImageIcon image_como = new ImageIcon(getClass().getResource("/Image/comodin.jpg"));
    ImageIcon icon_como = new ImageIcon(image_como.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
    ImageIcon image_finish = new ImageIcon(getClass().getResource("/Image/meta.jpg"));
    ImageIcon icon_finish = new ImageIcon(image_finish.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
    ImageIcon image_player = new ImageIcon(getClass().getResource("/Image/yo.png"));
    ImageIcon icon_player = new ImageIcon(image_player.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
    int num_1 = 11;
    static int have_posibily = 1;
    int wildcard_enabled = 1;

    /*This method close the window and call the main menu*/
    static void CloseWindow() {
        f.dispose();
        Main mn = new Main();
        mn.InitWindow();
    }

    /*This builder creates buttons and add actionlistener in other class, keylistener */
    public ButtonPane(int row, int col) {
        super(new GridLayout(row, col));
        buttons = new JButton[row][col];
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                final int curRow = i;
                final int curCol = j;
                int num = rnd.nextInt(2);
                //try{
                if ((buttons[i][j] != buttons[0][0]) && (buttons[i][j] != buttons[0][1]) && (buttons[i][j] != buttons[1][0])) {
                    if ((num == 1) && (num_1 != 0) && (j != 4) && (i != 7) && (num_1 != 5)) {
                        buttons[i][j] = new JButton();
                        buttons[i][j].setIcon(icon);
                        buttons[i][j].setText("p");
                        num_1 -= 1;
                        Logic_Buttons.Action_Listener(i, j);
                    } else if ((num == 1) && (wildcard_enabled != 0) && (j != 4) && (i != 7)) {
                        buttons[i][j] = new JButton();
                        buttons[i][j].setIcon(icon_como);
                        buttons[i][j].setText("w");
                        wildcard_enabled -= 1;
                        Logic_Buttons.Action_Listener(i, j);
                        if (num_1 == 5) {
                            num_1 -= 1;
                        }
                    } else if (j == 4 && i == 7) {
                        buttons[i][j] = new JButton();
                        buttons[i][j].setIcon(icon_finish);
                        buttons[i][j].setText("f");
                        Logic_Buttons.Action_Listener(i, j);
                        buttons[0][0].setIcon(icon_player);
                    } else {
                        buttons[i][j] = new JButton(".");
                        Logic_Buttons.Action_Listener(i, j);
                    }
                } else {
                    buttons[i][j] = new JButton(".");
                    Logic_Buttons.Action_Listener(i, j);
                }
                buttons[i][j].addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        switch (e.getKeyCode()) {
                            case KeyEvent.VK_UP:
                                if (curRow > 0) {
                                    if (buttons[curRow - 1][curCol].isRequestFocusEnabled() == true) {
                                        buttons[curRow][curCol].setEnabled(false);
                                        buttons[curRow][curCol].setRequestFocusEnabled(false);
                                        buttons[curRow - 1][curCol].requestFocus();
                                        buttons[curRow - 1][curCol].setIcon(icon_player);
                                        buttons[curRow][curCol].setIcon(null);
                                        pos_y = curRow - 1;
                                        pos_x = curCol;
                                        Logic_Buttons.Questions(pos_y, pos_x);
                                    }
                                }
                                break;
                            case KeyEvent.VK_DOWN:
                                if (curRow < buttons.length - 1) {
                                    if (buttons[curRow + 1][curCol].isRequestFocusEnabled() == true) {
                                        buttons[curRow][curCol].setEnabled(false);
                                        buttons[curRow][curCol].setRequestFocusEnabled(false);
                                        buttons[curRow + 1][curCol].requestFocus();
                                        buttons[curRow + 1][curCol].setIcon(icon_player);
                                        buttons[curRow][curCol].setIcon(null);
                                        pos_y = curRow + 1;
                                        pos_x = curCol;
                                        Logic_Buttons.Questions(pos_y, pos_x);
                                    }
                                }
                                break;
                            case KeyEvent.VK_LEFT:
                                if (curCol > 0) {
                                    if (buttons[curRow][curCol - 1].isRequestFocusEnabled() == true) {
                                        buttons[curRow][curCol].setEnabled(false);
                                        buttons[curRow][curCol].setRequestFocusEnabled(false);
                                        buttons[curRow][curCol - 1].requestFocus();
                                        buttons[curRow][curCol - 1].setIcon(icon_player);
                                        buttons[curRow][curCol].setIcon(null);
                                        pos_y = curRow;
                                        pos_x = curCol - 1;
                                        Logic_Buttons.Questions(pos_y, pos_x);
                                    }
                                }
                                break;
                            case KeyEvent.VK_RIGHT:
                                if (curCol < buttons[curRow].length - 1) {
                                    if (buttons[curRow][curCol + 1].isRequestFocusEnabled() == true) {
                                        buttons[curRow][curCol].setEnabled(false);
                                        buttons[curRow][curCol].setRequestFocusEnabled(false);
                                        buttons[curRow][curCol + 1].requestFocus();
                                        buttons[curRow][curCol + 1].setIcon(icon_player);
                                        buttons[curRow][curCol].setIcon(null);
                                        pos_y = curRow;
                                        pos_x = curCol + 1;
                                        Logic_Buttons.Questions(pos_y, pos_x);
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                });
                add(buttons[i][j]);
            }

        }
    }

    /*This method creates the panel up and down, add a button of wildcard and call other class*/
    public ButtonPane() {
        corrects = new JLabel("Correctas: ");
        corrects_q = new JLabel("0");
        incorrects = new JLabel("Incorrectas: ");
        incorrects_q = new JLabel("0");
        JButton btnwildcard = new JButton("Comodin");
        btnwildcard.setRequestFocusEnabled(false);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (wildcard == 1) {
                    Strongbox dialog = new Strongbox(new javax.swing.JFrame(), true);
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
                } else if (answers_correct > 0 && have_posibily == 1) {
                    Strongbox dialog = new Strongbox(new javax.swing.JFrame(), true);
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
                    answers_correct -= 1;
                    have_posibily = 0;
                    corrects_q.setText(ButtonPane.answers_correct + "");
                } else {
                    JOptionPane.showMessageDialog(null, "No tienes puntos suficientes o ya lo usastes\no no has pasado por el comodin");
                }
            }
        };
        btnwildcard.addActionListener(listener);
        up.add(corrects);
        up.add(corrects_q);
        up.add(incorrects);
        up.add(incorrects_q);
        up.add(btnwildcard);

        JButton btnback = new JButton("Atras");
        ActionListener listener_1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.removeAll(ButtonPane.list);
                Stats();
                f.dispose();
                Main mn = new Main();
                mn.InitWindow();
            }
        };
        btnback.addActionListener(listener_1);
        btnback.setRequestFocusEnabled(false);
        down.add(btnback);
    }

    /*This method restart the stats*/
    public static void Stats() {
        incorrects_q.setText(0 + "");
        corrects_q.setText(0 + "");
        wildcard = 0;
        answers_correct = 0;
        answers_incorrect = 0;
        have_posibily = 1;
    }

    /*This method creates the JFrame*/
    public static void Init() {
        have_posibily = 1;
        answers_correct = 0;
        answers_incorrect = 0;
        f = new JFrame();
        Creating_Questions cq = new Creating_Questions();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new ButtonPane(8, 5), BorderLayout.CENTER);
        if (create == 0) {
            new ButtonPane();
        } else {
            Stats();
        }
        create = 1;
        f.add(up, BorderLayout.NORTH);
        f.add(down, BorderLayout.SOUTH);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        buttons[0][0].requestFocus();
    }
}
