/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.conceptos.basicos;

import java.awt.Color;

/**
 *
 * @author Jibda
 */
public class Automovil {
    private String marca;
    private String submarca;
    private int modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String submarca, int modelo, Color color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public void encender(){
        System.out.println("El auto " + this.submarca + " esta encendido.");
    }
    
    public void acelerar(){
        System.out.println("Acelerando el auto " + this.submarca );
    }
    
    public void avanzar(){
        System.out.println("Avanzando el auto");
    }
}
