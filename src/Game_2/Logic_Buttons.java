package Game_2;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Logic_Buttons {

    public static ImageIcon image, icon, image_como, icon_como, image_finish, icon_finish;
    static int num_y = 0, num_x = 0;

    /*This method ask and receive the answer of the player and check if is correct or incorrect
    If the answer is incorrect add in the frame other wall*/
    public static void Questions(int a, int b) {
        boolean ans = false;
        if (ButtonPane.buttons[a][b].getText().equals(".")) {
            int answer = JOptionPane.showOptionDialog(null, ButtonPane.list.get(0), "Pregunta", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Verdadero", "Falso"}, "");
            if (answer == 1) {
                ans = false;
            } else if (answer == 0) {
                ans = true;
            }
            if (Boolean.valueOf((boolean) ButtonPane.list.get(1)) == ans) {
                JOptionPane.showMessageDialog(null, "CORRECTO");
                ButtonPane.answers_correct += 1;
                ButtonPane.corrects_q.setText(ButtonPane.answers_correct + "");
                ButtonPane.list.remove(0);
                ButtonPane.list.remove(0);
            } else {
                int infinite = 0;
                JOptionPane.showMessageDialog(null, "INCORRECTO");
                Logic_Buttons lb = new Logic_Buttons();
                lb.New_Image();
                Random rnd = new Random();
                while (true) {
                    num_y = rnd.nextInt(8);
                    num_x = rnd.nextInt(5);
                    if ((ButtonPane.buttons[num_y][num_x].getText().equals(".")) && (num_y != a) && (num_x != b) && (ButtonPane.buttons[num_y][num_x].isRequestFocusEnabled() == true)) {
                        ButtonPane.buttons[num_y][num_x].setIcon(icon);
                        ButtonPane.buttons[num_y][num_x].setText("p");
                        break;
                    } else if (infinite == 40) {
                        break;
                    } else {
                        infinite += 1;
                    }
                }
                ButtonPane.answers_incorrect += 1;
                ButtonPane.incorrects_q.setText(ButtonPane.answers_incorrect + "");
                ButtonPane.list.remove(0);
                ButtonPane.list.remove(0);
            }
        } else if (ButtonPane.buttons[a][b].getText().equals("p")) {
            JOptionPane.showMessageDialog(null, "Tocaste una pared perdistes");
            ButtonPane.list.removeAll(ButtonPane.list);
            ButtonPane.CloseWindow();
        } else if (ButtonPane.buttons[a][b].getText().equals("w")) {
            ButtonPane.wildcard += 1;
        } else if (ButtonPane.buttons[a][b].getText().equals("f")) {
            int difference = ButtonPane.answers_correct + ButtonPane.answers_incorrect;
            if (difference <= -3 || difference >= 3) {
                JOptionPane.showMessageDialog(null, "Felicidades Ganastes");
                ButtonPane.list.removeAll(ButtonPane.list);
                ButtonPane.CloseWindow();
            } else {
                JOptionPane.showMessageDialog(null, "Perdistes no tienes la diferencia de 3 puntos\nde preguntas correctas e incorrectas");
                ButtonPane.list.removeAll(ButtonPane.list);
                ButtonPane.CloseWindow();
            }
        }
    }

    /*This method call the images for the method Questions*/
    private void New_Image() {
        image = new ImageIcon(getClass().getResource("/Image/pared.jpg"));
        icon = new ImageIcon(image.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
    }

    /* This method adds the actionlistener for all buttons to remove the image from the wall */
    public static void Action_Listener(int a, int b) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (ButtonPane.buttons[a][b].getText().equals("p") && ButtonPane.answers_correct > 0) {
                        ButtonPane.buttons[a][b].setIcon(null);
                        ButtonPane.buttons[a][b].setText(".");
                        ButtonPane.answers_correct -= 1;
                        ButtonPane.corrects_q.setText(ButtonPane.answers_correct + "");
                        ButtonPane.buttons[ButtonPane.pos_y][ButtonPane.pos_x].requestFocus();
                    } else {
                        ButtonPane.buttons[ButtonPane.pos_y][ButtonPane.pos_x].requestFocus();
                    }
                } catch (Exception ex) {
                }
            }
        };
        ButtonPane.buttons[a][b].addActionListener(listener);
    }
}
