/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author deton
 */
public class Camion extends Vehiculos implements Mantenimiento{

    private double peso;

   

    public Camion(String matricula, String marca, String modelo, int añoFabricacion, double peso) {
        super(matricula, marca, modelo, añoFabricacion);
        this.peso = peso;
    }

    @Override
    public double calcularCostoMantenimiento() {
        return peso * (2024 - añoFabricacion) * 0.5; // Ajusta el cálculo según los requisitos específicos
    }

    @Override
    public void realizarRevision() {
        System.out.println("Realizando revisión de camión...");
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Cambiando aceite del camión...");
    }
}
    

