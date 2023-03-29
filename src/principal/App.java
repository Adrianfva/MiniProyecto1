package principal;


import java.util.Arrays;

import javax.swing.JOptionPane;

import logica.Canino;
import logica.Perro;
import logica.Pulga;
import logica.Raza;

public class App {

    static Perro perro3 = new Perro("Rex", Raza.Labrador, (byte)50, "curvos", "medio", true);

    public static void main(String[] args) {
        perro3.getNombre();
        Perro sasha = new Perro("Sasha", Raza.Pug, (byte)400, "pequeños", "pacito", true);
        System.out.println(sasha.getNombre());
        sasha.insertarPulga(new Pulga("Grillo", 5000));
        Pulga pulguita = new Pulga("Eva", 1000);
        sasha.insertarPulga(pulguita);
        sasha.imprimirPulgas();
        String [] nombres = {"Ana", "Mateo", "Diana"};
        System.out.println(Arrays.toString(nombres));
        pulguita = null;
        System.gc();
        Perro perro2 = new Perro("Rex", Raza.Labrador, (byte)50, "largos", "duro", false);
        System.out.println(Perro.NUMERO_PERROS);
        JOptionPane.showMessageDialog(null, "Hola", null, JOptionPane.WARNING_MESSAGE);
        Perro.ladran();
        perro2 = null;
        System.gc();
        //Canino canino = new Canino("dientes", "aullan", true);
    }
}
