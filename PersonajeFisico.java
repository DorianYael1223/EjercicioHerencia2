package EjercicioHerencia2;

// Clase que implementa habilidades físicas
// Clase que implementa habilidades físicas
class PersonajeFisico  extends Personaje {
    public PersonajeFisico(String nombrePersonaje, int nivel) {
        super(nombrePersonaje, nivel);
    }

    public void atacar() {
        if (nivel < 5) {
            throw new RuntimeException(nombrePersonaje + " no puede atacar porque su nivel es menor a 5");
        }
        System.out.println(nombrePersonaje + " ¡atacando!");
    }

    public void usarHabilidadFisica() {
        System.out.println(nombrePersonaje + " está usando una habilidad física");
    }
}