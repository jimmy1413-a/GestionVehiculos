/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author deton
 */
public abstract class Vehiculos {
    
    public String matricula;
    public String marca;
    public String modelo;
    public int añoFabricacion;

    public Vehiculos(String matricula, String marca, String modelo, int añoFabricacion) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

   
    public String MostrarInformacion() {
        return "Vehiculos{" + "matricula=" + matricula + "\n marca=" + marca + "\n modelo=" + modelo + "\n año Fabricacion=" + añoFabricacion + '}';
    }
    
    
    public abstract double calcularCostoMantenimiento();
    
    
}
