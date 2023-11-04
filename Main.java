package EjercicioHerencia2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>(); // Creamos la list o coleccion Personajes
        try {
            // Se crean los objetos con sus atributos
            personajes.add(new PersonajeMagico("Potter", 15));
            personajes.add(new PersonajeFisico("Seiya", 15));
            personajes.add(new PersonajeMagico("Severus", 15));
            personajes.add(new PersonajeFisico("Naruto", 15));

            // Se hace la comparacion entre los nombres y se ordenan
            Collections.sort(personajes,
                    (personaje1, personaje2) -> personaje1.nombrePersonaje.compareTo(personaje2.nombrePersonaje));
            for (Personaje personaje : personajes) {
                personaje.atacar();
                personaje.usarHabilidad("Habilidad");
                System.out.println();
            }
            // Exepcion para personajes con nivel menor a 5 o nivel menor a 1
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        //Iterator que recorre y muestra los objetos
        Iterator<Personaje> it = personajes.iterator();
        while (it.hasNext()) {
            Personaje personaje = it.next();
            System.out.println(personaje.atributosPersonajes());
        }
    }
}
