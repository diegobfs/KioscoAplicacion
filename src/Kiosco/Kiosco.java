/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kiosco;

import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class Kiosco{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> pedidos = new ArrayList<String>();
        ArrayList<Integer> precios = new ArrayList<Integer>();
        Inicio pp=new Inicio(pedidos,precios);
        ventana v = new ventana();
        pp.setV(v);
        v.setContentPane(pp);
        v.setVisible(true);
    }
}
