package EjercicioHerencia2;

// Class that implements physical abilities
class PersonajeFisico extends Personaje {
    public PersonajeFisico(String nombrePersonaje, int nivel) {
        // Call the constructor of the superclass (Personaje)
        super(nombrePersonaje, nivel);
    }

    // Implementation of the abstract 'atacar' method
    public void atacar() {
        if (nivel < 5) {
            // If the character's level is less than 5, throw an exception
            throw new RuntimeException(nombrePersonaje + " cannot attack because their level is less than 5");
        }
        // Otherwise, print a message indicating the character is attacking
        System.out.println(nombrePersonaje + " is attacking!");
    }

    // New method specific to PersonajeFisico for using physical abilities
    public void usarHabilidadFisica() {
        // Print a message indicating that the character is using a physical ability
        System.out.println(nombrePersonaje + " is using a physical ability");
    }
}
