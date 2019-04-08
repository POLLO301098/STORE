
package INTERFACES;

import FUENTES.cargarFuente;

public class Estadisticas extends javax.swing.JFrame {
    
    cargarFuente fuente = new cargarFuente();

    public Estadisticas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(java.awt.Color.white);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(fuente.setFont(fuente.negrita, 0, 15));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/codigo.png"))); // NOI18N
        jButton1.setText("Inicio");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(180, 120));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(fuente.setFont(fuente.negrita, 0, 15));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/inventario.png"))); // NOI18N
        jButton2.setText("Inventario");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(180, 120));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(fuente.setFont(fuente.negrita, 0, 15));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/estadisticas.png"))); // NOI18N
        jButton3.setText("Estadisticas");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(180, 120));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(fuente.setFont(fuente.negrita, 0, 15));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ajustes.png"))); // NOI18N
        jButton4.setText("Ajustes");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(180, 120));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(fuente.setFont(fuente.negrita, 0, 15));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir.png"))); // NOI18N
        jButton5.setText("Salir");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(180, 120));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 670, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
