package com.GUI;

import com.ElizaMensajes.ElizaRespuestas;
import com.ElizaMensajes.UsuarioEntradas;

import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author ronny12301
 */
public class ChatGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChatGUI
     */
    int xMouse;
    int yMouse;
    
    String respuesta;
    String nombreUsuario;
    
    Color colorBtnEnviar = new Color(140,155,255);
    
    public ChatGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/com/Imagenes/logo.png")).getImage());
        
        //Prevenir el scroll horizontal en el chat
        areaChat.setLineWrap(true);
        areaChat.setWrapStyleWord(true);
        
    }
    
    
    public void enviarMensaje() {
        if (txtMensaje.getText().equals("")) {
            return;
        }
        
        if (nombreUsuario == null) {
            nombreUsuario = txtMensaje.getText();
            
            respuesta = areaChat.getText() + "\n" + nombreUsuario +": " + nombreUsuario +
                    "\nEliza: ES UN PLACER CONOCERTE, " + nombreUsuario;
            
            areaChat.setText(respuesta);
            
            txtMensaje.setText("");
            return;
        }

        respuesta += "\n"+ nombreUsuario + ": " + txtMensaje.getText() + 
                "\nEliza: " + ElizaRespuestas.respuesta(txtMensaje.getText());
        
        areaChat.setText(respuesta);
        
        if (UsuarioEntradas.verificarArreglo(txtMensaje.getText(), UsuarioEntradas.getSalir())) {
            
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {}
            
            System.exit(0);
        }
        
        txtMensaje.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        panelVentana = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        lblBtnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JPanel();
        lblBtnMInimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bordeDerecho = new javax.swing.JPanel();
        bordeIzquierdo = new javax.swing.JPanel();
        panelSuperiorAzul = new javax.swing.JPanel();
        lblELiza = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelLateral = new javax.swing.JPanel();
        ELizaFoto = new javax.swing.JLabel();
        lblChatBot = new javax.swing.JLabel();
        btnEnviar = new com.GUI.PanelRedondo();
        lblBtnEnviar = new javax.swing.JLabel();
        bordeInferior = new javax.swing.JPanel();
        panelChat = new javax.swing.JPanel();
        panelRedondo1 = new com.GUI.PanelRedondo();
        txtMensaje = new javax.swing.JTextField();
        fondoChat = new com.GUI.PanelRedondo();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaChat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliza Chatbot - Ronny");
        setMaximumSize(new java.awt.Dimension(870, 460));
        setMinimumSize(new java.awt.Dimension(870, 460));
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(84, 84, 84));
        fondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fondo.setMaximumSize(new java.awt.Dimension(870, 460));
        fondo.setMinimumSize(new java.awt.Dimension(870, 460));
        fondo.setPreferredSize(new java.awt.Dimension(870, 460));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVentana.setBackground(new java.awt.Color(42, 42, 42));
        panelVentana.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelVentanaMouseDragged(evt);
            }
        });
        panelVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelVentanaMousePressed(evt);
            }
        });
        panelVentana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(50, 50, 50));
        btnCerrar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60))));
        btnCerrar.setPreferredSize(new java.awt.Dimension(20, 20));
        btnCerrar.setLayout(new java.awt.BorderLayout());

        lblBtnCerrar.setFont(new java.awt.Font("Open Sans Semibold", 0, 13)); // NOI18N
        lblBtnCerrar.setForeground(new java.awt.Color(204, 204, 204));
        lblBtnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnCerrar.setText("X");
        lblBtnCerrar.setMaximumSize(new java.awt.Dimension(10, 10));
        lblBtnCerrar.setMinimumSize(new java.awt.Dimension(10, 10));
        lblBtnCerrar.setPreferredSize(new java.awt.Dimension(7, 7));
        lblBtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMousePressed(evt);
            }
        });
        btnCerrar.add(lblBtnCerrar, java.awt.BorderLayout.CENTER);

        panelVentana.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 2, -1, -1));

        btnMinimizar.setBackground(new java.awt.Color(50, 50, 50));
        btnMinimizar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60))));
        btnMinimizar.setPreferredSize(new java.awt.Dimension(20, 20));
        btnMinimizar.setLayout(new java.awt.BorderLayout());

        lblBtnMInimizar.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblBtnMInimizar.setForeground(new java.awt.Color(204, 204, 204));
        lblBtnMInimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnMInimizar.setText("_");
        lblBtnMInimizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblBtnMInimizar.setMaximumSize(new java.awt.Dimension(10, 10));
        lblBtnMInimizar.setMinimumSize(new java.awt.Dimension(10, 10));
        lblBtnMInimizar.setPreferredSize(new java.awt.Dimension(7, 7));
        lblBtnMInimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnMInimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnMInimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnMInimizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBtnMInimizarMousePressed(evt);
            }
        });
        btnMinimizar.add(lblBtnMInimizar, java.awt.BorderLayout.CENTER);

        panelVentana.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 2, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eliza Chatbot");
        panelVentana.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 25));

        fondo.add(panelVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 25));

        bordeDerecho.setBackground(java.awt.Color.darkGray);
        bordeDerecho.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)), new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 1, true)));

        javax.swing.GroupLayout bordeDerechoLayout = new javax.swing.GroupLayout(bordeDerecho);
        bordeDerecho.setLayout(bordeDerechoLayout);
        bordeDerechoLayout.setHorizontalGroup(
            bordeDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bordeDerechoLayout.setVerticalGroup(
            bordeDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        fondo.add(bordeDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 0, 3, 460));

        bordeIzquierdo.setBackground(java.awt.Color.darkGray);
        bordeIzquierdo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout bordeIzquierdoLayout = new javax.swing.GroupLayout(bordeIzquierdo);
        bordeIzquierdo.setLayout(bordeIzquierdoLayout);
        bordeIzquierdoLayout.setHorizontalGroup(
            bordeIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bordeIzquierdoLayout.setVerticalGroup(
            bordeIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        fondo.add(bordeIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2, 460));

        panelSuperiorAzul.setBackground(new java.awt.Color(140, 155, 255));

        lblELiza.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lblELiza.setForeground(new java.awt.Color(255, 255, 255));
        lblELiza.setText("Eliza");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagenes/Logo panel superior azul.png"))); // NOI18N

        javax.swing.GroupLayout panelSuperiorAzulLayout = new javax.swing.GroupLayout(panelSuperiorAzul);
        panelSuperiorAzul.setLayout(panelSuperiorAzulLayout);
        panelSuperiorAzulLayout.setHorizontalGroup(
            panelSuperiorAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorAzulLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblELiza)
                .addContainerGap(466, Short.MAX_VALUE))
        );
        panelSuperiorAzulLayout.setVerticalGroup(
            panelSuperiorAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblELiza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        fondo.add(panelSuperiorAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 650, 65));

        panelLateral.setBackground(new java.awt.Color(51, 51, 51));
        panelLateral.setLayout(null);

        ELizaFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ELizaFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagenes/Logo panel lateral.png"))); // NOI18N
        panelLateral.add(ELizaFoto);
        ELizaFoto.setBounds(0, 17, 220, 258);

        lblChatBot.setFont(new java.awt.Font("Open Sans Condensed", 0, 48)); // NOI18N
        lblChatBot.setForeground(new java.awt.Color(255, 255, 255));
        lblChatBot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChatBot.setText("CHAT BOT");
        lblChatBot.setToolTipText("");
        panelLateral.add(lblChatBot);
        lblChatBot.setBounds(0, 281, 220, 57);

        btnEnviar.setBackground(new java.awt.Color(140, 155, 255));
        btnEnviar.setBordeInferiorDer(55);
        btnEnviar.setBordeInferiorIzq(55);
        btnEnviar.setBordeSuperiorDer(55);
        btnEnviar.setBordeSuperiorIzq(55);
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEnviarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEnviarMouseReleased(evt);
            }
        });

        lblBtnEnviar.setFont(new java.awt.Font("Ubuntu Mono", 1, 21)); // NOI18N
        lblBtnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnEnviar.setText("Enviar Mensaje");

        javax.swing.GroupLayout btnEnviarLayout = new javax.swing.GroupLayout(btnEnviar);
        btnEnviar.setLayout(btnEnviarLayout);
        btnEnviarLayout.setHorizontalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnviarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblBtnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEnviarLayout.setVerticalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelLateral.add(btnEnviar);
        btnEnviar.setBounds(20, 380, 180, 50);

        fondo.add(panelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 220, 440));

        bordeInferior.setBackground(java.awt.Color.darkGray);
        bordeInferior.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout bordeInferiorLayout = new javax.swing.GroupLayout(bordeInferior);
        bordeInferior.setLayout(bordeInferiorLayout);
        bordeInferiorLayout.setHorizontalGroup(
            bordeInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bordeInferiorLayout.setVerticalGroup(
            bordeInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        fondo.add(bordeInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 458, 780, 2));

        panelChat.setBackground(new java.awt.Color(140, 155, 255));

        panelRedondo1.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondo1.setBordeInferiorDer(45);
        panelRedondo1.setBordeInferiorIzq(45);
        panelRedondo1.setBordeSuperiorDer(45);
        panelRedondo1.setBordeSuperiorIzq(45);

        txtMensaje.setFont(new java.awt.Font("Ubuntu Mono", 0, 27)); // NOI18N
        txtMensaje.setBorder(null);
        txtMensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMensaje.setMargin(new java.awt.Insets(9, 6, 2, 6));
        txtMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRedondo1Layout = new javax.swing.GroupLayout(panelRedondo1);
        panelRedondo1.setLayout(panelRedondo1Layout);
        panelRedondo1Layout.setHorizontalGroup(
            panelRedondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        panelRedondo1Layout.setVerticalGroup(
            panelRedondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelChatLayout = new javax.swing.GroupLayout(panelChat);
        panelChat.setLayout(panelChatLayout);
        panelChatLayout.setHorizontalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChatLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(panelRedondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelChatLayout.setVerticalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChatLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelRedondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        fondo.add(panelChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 650, 70));

        fondoChat.setBackground(new java.awt.Color(255, 255, 255));
        fondoChat.setBordeInferiorDer(36);
        fondoChat.setBordeInferiorIzq(36);
        fondoChat.setBordeSuperiorDer(36);
        fondoChat.setBordeSuperiorIzq(36);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        areaChat.setEditable(false);
        areaChat.setBackground(new java.awt.Color(255, 255, 255));
        areaChat.setColumns(20);
        areaChat.setFont(new java.awt.Font("Ubuntu Mono", 0, 23)); // NOI18N
        areaChat.setRows(5);
        areaChat.setText("Eliza: BUENAS TARDES, POR FAVOR ESCRIBA SU NOMBRE");
        areaChat.setBorder(null);
        areaChat.setOpaque(false);
        jScrollPane2.setViewportView(areaChat);

        javax.swing.GroupLayout fondoChatLayout = new javax.swing.GroupLayout(fondoChat);
        fondoChat.setLayout(fondoChatLayout);
        fondoChatLayout.setHorizontalGroup(
            fondoChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoChatLayout.setVerticalGroup(
            fondoChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoChatLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        fondo.add(fondoChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 610, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //Mover la ventana pulsando el panel de arriba
    
    private void panelVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVentanaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelVentanaMousePressed

    private void panelVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVentanaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelVentanaMouseDragged

    private void lblBtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblBtnCerrarMouseClicked

    private void lblBtnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseEntered
        btnCerrar.setBackground(Color.DARK_GRAY);
        lblBtnCerrar.setToolTipText("Cerrar ventana");
        
    }//GEN-LAST:event_lblBtnCerrarMouseEntered

    private void lblBtnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseExited
        btnCerrar.setBackground(new Color(50,50,50));
    }//GEN-LAST:event_lblBtnCerrarMouseExited

    private void lblBtnMInimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMInimizarMouseEntered
        btnMinimizar.setBackground(Color.DARK_GRAY);
        lblBtnMInimizar.setToolTipText("Minimizar la ventana");
    }//GEN-LAST:event_lblBtnMInimizarMouseEntered

    private void lblBtnMInimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMInimizarMouseExited
        btnMinimizar.setBackground(new Color(50,50,50));
    }//GEN-LAST:event_lblBtnMInimizarMouseExited

    private void lblBtnMInimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMInimizarMouseClicked
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblBtnMInimizarMouseClicked

    private void lblBtnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMousePressed
        btnCerrar.setBackground(new Color(40,40,40));
    }//GEN-LAST:event_lblBtnCerrarMousePressed

    private void lblBtnMInimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMInimizarMousePressed
        btnMinimizar.setBackground(new Color(40,40,40));
    }//GEN-LAST:event_lblBtnMInimizarMousePressed

    private void txtMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeActionPerformed
        enviarMensaje();
    }//GEN-LAST:event_txtMensajeActionPerformed

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        enviarMensaje();
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new Color(203,209,255));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(colorBtnEnviar);
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMousePressed
        btnEnviar.setBackground(new Color(146,152,189));
    }//GEN-LAST:event_btnEnviarMousePressed

    private void btnEnviarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseReleased
        if (btnEnviar.getBackground() == colorBtnEnviar) {
        } else {
            btnEnviar.setBackground(new Color(203,209,255));
        }
    }//GEN-LAST:event_btnEnviarMouseReleased

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
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ELizaFoto;
    private javax.swing.JTextArea areaChat;
    private javax.swing.JPanel bordeDerecho;
    private javax.swing.JPanel bordeInferior;
    private javax.swing.JPanel bordeIzquierdo;
    private javax.swing.JPanel btnCerrar;
    private com.GUI.PanelRedondo btnEnviar;
    private javax.swing.JPanel btnMinimizar;
    private javax.swing.JPanel fondo;
    private com.GUI.PanelRedondo fondoChat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBtnCerrar;
    private javax.swing.JLabel lblBtnEnviar;
    private javax.swing.JLabel lblBtnMInimizar;
    private javax.swing.JLabel lblChatBot;
    private javax.swing.JLabel lblELiza;
    private javax.swing.JPanel panelChat;
    private javax.swing.JPanel panelLateral;
    private com.GUI.PanelRedondo panelRedondo1;
    private javax.swing.JPanel panelSuperiorAzul;
    private javax.swing.JPanel panelVentana;
    private javax.swing.JTextField txtMensaje;
    // End of variables declaration//GEN-END:variables
}
