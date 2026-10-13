/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task_03;

/**
 *
 * @author codez
 */
public class SmartBulb implements SmartDevice {

    private boolean isOn;
    private int brightness;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        return isOn ? "Bulb is ON" : "Bulb is OFF";
    }

    public void setBrightness(int level) {
        brightness = level;
        System.out.println("Brightness set to: " + brightness);
    }
    
    public void getStatus(string[] args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
