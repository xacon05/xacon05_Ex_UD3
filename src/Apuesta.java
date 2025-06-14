import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * La clase Apuesta representa la interfaz gráfica principal para gestionar una quiniela de partidos.
 * Permite añadir, eliminar y realizar apuestas aleatorias para los partidos listados.
 */
public class Apuesta extends javax.swing.JFrame {

   /**
    * Crea una quiniela para realizar apuestas en partidos.
    */
    public Apuesta()
    {
        initComponents();
        this.setResizable(Boolean.FALSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pEtiquetaQuiniela = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pQuiniela = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaQuiniela = new javax.swing.JList();
        pBotones = new javax.swing.JPanel();
        bNuevo = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bRealizar = new javax.swing.JButton();
        bResetear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaResultados = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 07");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Partidos");
        jPanel1.add(jLabel2, java.awt.BorderLayout.WEST);

        jLabel3.setText("Resultados");
        jPanel1.add(jLabel3, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Quiniela");
        pEtiquetaQuiniela.add(jLabel1);

        getContentPane().add(pEtiquetaQuiniela, java.awt.BorderLayout.NORTH);

        pQuiniela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pQuiniela.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setMaximumSize(new java.awt.Dimension(150, 200));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(150, 200));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(150, 200));

        jScrollPane3.setViewportView(listaQuiniela);

        pQuiniela.add(jScrollPane3, java.awt.BorderLayout.WEST);

        pBotones.setMaximumSize(new java.awt.Dimension(125, 200));
        pBotones.setMinimumSize(new java.awt.Dimension(125, 200));
        pBotones.setPreferredSize(new java.awt.Dimension(125, 200));

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });
        pBotones.add(bNuevo);

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        pBotones.add(bEliminar);

        bRealizar.setText("Realizar quiniela");
        bRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizarActionPerformed(evt);
            }
        });
        pBotones.add(bRealizar);

        bResetear.setText("Resetear");
        bResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetearActionPerformed(evt);
            }
        });
        pBotones.add(bResetear);

        pQuiniela.add(pBotones, java.awt.BorderLayout.CENTER);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(150, 200));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(150, 200));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(150, 200));

        jScrollPane2.setViewportView(listaResultados);

        pQuiniela.add(jScrollPane2, java.awt.BorderLayout.EAST);

        getContentPane().add(pQuiniela, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para añadir el boton de nuevo partido.
     * @param evt será el evento a añadir.
     */
    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        CrearPartido agregarpartido = new CrearPartido(this);
        agregarpartido.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        agregarpartido.setSize(400, 75);
        agregarpartido.setResizable(Boolean.FALSE);
        agregarpartido.setTitle("Agregar nuevo partido");
        agregarpartido.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_bNuevoActionPerformed

    /**
     * Metodo para añadir botón de eliminar un partido.
     * @param evt será el evento a eliminar
     */
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        borraPartido(listaQuiniela.getSelectedIndex());
    }//GEN-LAST:event_bEliminarActionPerformed

    /**
     * Metodo para añadir botón de resetear la quiniela.
     * @param evt será el evento a resetear.
     */
    private void bResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetearActionPerformed
        DefaultListModel modelovacio = new DefaultListModel();
        this.listaQuiniela.setModel(modelovacio);
        this.listaResultados.setModel(modelovacio);
    }//GEN-LAST:event_bResetearActionPerformed

   /**
    * Método para elegir un número aleatorio truncado de entre dos números.
    * @param n1 será el primer número entero.
    * @param n2 será el segundo número entero.
    * @return un número entero aleatorio.
    */
    public int cualquiera(int n1, int n2)
    {
        return (int)Math.floor((Math.random()*(n2-n1+1) + n1));
    }

    /**
     * Método para realizar la apuesta.
     * Genera resultados aleatorios (1, X, o 2) para cada partido en la lista de partidos
     * y actualiza la lista de resultados.
     * @param evt será el evento a realizar.
     */
    private void bRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizarActionPerformed
        DefaultListModel modeloquinielaresuelta = new DefaultListModel();

        for(int i = 0; i < this.listaQuiniela.getModel().getSize(); i++)
        {
            String partidoresuelto = this.listaQuiniela.getModel().getElementAt(i).toString();

            switch( cualquiera(0,2) )
            {
                case 0:
                    partidoresuelto += " -> 1";
                    break;
                case 1:
                    partidoresuelto += " -> X";
                    break;
                case 2:
                    partidoresuelto += " -> 2";
                    break;
            }

            modeloquinielaresuelta.addElement(partidoresuelto);
        }

        this.listaResultados.setModel(modeloquinielaresuelta);
    }//GEN-LAST:event_bRealizarActionPerformed

    /**
     * Método para añadir un partido nuevo a la quiniela.
     * Añade el partido proporcionado al final de la lista de partidos.
     * @param partido será el partido a añadir.
     */
    public void partidoNuevo (String partido)
    {
        DefaultListModel modelonuevo = new DefaultListModel();

        for(int i = 0; i < this.listaQuiniela.getModel().getSize(); i++)
        {
            modelonuevo.addElement(this.listaQuiniela.getModel().getElementAt(i));
        }
        modelonuevo.addElement(partido);

        this.listaQuiniela.setModel(modelonuevo);
    }

    /**
     * Método para eliminar un partido de la quiniela.
     * Elimina el partido en la posición especificada de ambas listas: partidos y resultados.
     * @param indice será la posición del partido a eliminar.
     */
    public void borraPartido (int indice)
    {
        DefaultListModel modelonuevoquiniela = new DefaultListModel();
        DefaultListModel modelonuevoresultados = new DefaultListModel();

        for(int i = 0; i < this.listaQuiniela.getModel().getSize(); i++)
        {
            if( i != indice )
            {
                modelonuevoquiniela.addElement(this.listaQuiniela.getModel().getElementAt(i));
            }
        }

        for(int i = 0; i < this.listaResultados.getModel().getSize(); i++)
        {
            if( i != indice )
            {
                modelonuevoresultados.addElement(this.listaResultados.getModel().getElementAt(i));
            }
        }

        this.listaQuiniela.setModel(modelonuevoquiniela);
        this.listaResultados.setModel(modelonuevoresultados);
    }

   /**
    * Genera una quiniela para realizar apuestas.
    * @param args Los argumentos de la línea de comandos.
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
            java.util.logging.Logger.getLogger(Apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bRealizar;
    private javax.swing.JButton bResetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaQuiniela;
    private javax.swing.JList listaResultados;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pEtiquetaQuiniela;
    private javax.swing.JPanel pQuiniela;
    // End of variables declaration//GEN-END:variables
}
