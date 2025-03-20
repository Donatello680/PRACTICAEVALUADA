/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.evaluado;
 import java.util.Random;
/**
 *
 * @author genes
 */
public class Tienda {
    private String[] productos;
    private int[][] ventas;
    private String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    public Tienda(String[] productos) {
        this.productos = productos;
        this.ventas = new int[7][productos.length];
        generarVentasAleatorias();
    }

    /**
     * Genera ventas aleatorias entre 0 y 9 para cada producto en cada día.
     */
    private void generarVentasAleatorias() {
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < productos.length; j++) {
                ventas[i][j] = random.nextInt(10);
            }
        }
    }

    /**
     * Calcula y muestra el total de ventas por producto.
     */
    public void mostrarVentasPorProducto() {
        System.out.println("Total de ventas por producto:");
        for (int j = 0; j < productos.length; j++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += ventas[i][j];
            }
            System.out.println("- " + productos[j] + ": " + total);
        }
    }

    /**
     * Determina y muestra el día con mayores ventas totales.
     */
    public void mostrarDiaMayorVentas() {
        int maxVentas = 0;
        int diaMayor = 0;
        for (int i = 0; i < 7; i++) {
            int sumaDia = 0;
            for (int j = 0; j < productos.length; j++) {
                sumaDia += ventas[i][j];
            }
            if (sumaDia > maxVentas) {
                maxVentas = sumaDia;
                diaMayor = i;
            }
        }
        System.out.println("El día con mayores ventas es " + diasSemana[diaMayor] + " con " + maxVentas + " ventas.");
    }

    /**
     * Determina y muestra el producto más vendido de la semana.
     */
    public void mostrarProductoMasVendido() {
        int maxVentas = 0;
        int productoMayor = 0;
        for (int j = 0; j < productos.length; j++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += ventas[i][j];
            }
            if (total > maxVentas) {
                maxVentas = total;
                productoMayor = j;
            }
        }
        System.out.println("El producto más vendido es " + productos[productoMayor] + " con " + maxVentas + " unidades.");
    }
}
    

