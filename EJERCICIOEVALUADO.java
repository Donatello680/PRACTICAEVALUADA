/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.evaluado;

import javax.swing.JOptionPane;

/**
 *
 * @author genes
 */
public class EJERCICIOEVALUADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui se ejecuta el codigo
        //El usuario debe ingresar la cantidad de productos para despues preguntarle cada uno
        //Este seria el N del 7xN
       int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos:"));
        String[] productos = new String[cantidadProductos];
        
        for (int i = 0; i < cantidadProductos; i++) {
            productos[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");
        }

        Tienda tienda = new Tienda(productos);
        
        tienda.mostrarVentasPorProducto();
        tienda.mostrarDiaMayorVentas();
        tienda.mostrarProductoMasVendido();
    }
}


    
    

