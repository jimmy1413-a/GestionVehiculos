/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author deton
 */
public class Motocicleta extends Vehiculos implements Mantenimiento {

    private int cilindrada;

    public Motocicleta(String matricula, String marca, String modelo, int añoFabricacion, int cilindrada) {
        super(matricula, marca, modelo, añoFabricacion);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCostoMantenimiento() {
        return cilindrada * (2024 - añoFabricacion) * 0.2; // Ajusta el cálculo según los requisitos específicos
    }

    @Override
    public void realizarRevision() {
        System.out.println("Realizando revisión de motocicleta...");
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Cambiando aceite de la motocicleta...");
    }

    
}
    

