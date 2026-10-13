/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task_03;

/**
 *
 * @author codez
 */
public class SmartThermostat implements SmartDevice {

    private boolean isOn;
    private double temperature;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        return isOn ? "Thermostat is ON" : "Thermostat is OFF";
    }

    public void setTemperature(double temp) {
        temperature = temp;
        System.out.println("Temperature set to: " + temperature);
    }

    @Override
    public void getStatus(string[] args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
