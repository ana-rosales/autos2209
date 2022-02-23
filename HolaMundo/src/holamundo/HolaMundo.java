/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author Jibda
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        Persona per1 = new Persona();
        per1.setNombre("Ana PRO");
        System.out.println("Nombre:" + per1.getNombre());
        per1.comer("Hamburguesa hawaiiana!!!");
        
        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        per2.comer("Pizza Hawaiiana");
        System.out.println("Nombre:" + per2.getNombre());
    
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubmarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println("\nDatos del automóvil bocho");
        System.out.println("Marca: " + miBocho.getMarca());
        System.out.println("Submarca: " + miBocho.getSubmarca());
        System.out.println("Modelo: " + miBocho.getModelo());
        System.out.println("Color: " + miBocho.getColor());

        Automovil miAkura = new Automovil();
        miAkura.setMarca("Akura");
        miAkura.setSubmarca("NSX");
        miAkura.setModelo(2013);
        miAkura.setColor(Color.GRAY);
        System.out.println("\nDatos del automovil akura");
        System.out.println("Marca: " + miAkura.getMarca());
        System.out.println("Submarca: " + miAkura.getSubmarca());
        System.out.println("Modelo: " + miAkura.getModelo());
        System.out.println("Color: " + miAkura.getColor());

        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubmarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.YELLOW);
        System.out.println("\nDatos del automovil mustang");
        System.out.println("Marca: " + miMustang.getMarca());
        System.out.println("Submarca: " + miMustang.getSubmarca());
        System.out.println("Modelo: " + miMustang.getModelo());
        System.out.println("Color: " + miMustang.getColor());
    }
}
