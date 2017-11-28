/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import Datos.Jugador;
/**
 *
 * @author admin
 */
public class Pantalla extends javax.swing.JFrame {
    private javax.swing.JButton jugar;
    private javax.swing.JButton ayuda;
    private javax.swing.JButton salir;
    private javax.swing.JLabel jLabel1;

    public Pantalla() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void initComponents() {

        jugar = new javax.swing.JButton();
        ayuda= new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugar.setBackground(new java.awt.Color(0, 0, 102));
        jugar.setText("JUGAR");
        jugar.setToolTipText("");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });
        getContentPane().add(jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 130, 60));

        ayuda.setBackground(new java.awt.Color(0, 0, 102));
        ayuda.setText("SALIR");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 130, 50));

        salir.setBackground(new java.awt.Color(0, 0, 102));
        salir.setText("AYUDA");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagen un.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 560));

        pack();
    }
        private void jugarActionPerformed(java.awt.event.ActionEvent evt) {                                         
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumeroJugadores().setVisible(true);
            }
        });
    }                                        

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {                                         
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucciones().setVisible(true);
                
            }
        });
    }                                        

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(WIDTH);
    }    
            protected void addActionListeners(ActionListener e)
	{
		jugar.addActionListener(e);
		ayuda.addActionListener(e);
		salir.addActionListener(e);
	}
            
}

class NumeroJugadores extends javax.swing.JFrame{
    private javax.swing.JButton jugadores2;
    private javax.swing.JButton jugadores3;
    private javax.swing.JButton jugadores4;
    private javax.swing.JButton jugadores5;
    private javax.swing.JLabel jLabel1;
    private int num;
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    

    public NumeroJugadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.num=0;
    }
        private void initComponents() {

        jugadores2 = new javax.swing.JButton();
        jugadores3 = new javax.swing.JButton();
        jugadores4 = new javax.swing.JButton();
        jugadores5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugadores2.setText("2 JUGADORES");
        getContentPane().add(jugadores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 120, -1));
        jugadores3.setText("3 JUGADORES");
        getContentPane().add(jugadores3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 120, -1));
        jugadores4.setText("4 JUGADORES");
        getContentPane().add(jugadores4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 120, -1));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagen un.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jugadores2.setActionCommand("2");
        jugadores3.setActionCommand("3");
        jugadores4.setActionCommand("4");
        pack();
// </editor-fold>                        
        }
        protected void addActionListeners(ActionListener e)
	{
		jugadores2.addActionListener(e);
		jugadores3.addActionListener(e);
		jugadores4.addActionListener(e);
	}
    
    
}

class IngresarJugadores extends javax.swing.JFrame{
    private javax.swing.JButton siguiente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private int numerojugadores;
    private int numeroj;
    
    public IngresarJugadores(int numerojugadores) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.numerojugadores=numerojugadores;
        this.numeroj=0;
        
    }
    
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        siguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(606, 604));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medico", "ingeniero", "abogado", "artista", "matematico" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medico", "ingeniero", "abogado", "artista", "matematico" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));
        
        if (numerojugadores>2){
             jComboBox3 = new javax.swing.JComboBox<>();
             jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medico", "ingeniero", "abogado", "artista", "matematico" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setText("sebastian");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 290, 120, -1));
        }
        if (numerojugadores>3){
            jComboBox4 = new javax.swing.JComboBox<>();
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medico", "ingeniero", "abogado", "artista", "matematico" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setText("karl");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 330, 120, -1));
        }
        jTextField1.setText("Jorge");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 210, 120, -1));

        jTextField2.setText("Lcochon");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 250, 120, -1));
        siguiente.setText("SIGUIENTE");
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagen un.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        pack();
    }
    protected void addActionListeners(ActionListener e){
        jComboBox1.addActionListener(e);
    }
}