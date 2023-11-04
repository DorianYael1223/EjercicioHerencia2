package EjercicioHerencia2;

// Class that implements physical abilities
class PersonajeFisico extends Personaje {
    public PersonajeFisico(String nombrePersonaje, int nivel) {
        // Call the constructor of the superclass (Personaje)
        super(nombrePersonaje, nivel);
    }

    // Implementation of the abstract 'atacar' method
    @Override
    public void atacar() {
        if (nivel < 5) {
            // If the character's level is less than 5, throw an exception
            throw new IllegalArgumentException(nombrePersonaje + " cannot attack because their level is less than 5");
        }
        // Otherwise, print a message indicating the character is attacking
        System.out.println(nombrePersonaje + " is attacking!");
    }
    @Override
    // New method specific to PersonajeFisico for using physical abilities
    public void usarHabilidad(String habilidad) {
        // Print a message indicating that the character is using a physical ability
        habilidad = "is using a physical ability";
        System.out.println(nombrePersonaje + habilidad);
    }

    public void usarHabilidadFisica() {
    }
}
