package views;

import javax.swing.JPanel;

import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Andrés Ramírez
 */
public class InterfaceLauncher extends javax.swing.JFrame {

    private String dateTime;
    private String destino;
    private String mensaje; 
    private JPanel currentPanel;

    public InterfaceLauncher() {
        dateTime = "";
        destino = "";
        mensaje = "";
        initComponents();
        currentPanel = pnlInfo;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void changePanel(JPanel panelReplaced) {
        currentPanel.setVisible(false);
        currentPanel = panelReplaced;
        currentPanel.setVisible(true);
        
        javax.swing.GroupLayout pnlBackgroungLayout = new javax.swing.GroupLayout(pnlBackgroung);
        pnlBackgroung.setLayout(pnlBackgroungLayout);
        pnlBackgroungLayout.setHorizontalGroup(
                pnlBackgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBackgroungLayout.createSequentialGroup()
                                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelReplaced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackgroungLayout.setVerticalGroup(
                pnlBackgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlBackgroungLayout.createSequentialGroup()
                                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBackgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelReplaced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlBackgroung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlBackgroung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSimu1 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        pnlSimu2 = new javax.swing.JPanel();
        lblMailSimu2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        pnlSimu3 = new javax.swing.JPanel();
        lblMailSimu3 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        pnlSimu4 = new javax.swing.JPanel();
        lblMailSimu4 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        pnlSimu5 = new javax.swing.JPanel();
        lblMailSimu5 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        pnlSimu6 = new javax.swing.JPanel();
        lblMailSimu6 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        pnlSimu7 = new javax.swing.JPanel();
        lblMailSimu7 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        pnlSimu8 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        pnlBackgroung = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pnlInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnInformation = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnTheory = new javax.swing.JButton();
        btnSimulation = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        pnlSimu1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel44.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("CREACIÓN DE CORREO ELECTRÓNICO");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(232, 245, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/User yo.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setText("Asunto:");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setText("Mensaje:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("x");

        jLabel45.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("TX-MAIL");

        jLabel46.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel46.setText("Para:");

        jLabel47.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel47.setText("@tx-mail.com");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel47)
                                .addGap(91, 91, 91))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126)
                        .addComponent(jLabel22)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/pc.png"))); // NOI18N

        jLabel49.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("<html><center>Lo primero que se debe hacer será redactar un correo electrónico, colocando un destinatario, asunto y mensaje, en los campos correspondientes.</center></html>");

        javax.swing.GroupLayout pnlSimu1Layout = new javax.swing.GroupLayout(pnlSimu1);
        pnlSimu1.setLayout(pnlSimu1Layout);
        pnlSimu1Layout.setHorizontalGroup(
            pnlSimu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSimu1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSimu1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlSimu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSimu1Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(55, 55, 55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        pnlSimu1Layout.setVerticalGroup(
            pnlSimu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(pnlSimu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSimu1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel48)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pnlSimu2.setBackground(new java.awt.Color(204, 204, 255));
        pnlSimu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSimu2MouseEntered(evt);
            }
        });

        lblMailSimu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/mail.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/laptop.png"))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("PRIMER PASO DEL PROCESO");

        jLabel51.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("MUA");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Server.png"))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("MSA");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel53.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("<html><center>El correo electrónico es enviado por un MUA al MSA de un servidor de correo</center></html>");

        jButton2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/User yo.png"))); // NOI18N

        javax.swing.GroupLayout pnlSimu2Layout = new javax.swing.GroupLayout(pnlSimu2);
        pnlSimu2.setLayout(pnlSimu2Layout);
        pnlSimu2Layout.setHorizontalGroup(
            pnlSimu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu2Layout.createSequentialGroup()
                .addGroup(pnlSimu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSimu2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel54)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSimu2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel18)
                        .addGap(6, 6, 6)
                        .addGroup(pnlSimu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSimu2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMailSimu2)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19))
                    .addGroup(pnlSimu2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(516, 516, 516)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSimu2Layout.createSequentialGroup()
                        .addGap(654, 654, 654)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSimu2Layout.setVerticalGroup(
            pnlSimu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlSimu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSimu2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel54))
                    .addGroup(pnlSimu2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlSimu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(pnlSimu2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(lblMailSimu2)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel24))
                    .addComponent(jLabel19))
                .addGap(6, 6, 6)
                .addGroup(pnlSimu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSimu3.setBackground(new java.awt.Color(204, 204, 255));
        pnlSimu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSimu3MouseEntered(evt);
            }
        });

        lblMailSimu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/mail.png"))); // NOI18N

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Server.png"))); // NOI18N

        jLabel56.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("SEGUNDO PASO DEL PROCESO");

        jLabel57.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("MSA");

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Server.png"))); // NOI18N

        jLabel59.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("MTA");

        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel62.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("<html><center>El mensaje se transfiere al MTA del servidor (el MTA y el MSA normalmente se alojan en el mismo servidor SMTP).</center></html>");

        jButton3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton3.setText("Siguiente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSimu3Layout = new javax.swing.GroupLayout(pnlSimu3);
        pnlSimu3.setLayout(pnlSimu3Layout);
        pnlSimu3Layout.setHorizontalGroup(
            pnlSimu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu3Layout.createSequentialGroup()
                .addGroup(pnlSimu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSimu3Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSimu3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel55)
                        .addGap(6, 6, 6)
                        .addGroup(pnlSimu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSimu3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMailSimu3)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel58))
                    .addGroup(pnlSimu3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(516, 516, 516)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSimu3Layout.createSequentialGroup()
                        .addGap(654, 654, 654)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSimu3Layout.setVerticalGroup(
            pnlSimu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(pnlSimu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addGroup(pnlSimu3Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(18, 18, 18)
                        .addComponent(lblMailSimu3)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel60))
                    .addComponent(jLabel58))
                .addGap(6, 6, 6)
                .addGroup(pnlSimu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSimu4.setBackground(new java.awt.Color(204, 204, 255));
        pnlSimu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSimu4MouseEntered(evt);
            }
        });

        lblMailSimu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/mail.png"))); // NOI18N

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Server.png"))); // NOI18N

        jLabel64.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("TERCER PASO DEL PROCESO");

        jLabel65.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("MTA");

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/valido.png"))); // NOI18N

        jLabel67.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("MTA");

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel70.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("<html><center>El MTA verifica el registro MX del dominio del destinatario y transfiere el mensaje a otro MTA (este paso puede ocurrir varias veces hasta que el servidor de recepción correcto reciba el mensaje).</center></html>");

        jButton4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton4.setText("Siguiente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSimu4Layout = new javax.swing.GroupLayout(pnlSimu4);
        pnlSimu4.setLayout(pnlSimu4Layout);
        pnlSimu4Layout.setHorizontalGroup(
            pnlSimu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu4Layout.createSequentialGroup()
                .addGroup(pnlSimu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSimu4Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSimu4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel63)
                        .addGap(6, 6, 6)
                        .addGroup(pnlSimu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSimu4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMailSimu4)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel66))
                    .addGroup(pnlSimu4Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(516, 516, 516)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSimu4Layout.createSequentialGroup()
                        .addGap(654, 654, 654)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSimu4Layout.setVerticalGroup(
            pnlSimu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(pnlSimu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addGroup(pnlSimu4Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addGap(18, 18, 18)
                        .addComponent(lblMailSimu4)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel68))
                    .addComponent(jLabel66))
                .addGap(6, 6, 6)
                .addGroup(pnlSimu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSimu5.setBackground(new java.awt.Color(204, 204, 255));
        pnlSimu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSimu5MouseEntered(evt);
            }
        });

        lblMailSimu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/mail.png"))); // NOI18N

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/valido.png"))); // NOI18N

        jLabel72.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("CUARTO PASO DEL PROCESO");

        jLabel73.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("MTA");

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Server.png"))); // NOI18N

        jLabel75.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("MDA");

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel78.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("<html><center>El mensaje se transfiere a la MDA, que guarda los mensajes en el formato adecuado para su recuperación por el MUA.</center></html>");

        jButton5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton5.setText("Siguiente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSimu5Layout = new javax.swing.GroupLayout(pnlSimu5);
        pnlSimu5.setLayout(pnlSimu5Layout);
        pnlSimu5Layout.setHorizontalGroup(
            pnlSimu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu5Layout.createSequentialGroup()
                .addGroup(pnlSimu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSimu5Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSimu5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel71)
                        .addGap(6, 6, 6)
                        .addGroup(pnlSimu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSimu5Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMailSimu5)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel74))
                    .addGroup(pnlSimu5Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(516, 516, 516)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSimu5Layout.createSequentialGroup()
                        .addGap(654, 654, 654)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSimu5Layout.setVerticalGroup(
            pnlSimu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(pnlSimu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71)
                    .addGroup(pnlSimu5Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addGap(18, 18, 18)
                        .addComponent(lblMailSimu5)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel76))
                    .addComponent(jLabel74))
                .addGap(6, 6, 6)
                .addGroup(pnlSimu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSimu6.setBackground(new java.awt.Color(204, 204, 255));
        pnlSimu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSimu6MouseEntered(evt);
            }
        });

        lblMailSimu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/mail.png"))); // NOI18N

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Server.png"))); // NOI18N

        jLabel80.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("QUINTO PASO DEL PROCESO");

        jLabel81.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("MDA");

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/IMAP.png"))); // NOI18N

        jLabel83.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("POP3 / IMAP");

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel86.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("<html><center>El MUA solicita el mensaje del MDA (generalmente con POP3 o IMAP).</center></html>");

        jButton6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton6.setText("Siguiente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSimu6Layout = new javax.swing.GroupLayout(pnlSimu6);
        pnlSimu6.setLayout(pnlSimu6Layout);
        pnlSimu6Layout.setHorizontalGroup(
            pnlSimu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu6Layout.createSequentialGroup()
                .addGroup(pnlSimu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSimu6Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSimu6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel79)
                        .addGap(6, 6, 6)
                        .addGroup(pnlSimu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSimu6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMailSimu6)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel82))
                    .addGroup(pnlSimu6Layout.createSequentialGroup()
                        .addGap(654, 654, 654)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlSimu6Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel83)
                .addGap(72, 72, 72))
        );
        pnlSimu6Layout.setVerticalGroup(
            pnlSimu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(pnlSimu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79)
                    .addGroup(pnlSimu6Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addGap(18, 18, 18)
                        .addComponent(lblMailSimu6)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel84))
                    .addComponent(jLabel82))
                .addGap(6, 6, 6)
                .addGroup(pnlSimu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSimu7.setBackground(new java.awt.Color(204, 204, 255));
        pnlSimu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSimu7MouseEntered(evt);
            }
        });

        lblMailSimu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/mail open.png"))); // NOI18N

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/IMAP.png"))); // NOI18N

        jLabel88.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("SEXTO PASO DEL PROCESO");

        jLabel89.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("POP3 / IMAP");

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/laptop.png"))); // NOI18N

        jLabel91.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("MUA");

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("1 0 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 0 1");

        jLabel94.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("<html><center>El mensaje se envía a la bandeja de entrada del MUA receptor.</center></html>");

        jButton7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton7.setText("REPORTE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/User 2.png"))); // NOI18N

        javax.swing.GroupLayout pnlSimu7Layout = new javax.swing.GroupLayout(pnlSimu7);
        pnlSimu7.setLayout(pnlSimu7Layout);
        pnlSimu7Layout.setHorizontalGroup(
            pnlSimu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu7Layout.createSequentialGroup()
                .addGroup(pnlSimu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSimu7Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel87)
                        .addGap(6, 6, 6)
                        .addGroup(pnlSimu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSimu7Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMailSimu7)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel90))
                    .addGroup(pnlSimu7Layout.createSequentialGroup()
                        .addGap(654, 654, 654)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlSimu7Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addGap(86, 86, 86))
            .addGroup(pnlSimu7Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(71, 71, 71))
        );
        pnlSimu7Layout.setVerticalGroup(
            pnlSimu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlSimu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSimu7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSimu7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnlSimu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87)
                    .addGroup(pnlSimu7Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addGap(18, 18, 18)
                        .addComponent(lblMailSimu7)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel92))
                    .addComponent(jLabel90))
                .addGap(6, 6, 6)
                .addGroup(pnlSimu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSimu8.setBackground(new java.awt.Color(204, 204, 255));
        pnlSimu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSimu8MouseEntered(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("REPORTE DE PROCESO SMTP");

        jButton8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton8.setText("FINALIZAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel21.setText("220");

        jLabel26.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("tx.mail.com");

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel27.setText("Sendmail");

        jLabel28.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel28.setText("SMI-8.6/SVR4");

        jLabel29.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel29.setText("ready at");

        jLabel30.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 204, 0));

        jLabel31.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel31.setText("HELO");

        jLabel32.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 153, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("yo.tx.mail.com");

        jLabel33.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel33.setText("250");

        jLabel34.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("tx.mail.com");

        jLabel35.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel35.setText("Hello");

        jLabel36.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 153, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("yo.tx.mail.com   [158.42.53.1],");

        jLabel37.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel37.setText("pleased to meet you");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));

        jLabel38.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel38.setText("MAIL From:");

        jLabel39.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 153, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("yo@tx-mail.com");

        jLabel40.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel40.setText("250");

        jLabel41.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 153, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("yo@tx-mail.com");

        jLabel42.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText(" ... Sender ok");

        jLabel43.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel43.setText("RCPT To:");

        jLabel95.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel95.setText("250");

        jLabel97.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(0, 153, 0));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel98.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 153, 0));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel99.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText(" ... Recipient ok");

        jLabel100.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel100.setText("DATA");

        jLabel101.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel101.setText("354  Enter mail, end with \".\" on a line by itselfs");

        jLabel102.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel102.setText("<html><center></center><html>");

        jLabel103.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel103.setText(".");

        jLabel104.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel104.setText("251  TAA11108 Message accepted for delivery");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel99)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42)
                        .addGap(458, 458, 458))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(449, 449, 449))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(jLabel101)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103)
                            .addComponent(jLabel104))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        jLabel105.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel105.setText("QUIT");

        jLabel106.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel106.setText("221");

        jLabel107.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(0, 153, 0));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("tx.mail.com");

        jLabel108.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("closing connection");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel108)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel107)
                        .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSimu8Layout = new javax.swing.GroupLayout(pnlSimu8);
        pnlSimu8.setLayout(pnlSimu8Layout);
        pnlSimu8Layout.setHorizontalGroup(
            pnlSimu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu8Layout.createSequentialGroup()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSimu8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSimu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSimu8Layout.createSequentialGroup()
                        .addGroup(pnlSimu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSimu8Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        pnlSimu8Layout.setVerticalGroup(
            pnlSimu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSimu8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SMTP_Simulator_App");
        setResizable(false);

        pnlHeader.setBackground(new java.awt.Color(153, 153, 255));

        jLabel15.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SIMULADOR SMTP");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInfo.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Portada.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PROYECTO FINAL: ");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("José Manuel Salamanca Bermúdez");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DESARROLLADO POR: ");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Julián Esteban Ramírez Morales");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Andrés David Ramírez Albarracín");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("\"Software encargado de simular el");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("funcionamiento del protocolo SMTP\"");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlInfoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)))
                        .addGap(14, 14, 14)))
                .addGap(97, 97, 97))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pnlMenu.setBackground(new java.awt.Color(211, 188, 246));

        btnInformation.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnInformation.setText("INFORMACIÓN");
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Simulación.png"))); // NOI18N

        btnTheory.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnTheory.setText("teoría");
        btnTheory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheoryActionPerformed(evt);
            }
        });

        btnSimulation.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnSimulation.setText("simulación");
        btnSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulationActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Informacion.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Teoria.png"))); // NOI18N

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTheory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSimulation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTheory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBackgroungLayout = new javax.swing.GroupLayout(pnlBackgroung);
        pnlBackgroung.setLayout(pnlBackgroungLayout);
        pnlBackgroungLayout.setHorizontalGroup(
            pnlBackgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBackgroungLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackgroungLayout.setVerticalGroup(
            pnlBackgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroungLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackgroung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackgroung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTheoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheoryActionPerformed
        try {
            File path = new File("Proyecto Final - Transmisión de Datos.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {}
    }//GEN-LAST:event_btnTheoryActionPerformed

    private void btnSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulationActionPerformed
        this.changePanel(pnlSimu1);
    }//GEN-LAST:event_btnSimulationActionPerformed

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformationActionPerformed
        this.changePanel(pnlInfo);
    }//GEN-LAST:event_btnInformationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.changePanel(pnlSimu2);
        destino = "<" + jTextField2.getText() + "@tx-mail.com" + ">";
        mensaje = jTextField1.getText() + "  -  " + jTextArea1.getText();
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss 'GMT'");
        String fechaHoraFormateada = fechaHoraActual.format(formato);
        dateTime = fechaHoraFormateada;
        jTextField1.setText("");
        jTextField2.setText("");
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.changePanel(pnlSimu3);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pnlSimu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSimu2MouseEntered
        AnimationClass mail = new AnimationClass();
        mail.jLabelXRight(181, 550, 10, 2, lblMailSimu2);
    }//GEN-LAST:event_pnlSimu2MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         this.changePanel(pnlSimu4);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pnlSimu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSimu3MouseEntered
        AnimationClass mail = new AnimationClass();
        mail.jLabelXRight(181, 550, 10, 2, lblMailSimu3);
    }//GEN-LAST:event_pnlSimu3MouseEntered

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.changePanel(pnlSimu5);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void pnlSimu4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSimu4MouseEntered
        AnimationClass mail = new AnimationClass();
        mail.jLabelXRight(181, 550, 10, 2, lblMailSimu4);
    }//GEN-LAST:event_pnlSimu4MouseEntered

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.changePanel(pnlSimu6);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void pnlSimu5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSimu5MouseEntered
        AnimationClass mail = new AnimationClass();
        mail.jLabelXRight(181, 550, 10, 2, lblMailSimu5);
    }//GEN-LAST:event_pnlSimu5MouseEntered

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.changePanel(pnlSimu7);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void pnlSimu6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSimu6MouseEntered
        AnimationClass mail = new AnimationClass();
        mail.jLabelXRight(181, 550, 10, 2, lblMailSimu6);
    }//GEN-LAST:event_pnlSimu6MouseEntered

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jLabel98.setText(destino);
        jLabel30.setText(dateTime);
        jLabel97.setText(destino);
        jLabel102.setText(mensaje);
        this.changePanel(pnlSimu8);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void pnlSimu7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSimu7MouseEntered
        AnimationClass mail = new AnimationClass();
        mail.jLabelXRight(181, 550, 10, 2, lblMailSimu7);
    }//GEN-LAST:event_pnlSimu7MouseEntered

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.changePanel(pnlInfo);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void pnlSimu8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSimu8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlSimu8MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformation;
    private javax.swing.JButton btnSimulation;
    private javax.swing.JButton btnTheory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblMailSimu2;
    private javax.swing.JLabel lblMailSimu3;
    private javax.swing.JLabel lblMailSimu4;
    private javax.swing.JLabel lblMailSimu5;
    private javax.swing.JLabel lblMailSimu6;
    private javax.swing.JLabel lblMailSimu7;
    private javax.swing.JPanel pnlBackgroung;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlSimu1;
    private javax.swing.JPanel pnlSimu2;
    private javax.swing.JPanel pnlSimu3;
    private javax.swing.JPanel pnlSimu4;
    private javax.swing.JPanel pnlSimu5;
    private javax.swing.JPanel pnlSimu6;
    private javax.swing.JPanel pnlSimu7;
    private javax.swing.JPanel pnlSimu8;
    // End of variables declaration//GEN-END:variables
}
