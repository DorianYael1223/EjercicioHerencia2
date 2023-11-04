package EjercicioHerencia2;

// Class that implements magical abilities
class PersonajeMagico extends Personaje {
    public PersonajeMagico(String nombrePersonaje, int nivel) {
        // Call the constructor of the superclass (Personaje)
        super(nombrePersonaje, nivel);
    }

    // Override the 'atacar' method from the superclass
    @Override
    public void atacar() {
        if (nivel < 5) {
            // If the character's level is less than 5, throw an exception
            throw new IllegalArgumentException(nombrePersonaje + " cannot attack because their level is less than 5");
        }
        // Otherwise, print a message indicating the character is attacking
        System.out.println(nombrePersonaje + " is attacking!");
    }
    
    // New method specific to PersonajeMagico for casting a spell
    @Override
    public void usarHabilidad(String habilidad) {
        // Print a message indicating that the character is casting a spell
        habilidad = " is casting a spell";
        System.out.println(nombrePersonaje + habilidad);
    }

    public void lanzarHechizo() {
    }
}
