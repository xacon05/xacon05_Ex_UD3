import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Apuesta extends JFrame {

    public Apuesta() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
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
        jPanel1.add(jLabel3, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36));
        jLabel1.setForeground(ja
