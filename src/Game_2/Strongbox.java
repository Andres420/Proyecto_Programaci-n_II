package Game_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.Random;
import javax.swing.JOptionPane;

public class Strongbox extends javax.swing.JDialog {

    String random_string = "", String_num_player;
    int random, int_of_player,incorrect = 1;

    public Strongbox(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        t = new Timer(1000, actions);
        btncheck.setEnabled(false);
        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            int rand = rnd.nextInt(9) + 1;
            random_string += String.valueOf(rand);
        }
        random = Integer.parseInt(random_string);
        System.out.println(random);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        lbltimer = new javax.swing.JLabel();
        btnstart = new javax.swing.JButton();
        jsppos1 = new javax.swing.JSpinner();
        jsppos2 = new javax.swing.JSpinner();
        jsppos3 = new javax.swing.JSpinner();
        btncheck = new javax.swing.JButton();
        lblanswer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        lbltimer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnstart.setText("Iniciar");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        jsppos1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        jsppos1.setEnabled(false);
        jsppos1.setRequestFocusEnabled(false);

        jsppos2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        jsppos2.setEnabled(false);
        jsppos2.setRequestFocusEnabled(false);

        jsppos3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        jsppos3.setEnabled(false);
        jsppos3.setRequestFocusEnabled(false);

        btncheck.setText("Verificar");
        btncheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckActionPerformed(evt);
            }
        });

        lblanswer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnstart)
                    .addComponent(jsppos1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addComponent(lbltimer))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jsppos2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jsppos3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(btncheck)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblanswer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnstart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsppos2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsppos1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsppos3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btncheck)
                .addGap(27, 27, 27)
                .addComponent(lblanswer)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        t.start();
        btnstart.setEnabled(false);
        btncheck.setEnabled(true);
        jsppos1.setEnabled(true);
        jsppos2.setEnabled(true);
        jsppos3.setEnabled(true);
    }//GEN-LAST:event_btnstartActionPerformed

    private void btncheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckActionPerformed
        String_num_player = jsppos1.getValue().toString();
        String_num_player += jsppos2.getValue().toString();
        String_num_player += jsppos3.getValue().toString();
        int_of_player = Integer.parseInt(String_num_player);
        if (random == int_of_player) {
            JOptionPane.showMessageDialog(null, "Felicidades Ganastes");
            ButtonPane.list.removeAll(ButtonPane.list);
            ButtonPane.CloseWindow();
            dispose();
        } else {
            lblanswer.setText("Incorrecto: "+incorrect);
            incorrect++;
        }
    }//GEN-LAST:event_btncheckActionPerformed
    public void close() {
        t.stop();
        dispose();
        ButtonPane.f.setVisible(true);
    }
    private Timer t;
    private int s;
    private ActionListener actions = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++s;
            if (s == 60) {
                s = 0;
                ++s;
                close();
            }

            update();
        }

    };

    private void update() {
        String tiempo = "0:" + s;
        lbltimer.setText(tiempo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btncheck;
    private javax.swing.JButton btnstart;
    private javax.swing.JSpinner jsppos1;
    private javax.swing.JSpinner jsppos2;
    private javax.swing.JSpinner jsppos3;
    private javax.swing.JLabel lblanswer;
    public static javax.swing.JLabel lbltimer;
    // End of variables declaration//GEN-END:variables

}
