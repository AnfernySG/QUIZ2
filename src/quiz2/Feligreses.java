/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author USUARIO
 */
public class Feligreses {
    String nombre;
    int cantidad;
    int cedula;
    double diezmo;

    public Feligreses(String nombre, int cantidad, int cedula, double diezmo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cedula = cedula;
        this.diezmo = diezmo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getDiezmo() {
        return diezmo;
    }

    public void setDiezmo(double diezmo) {
        this.diezmo = diezmo;
    }
}
