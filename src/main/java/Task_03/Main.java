/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task_03;

/**
 *
 * @author codez
 */
public class Main {

    public static void main(String[] args) {

        SmartBulb bulb = new SmartBulb();

        bulb.turnOn();
        bulb.setBrightness(80);
        System.out.println(bulb.getStatus());

        SmartThermostat thermostat = new SmartThermostat();

        thermostat.turnOn();
        thermostat.setTemperature(24.5);
        System.out.println(thermostat.getStatus());
    }
}
