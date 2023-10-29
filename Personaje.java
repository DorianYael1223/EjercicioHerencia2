package EjercicioHerencia2;

// Interfaz genérica para habilidades
interface Habilidades<T> {
    void usarHabilidad(T habilidad);
}

// Clase abstracta Personaje que implementa la interfaz genérica Habilidades
abstract class Personaje implements Habilidades<String> {
    protected String nombrePersonaje;
    protected int nivel;

    public Personaje(String nombrePersonaje, int nivel) {
        if (nivel < 1) {
            throw new IllegalArgumentException("El nivel no puede ser menor que 1");
        }
        this.nombrePersonaje = nombrePersonaje;
        this.nivel = nivel;
    }

    // Método abstracto para atacar
    public abstract void atacar();

    // Método de la interfaz Habilidades
    public void usarHabilidad(String habilidad) {
        // Implementación para usar habilidad
    }
}
