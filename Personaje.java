package EjercicioHerencia2;

// Generic interface for abilities
interface Habilidades<T> {
    void usarHabilidad(T habilidad);
}

// Abstract class Personaje that implements the generic interface Habilidades
abstract class Personaje implements Habilidades<String> {
    protected String nombrePersonaje;
    protected int nivel;

    public Personaje(String nombrePersonaje, int nivel) {
        if (nivel < 1) {
            throw new IllegalArgumentException("The level cannot be less than 1");
        }
        this.nombrePersonaje = nombrePersonaje;
        this.nivel = nivel;
    }

    public String atributosPersonajes() {
        return "Personaje: " + nombrePersonaje
                + " , Nivel: " + nivel;
    }

    // Abstract method for attacking
    public abstract void atacar();

    // Method from the Habilidades interface
    public void usarHabilidad(String habilidad) {
        // Implementation for using an ability
    }
}
