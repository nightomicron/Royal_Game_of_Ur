
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NightOmicron
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    
    public int current = 1;
    public int dob = 0;
    public int[] babu = new int[] {0,0,0,0,0,0,0,0,0,0};
    public int[] finish = new int[] {0,0,0,0,0,0,0,0,0,0};
    
    
    public Game() {
        initComponents();
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
    }
    
    private void rajzol(){
        Graphics2D g=(Graphics2D)jPanel1.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.BLACK);
        
        //BAL TOP
        g.drawRect(175, 200, 50, 50);
        for(int i=0;i<5;i++){
            if(babu[i]==1){
                g.setColor(Color.RED);
                g.fillOval(175, 200, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(175, 150, 50, 50);
        for(int i=0;i<5;i++){
            if(babu[i]==2){
                g.setColor(Color.RED);
                g.fillOval(175, 150, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(175, 100, 50, 50);
        for(int i=0;i<5;i++){
            if(babu[i]==3){
                g.setColor(Color.RED);
                g.fillOval(175, 100, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(175, 50, 50, 50);
        g.drawOval(175, 50, 50, 50);
        for(int i=0;i<5;i++){
            if(babu[i]==4){
                g.setColor(Color.RED);
                g.fillOval(175, 50, 50, 50);
                g.setColor(Color.BLACK);
            } 
        }
        
        //JOBB TOP
        g.drawRect(275, 200, 50, 50);
        for(int i=5;i<10;i++){
            if(babu[i]==1){
                g.setColor(Color.BLUE);
                g.fillOval(275, 200, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(275, 150, 50, 50);
        for(int i=5;i<10;i++){
            if(babu[i]==2){
                g.setColor(Color.BLUE);
                g.fillOval(275, 150, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(275, 100, 50, 50);
        for(int i=5;i<10;i++){
            if(babu[i]==3){
                g.setColor(Color.BLUE);
                g.fillOval(275, 100, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(275, 50, 50, 50);
        g.drawOval(275, 50, 50, 50);
        for(int i=5;i<10;i++){
            if(babu[i]==4){
                g.setColor(Color.BLUE);
                g.fillOval(275, 50, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        
        //KOZEP
        g.drawRect(225, 50, 50, 50);
        for(int i=0;i<10;i++){
            if(babu[i]==5 && i<5){
                g.setColor(Color.RED);
                g.fillOval(225, 50, 50, 50);
                g.setColor(Color.BLACK);
            }
            if(babu[i]==5 && i>=5){
                g.setColor(Color.BLUE);
                g.fillOval(225, 50, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(225, 100, 50, 50);
        for(int i=0;i<10;i++){
            if(babu[i]==6 && i<5){
                g.setColor(Color.RED);
                g.fillOval(225, 100, 50, 50);
                g.setColor(Color.BLACK);
            }
            if(babu[i]==6 && i>=5){
                g.setColor(Color.BLUE);
                g.fillOval(225, 100, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(225, 150, 50, 50);
        for(int i=0;i<10;i++){
            if(babu[i]==7 && i<5){
                g.setColor(Color.RED);
                g.fillOval(225, 150, 50, 50);
                g.setColor(Color.BLACK);
            }
            if(babu[i]==7 && i>=5){
                g.setColor(Color.BLUE);
                g.fillOval(225, 150, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(225, 200, 50, 50);
        g.drawOval(225, 200, 50, 50);
        for(int i=0;i<10;i++){
            if(babu[i]==8 && i<5){
                g.setColor(Color.RED);
                g.fillOval(225, 200, 50, 50);
                g.setColor(Color.BLACK);
            }
            if(babu[i]==8 && i>=5){
                g.setColor(Color.BLUE);
                g.fillOval(225, 200, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(225, 250, 50, 50);
        for(int i=0;i<10;i++){
            if(babu[i]==9 && i<5){
                g.setColor(Color.RED);
                g.fillOval(225, 250, 50, 50);
                g.setColor(Color.BLACK);
            }
            if(babu[i]==9 && i>=5){
                g.setColor(Color.BLUE);
                g.fillOval(225, 250, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(225, 300, 50, 50);
        for(int i=0;i<10;i++){
            if(babu[i]==10 && i<5){
                g.setColor(Color.RED);
                g.fillOval(225, 300, 50, 50);
                g.setColor(Color.BLACK);
            }
            if(babu[i]==10 && i>=5){
                g.setColor(Color.BLUE);
                g.fillOval(225, 300, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(225, 350, 50, 50);
        for(int i=0;i<10;i++){
            if(babu[i]==11 && i<5){
                g.setColor(Color.RED);
                g.fillOval(225, 350, 50, 50);
                g.setColor(Color.BLACK);
            }
            if(babu[i]==11 && i>=5){
                g.setColor(Color.BLUE);
                g.fillOval(225, 350, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(225, 400, 50, 50);
        for(int i=0;i<10;i++){
            if(babu[i]==12 && i<5){
                g.setColor(Color.RED);
                g.fillOval(225, 400, 50, 50);
                g.setColor(Color.BLACK);
            }
            if(babu[i]==12 && i>=5){
                g.setColor(Color.BLUE);
                g.fillOval(225, 400, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        //BAL BOTTOM
        g.drawRect(175, 400, 50, 50);
        for(int i=0;i<5;i++){
            if(babu[i]==13){
                g.setColor(Color.RED);
                g.fillOval(175, 400, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(175, 350, 50, 50);
        g.drawOval(175, 350, 50, 50);
        for(int i=0;i<5;i++){
            if(babu[i]==14){
                g.setColor(Color.RED);
                g.fillOval(175, 350, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        //JOBB BOTTOM
        g.drawRect(275, 400, 50, 50);
        for(int i=5;i<10;i++){
            if(babu[i]==13){
                g.setColor(Color.BLUE);
                g.fillOval(275, 400, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        g.drawRect(275, 350, 50, 50);
        g.drawOval(275, 350, 50, 50);
        for(int i=5;i<10;i++){
            if(babu[i]==14){
                g.setColor(Color.BLUE);
                g.fillOval(275, 350, 50, 50);
                g.setColor(Color.BLACK);
            }
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jButton1.setText("Dobj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("A Jatekos");

        jLabel3.setText("B Jatekos");

        jButton2.setText("A1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("A2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("A3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("A4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("A5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("B1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("B2");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("B3");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("B4");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("B5");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        a1.setText("0");

        a2.setText("0");

        a3.setText("0");

        a4.setText("0");

        a5.setText("0");

        b1.setText("0");

        b2.setText("0");

        b3.setText("0");

        b4.setText("0");

        b5.setText("0");

        jMenu3.setText("Menu");

        jMenuItem1.setText("Uj Jatek");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Kilep");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 133, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(a2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(154, 154, 154)
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton4))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(a4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(a5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton11))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a1)
                            .addComponent(a2)
                            .addComponent(a3)
                            .addComponent(a4)
                            .addComponent(a5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11)
                            .addComponent(jButton10)
                            .addComponent(jButton9)
                            .addComponent(jButton8)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(b2)
                            .addComponent(b3)
                            .addComponent(b4)
                            .addComponent(b5))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //uj jatek
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        babu = new int[] {0,0,0,0,0,0,0,0,0,0};
        finish = new int[] {0,0,0,0,0,0,0,0,0,0};
        current = 1;
        a1.setText(Integer.toString(0));
        a2.setText(Integer.toString(0));
        a3.setText(Integer.toString(0));
        a4.setText(Integer.toString(0));
        a5.setText(Integer.toString(0));
        b1.setText(Integer.toString(0));
        b2.setText(Integer.toString(0));
        b3.setText(Integer.toString(0));
        b4.setText(Integer.toString(0));
        b5.setText(Integer.toString(0));
        rajzol();
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        dob = (int)(Math.random()*((5-1)+1))+1;
        jLabel1.setText(Integer.toString(dob));
        jButton1.setEnabled(false);
        
        a1.setText(Integer.toString(babu[0]));
        a2.setText(Integer.toString(babu[1]));
        a3.setText(Integer.toString(babu[2]));
        a4.setText(Integer.toString(babu[3]));
        a5.setText(Integer.toString(babu[4]));
        b1.setText(Integer.toString(babu[5]));
        b2.setText(Integer.toString(babu[6]));
        b3.setText(Integer.toString(babu[7]));
        b4.setText(Integer.toString(babu[8]));
        b5.setText(Integer.toString(babu[9]));
        
        if(current == 1){
            if(finish[0]==0){
                jButton2.setEnabled(true);
            }
            if(finish[1]==0){
                jButton3.setEnabled(true);
            }
            if(finish[2]==0){
                jButton4.setEnabled(true);
            }
            if(finish[3]==0){
                jButton5.setEnabled(true);
            }
            if(finish[4]==0){
                jButton6.setEnabled(true);
            }
            jButton7.setEnabled(false);
            jButton8.setEnabled(false);
            jButton9.setEnabled(false);
            jButton10.setEnabled(false);
            jButton11.setEnabled(false);
            current = 2;
        }else{
            if(finish[5]==0){
                jButton7.setEnabled(true);
            }
            if(finish[6]==0){
                jButton8.setEnabled(true);
            }
            if(finish[7]==0){
                jButton9.setEnabled(true);
            }
            if(finish[8]==0){
                jButton10.setEnabled(true);
            }
            if(finish[9]==0){
                jButton11.setEnabled(true);
            }
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            current = 1;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        
        babu[0]+=dob;
        int mentes = babu[0];
        if(babu[0] > 0 && babu[0] < 5){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[0] >= 5 && babu[0] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[0] > 12 && babu[0] <= 14){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[0]=mentes;
        
        if(babu[0] > 15){
            babu[0]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[0] == 4 || babu[0] == 8 || babu[0] == 14){
            current = 1;
        }
        if(babu[0] == 15){
            finish[0]=1;
            current = 1;
        }
        a1.setText(Integer.toString(babu[0]));
        rajzol();
        if(finish[0]==1){
            if(finish[1]==1){
                if(finish[2]==1){
                    if(finish[3]==1){
                        if(finish[4]==1){
                            JOptionPane.showMessageDialog(null,"1. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        
        babu[1]+=dob;
        int mentes = babu[1];
        if(babu[1] > 0 && babu[1] < 5){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[1] >= 5 && babu[1] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[1] > 12 && babu[1] <= 14){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[1]=mentes;
        
        if(babu[1] > 15){
            babu[1]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[1] == 4 || babu[1] == 8 || babu[1] == 14){
            current = 1;
        }
        if(babu[1] == 15){
            finish[1]=1;
            current = 1;
        }
        a2.setText(Integer.toString(babu[1]));
        rajzol();
        if(finish[0]==1){
            if(finish[1]==1){
                if(finish[2]==1){
                    if(finish[3]==1){
                        if(finish[4]==1){
                            JOptionPane.showMessageDialog(null,"1. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        
        babu[2]+=dob;
        int mentes = babu[2];
        if(babu[2] > 0 && babu[2] < 5){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[2] >= 5 && babu[2] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[2] > 12 && babu[2] <= 14){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[2]=mentes;
        
        if(babu[2] > 15){
            babu[2]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[2] == 4 || babu[2] == 8 || babu[2] == 14){
            current = 1;
        }
        if(babu[2] == 15){
            finish[2]=1;
            current = 1;
        }
        a3.setText(Integer.toString(babu[2]));
        rajzol();
        if(finish[0]==1){
            if(finish[1]==1){
                if(finish[2]==1){
                    if(finish[3]==1){
                        if(finish[4]==1){
                            JOptionPane.showMessageDialog(null,"1. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        
        babu[3]+=dob;
        int mentes = babu[3];
        if(babu[3] > 0 && babu[3] < 5){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[3] >= 5 && babu[3] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[3] > 12 && babu[3] <= 14){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[3]=mentes;
        
        if(babu[3] > 15){
            babu[3]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[3] == 4 || babu[3] == 8 || babu[3] == 14){
            current = 1;
        }
        if(babu[3] == 15){
            finish[3]=1;
            current = 1;
        }
        a4.setText(Integer.toString(babu[3]));
        rajzol();
        if(finish[0]==1){
            if(finish[1]==1){
                if(finish[2]==1){
                    if(finish[3]==1){
                        if(finish[4]==1){
                            JOptionPane.showMessageDialog(null,"1. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        
        babu[4]+=dob;
        int mentes = babu[4];
        if(babu[4] > 0 && babu[4] < 5){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[4] >= 5 && babu[4] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[4] > 12 && babu[4] <= 14){
            for(int i=0;i<5;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[4]=mentes;
        
        if(babu[4] > 15){
            babu[4]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[4] == 4 || babu[4] == 8 || babu[4] == 14){
            current = 1;
        }
        if(babu[4] == 15){
            finish[4]=1;
            current = 1;
        }
        a5.setText(Integer.toString(babu[4]));
        rajzol();
        if(finish[0]==1){
            if(finish[1]==1){
                if(finish[2]==1){
                    if(finish[3]==1){
                        if(finish[4]==1){
                            JOptionPane.showMessageDialog(null,"1. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton1.setEnabled(true);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        
        babu[5]+=dob;
        int mentes = babu[5];
        if(babu[5] > 0 && babu[5] < 5){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[5] >= 5 && babu[5] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[5] > 12 && babu[5] <= 14){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[5]=mentes;
        
        if(babu[5] > 15){
            babu[5]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[5] == 4 || babu[5] == 8 || babu[5] == 14){
            current = 2;
        }
        if(babu[5] == 15){
            finish[5]=1;
            current = 2;
        }
        b1.setText(Integer.toString(babu[5]));
        rajzol();
        if(finish[5]==1){
            if(finish[6]==1){
                if(finish[7]==1){
                    if(finish[8]==1){
                        if(finish[9]==1){
                            JOptionPane.showMessageDialog(null,"2. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton1.setEnabled(true);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        
        babu[6]+=dob;
        int mentes = babu[6];
        if(babu[6] > 0 && babu[6] < 5){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[6] >= 5 && babu[6] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[6] > 12 && babu[6] <= 14){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[6]=mentes;
        
        if(babu[6] > 15){
            babu[6]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[6] == 4 || babu[6] == 8 || babu[6] == 14){
            current = 2;
        }
        if(babu[6] == 15){
            finish[6]=1;
            current = 2;
        }
        b2.setText(Integer.toString(babu[6]));
        rajzol();
        if(finish[5]==1){
            if(finish[6]==1){
                if(finish[7]==1){
                    if(finish[8]==1){
                        if(finish[9]==1){
                            JOptionPane.showMessageDialog(null,"2. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton1.setEnabled(true);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        
        babu[7]+=dob;
        int mentes = babu[7];
        if(babu[7] > 0 && babu[7] < 5){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[7] >= 5 && babu[7] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[7] > 12 && babu[7] <= 14){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[7]=mentes;
        
        if(babu[7] > 15){
            babu[7]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[7] == 4 || babu[7] == 8 || babu[7] == 14){
            current = 2;
        }
        if(babu[7] == 15){
            finish[7]=1;
            current = 2;
        }
        b3.setText(Integer.toString(babu[7]));
        rajzol();
        if(finish[5]==1){
            if(finish[6]==1){
                if(finish[7]==1){
                    if(finish[8]==1){
                        if(finish[9]==1){
                            JOptionPane.showMessageDialog(null,"2. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton1.setEnabled(true);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        
        babu[8]+=dob;
        int mentes = babu[8];
        if(babu[8] > 0 && babu[8] < 5){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[8] >= 5 && babu[8] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[8] > 12 && babu[8] <= 14){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[8]=mentes;
        
        if(babu[8] > 15){
            babu[8]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[8] == 4 || babu[8] == 8 || babu[8] == 14){
            current = 2;
        }
        if(babu[8] == 15){
            finish[8]=1;
            current = 2;
        }
        b4.setText(Integer.toString(babu[8]));
        rajzol();
        if(finish[5]==1){
            if(finish[6]==1){
                if(finish[7]==1){
                    if(finish[8]==1){
                        if(finish[9]==1){
                            JOptionPane.showMessageDialog(null,"2. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton1.setEnabled(true);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        
        babu[9]+=dob;
        int mentes = babu[9];
        if(babu[9] > 0 && babu[9] < 5){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[9] >= 5 && babu[9] <= 12){
            for(int i=0;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        if(babu[9] > 12 && babu[9] <= 14){
            for(int i=5;i<10;i++){
                if(babu[i]==mentes){
                    babu[i]=0;
                }
            }
        }
        babu[9]=mentes;
        
        if(babu[9] > 15){
            babu[9]-=dob;
            JOptionPane.showMessageDialog(null,"Oda nem lephetsz, tul lepned a cel vonalat");
        }else if(babu[9] == 4 || babu[9] == 8 || babu[9] == 14){
            current = 2;
        }
        if(babu[9] == 15){
            finish[9]=1;
            current = 2;
        }
        b5.setText(Integer.toString(babu[9]));
        rajzol();
        if(finish[5]==1){
            if(finish[6]==1){
                if(finish[7]==1){
                    if(finish[8]==1){
                        if(finish[9]==1){
                            JOptionPane.showMessageDialog(null,"2. Jatekos nyert!");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
