package EjercicioHerencia2;

// Clase que implementa habilidades mágicas
class PersonajeMagico extends Personaje  {
    public PersonajeMagico(String nombrePersonaje, int nivel) {
        super(nombrePersonaje, nivel);
    }

    @Override
    public void atacar() {
        if (nivel < 5) {
            throw new RuntimeException(nombrePersonaje + " no puede atacar porque su nivel es menor a 5");
        }
        System.out.println(nombrePersonaje + " ¡atacando!");
    }
    
    public void lanzarHechizo() {
        System.out.println(nombrePersonaje + " está lanzando un hechizo");
    }
}