/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Camion;
import Modelo.Coche;
import Modelo.Motocicleta;
import Vista.VistaVehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlVehiculos implements ActionListener {
    private Coche coche;
    private Motocicleta motoCicleta;
    private Camion camion;
    private VistaVehiculos vista;

    public ControlVehiculos(Coche coche, Motocicleta motoCicleta, Camion camion, VistaVehiculos vista) {
        this.coche = coche;
        this.motoCicleta = motoCicleta;
        this.camion = camion;
        this.vista = vista;
        actionListener(this);
    }

    private void actionListener(ActionListener control) {
        vista.btnGuardar.addActionListener(control);
        vista.btnCalcular.addActionListener(control);
        vista.btnMostrar.addActionListener(control);
        vista.jComboBox.addActionListener(control);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().contentEquals("Guardar")) {
            guardarDatos();
        } else if (e.getActionCommand().equals("Calcular")) {
            calcular();
        } else if (e.getActionCommand().equals("Mostrar")) {
            mostrar();
        } else {
            habilitarCampos();
        }
    }

    private void guardarDatos() {
        String matricula = vista.txtMatricula.getText();
        String marca = vista.txtMarca.getText();
        String modelo = vista.txtModelo.getText();
        int anio = Integer.parseInt(vista.txtAño.getText());
        
        if (vista.jComboBox.getSelectedItem().equals("Coche")) {
            double turbo = Double.parseDouble(vista.txtTurbo.getText());
            coche = new Coche(matricula, marca, modelo, anio, (int) turbo);
            vista.txtAreaResult.setText("Datos del coche guardados.");
        } else if (vista.jComboBox.getSelectedItem().equals("Motocicleta")) {
            double cilindrada = Double.parseDouble(vista.txtCilindrada.getText());
            motoCicleta = new Motocicleta(matricula, marca, modelo, anio, (int) cilindrada);
            vista.txtAreaResult.setText("Datos de la motocicleta guardados.");
        } else if (vista.jComboBox.getSelectedItem().equals("Camion")) {
            double peso = Double.parseDouble(vista.txtPeso.getText());
            camion = new Camion(matricula, marca, modelo, anio, peso);
            vista.txtAreaResult.setText("Datos del camión guardados.");
        }
    }

    private void calcular() {
        if (coche != null) {
            vista.txtAreaResult.setText("Costo de mantenimiento del coche: " + coche.calcularCostoMantenimiento());
        } else if (motoCicleta != null) {
            vista.txtAreaResult.setText("Costo de mantenimiento de la motocicleta: " + motoCicleta.calcularCostoMantenimiento());
        } else if (camion != null) {
            vista.txtAreaResult.setText("Costo de mantenimiento del camión: " + camion.calcularCostoMantenimiento());
        } else {
            vista.txtAreaResult.setText("No se ha guardado ningún vehículo.");
        }
    }

    private void mostrar() {
        if (coche != null) {
            vista.txtAreaResult.setText(coche.MostrarInformacion());
        } else if (motoCicleta != null) {
            vista.txtAreaResult.setText(motoCicleta.MostrarInformacion());
        } else if (camion != null) {
            vista.txtAreaResult.setText(camion.MostrarInformacion());
        } else {
            vista.txtAreaResult.setText("No se ha guardado ningún vehículo.");
        }
    }

    
    // String selected = (String) VistaVehiculos.jComboBox.getSelectedItem();
        private void habilitarCampos() {
        if(vista.jComboBox.getSelectedItem().equals("Coche")){
          
        vista.txtTurbo.setEnabled(true);
        vista.txtCilindrada.setEnabled(false);
        vista.txtPeso.setEnabled(false);
        
    } 
       if(vista.jComboBox.getSelectedItem().equals("Motocicleta")){
        
        vista.txtTurbo.setEnabled(false);
        vista.txtCilindrada.setEnabled(true);
        vista.txtPeso.setEnabled(false);
            
        }
        if(vista.jComboBox.getSelectedItem().equals("Camion")){
        
        vista.txtTurbo.setEnabled(false);
        vista.txtCilindrada.setEnabled(false);
        vista.txtPeso.setEnabled(true);
            
        }
   
    }

    public static void main(String[] args) {
        // Crear instancia de vista
        VistaVehiculos vista = new VistaVehiculos();
        
        // Crear instancias de vehículos (se inicializarán cuando se guarden datos)
        Coche coche = null;
        Motocicleta motoCicleta = null;
        Camion camion = null;
        
        // Crear instancia del controlador
        ControlVehiculos controlador = new ControlVehiculos(coche, motoCicleta, camion, vista);
        
        // Configurar y mostrar la vista
        vista.setVisible(true);
    }
}
    
   
    

