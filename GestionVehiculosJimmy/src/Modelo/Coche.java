/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author deton
 */
public class Coche extends Vehiculos implements Mantenimiento{
    
    private int turbo;

    public Coche(String matricula, String marca, String modelo, int añoFabricacion,int turbo) {
        super(matricula, marca, modelo, añoFabricacion);
        this.turbo = turbo;
    }

    public int getTurbo() {
        return turbo;
    }

    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
     @Override
    public double calcularCostoMantenimiento() {
        // Supongamos un costo fijo basado en el año del coche
        return turbo * (2024 - añoFabricacion) * 100; // Ajusta el cálculo según los requisitos específicos
    }

    @Override
    public void realizarRevision() {
        System.out.println("Realizando revisión de coche...");
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Cambiando aceite del coche...");
    }
    
}
