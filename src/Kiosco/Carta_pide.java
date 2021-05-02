/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kiosco;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Diego
 */
public class Carta_pide extends javax.swing.JPanel implements Runnable{

    /**
     * Creates new form Carta_pide
     */
    String hora, minutos,segundos;
    Thread hilo;
    
    public String primero = "", bebida ="", pedidofinal;
    ArrayList<String> pedidos = new ArrayList<String>();
    ArrayList<Integer> precios = new ArrayList<Integer>();
    
    ventana v=new ventana();
    
    public ventana getV() {
        return v;
    }

    public void setV(ventana v) {
        this.v = v;
    }
    
    public Carta_pide(ArrayList<String> lista, ArrayList<Integer> listap) {
        initComponents();
        pedidos = lista;
        precios = listap;
        lbdia.setText (Fecha ());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }
    
     public void Hora(){
        Calendar calendario = new GregorianCalendar ();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }

    public void run(){
        Thread current = Thread.currentThread();
        while (current ==hilo){
            Hora();
            lbhora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    
    public static String Fecha(){
        Date fecha = new Date ();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Boton12 = new javax.swing.JRadioButton();
        Boton11 = new javax.swing.JRadioButton();
        Boton13 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Boton21 = new javax.swing.JRadioButton();
        Boton23 = new javax.swing.JRadioButton();
        Boton22 = new javax.swing.JRadioButton();
        Boton24 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbhora = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbdia = new javax.swing.JLabel();
        erro = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(500, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Carta");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, -1, -1));

        Boton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton12.setText("Merluza en salsa verde");
        Boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton12ActionPerformed(evt);
            }
        });
        add(Boton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        Boton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton11.setText("Pulpo a feira");
        Boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton11ActionPerformed(evt);
            }
        });
        add(Boton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        Boton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton13.setText("Chuletón de buey");
        Boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton13ActionPerformed(evt);
            }
        });
        add(Boton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Bebidas");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        buttonGroup1.add(Boton21);
        Boton21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton21.setText("Agua");
        Boton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton21ActionPerformed(evt);
            }
        });
        add(Boton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        buttonGroup1.add(Boton23);
        Boton23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton23.setText("Vino");
        Boton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton23ActionPerformed(evt);
            }
        });
        add(Boton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        buttonGroup1.add(Boton22);
        Boton22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton22.setText("Refrescos");
        Boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton22ActionPerformed(evt);
            }
        });
        add(Boton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        buttonGroup1.add(Boton24);
        Boton24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton24.setText("Cerveza");
        Boton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton24ActionPerformed(evt);
            }
        });
        add(Boton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Platos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("13€");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("15€");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("20€");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("2€");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Añadir al carrito");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Solo se puede pedir un plato y/o una bebida por cada pedido");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        lbhora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbhora.setText("00:00:00");
        add(lbhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("-");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        lbdia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbdia.setText("MM/DD/YYYY");
        add(lbdia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        erro.setForeground(new java.awt.Color(255, 0, 0));
        add(erro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Pide pp=new Pide(pedidos, precios);
        pp.setVisible(true);
        pp.setV(this.v);
        this.v.setContentPane(pp);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if (Boton11.isSelected()==true || Boton12.isSelected()==true || Boton13.isSelected()==true || Boton21.isSelected()==true || Boton23.isSelected()==true || Boton22.isSelected()==true || Boton24.isSelected()==true){
            if (primero == "" && bebida != ""){
                pedidofinal = "Carta: 2€\n " + bebida;
                precios.add(2);
            } else if ( bebida == "" && primero != ""){
                if (Boton11.isSelected() == true){
                    pedidofinal = "Carta: 13€\n " + primero;
                    precios.add(13);
                } else if (Boton12.isSelected() == true){
                    pedidofinal = "Carta: 15€\n " + primero;
                    precios.add(15);
                } else if (Boton13.isSelected() == true){
                    pedidofinal = "Carta: 20€\n " + primero;
                    precios.add(20);
                }
            } else if (bebida != "" && primero != ""){
                if (Boton11.isSelected() == true){
                    pedidofinal = "Carta: 15€\n " + primero + ", " + bebida;
                    precios.add(15);
                } else if (Boton12.isSelected() == true){
                    pedidofinal = "Carta: 17€\n " + primero + ", " + bebida;
                    precios.add(17);
                } else if (Boton13.isSelected() == true){
                    pedidofinal = "Carta: 22€\n " + primero + ", " + bebida;
                    precios.add(22);
                }
            }
            pedidos.add (pedidofinal);
            this.v.getContentPane().setVisible(false);
            Consultar_pedido pp=new Consultar_pedido(pedidos, precios);
            pp.setVisible(true);
            pp.setV(this.v);
            this.v.setContentPane(pp);
         } else{
             erro.setText("Seleccione algún elemento que desee");
         }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton11ActionPerformed
        // TODO add your handling code here:
        if (Boton11.isSelected()==true){
            primero = "pulpo a feira";
        }
    }//GEN-LAST:event_Boton11ActionPerformed

    private void Boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton12ActionPerformed
        // TODO add your handling code here:
        if (Boton12.isSelected()==true){
            primero = "merluza en salsa verde";
        }
    }//GEN-LAST:event_Boton12ActionPerformed

    private void Boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton13ActionPerformed
        // TODO add your handling code here:
        if (Boton13.isSelected()==true){
            primero = "chuletón de buey";
        }
    }//GEN-LAST:event_Boton13ActionPerformed

    private void Boton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton21ActionPerformed
        // TODO add your handling code here:
        if (Boton21.isSelected()==true){
            bebida = "agua";
        }
    }//GEN-LAST:event_Boton21ActionPerformed

    private void Boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton22ActionPerformed
        // TODO add your handling code here:
        if (Boton22.isSelected()==true){
            bebida = "refrescos";
        }
    }//GEN-LAST:event_Boton22ActionPerformed

    private void Boton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton23ActionPerformed
        // TODO add your handling code here:
        if (Boton23.isSelected()==true){
            bebida = "vino";
        }
    }//GEN-LAST:event_Boton23ActionPerformed

    private void Boton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton24ActionPerformed
        // TODO add your handling code here:
        if (Boton24.isSelected()==true){
            bebida = "cerveza";
        }
    }//GEN-LAST:event_Boton24ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Boton11;
    private javax.swing.JRadioButton Boton12;
    private javax.swing.JRadioButton Boton13;
    private javax.swing.JRadioButton Boton21;
    private javax.swing.JRadioButton Boton22;
    private javax.swing.JRadioButton Boton23;
    private javax.swing.JRadioButton Boton24;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel erro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbdia;
    private javax.swing.JLabel lbhora;
    // End of variables declaration//GEN-END:variables
}