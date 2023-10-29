package EjercicioHerencia2;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a magical character named "Potter" with level 18
            PersonajeMagico mago = new PersonajeMagico("Potter", 18);

            // Create a physical character named "Seiya" with level 15
            PersonajeFisico guerrero = new PersonajeFisico("Seiya", 15);

            // Create another magical character named "Mago2" with level 8
            PersonajeMagico mago2 = new PersonajeMagico("Mago2", 8);

            // Create another physical character named "Guerrero2" with level 3
            PersonajeFisico guerrero2 = new PersonajeFisico("Guerrero2", 3);

            // Call the 'atacar' method for the magical character "Potter"
            mago.atacar();

            // Call the 'lanzarHechizo' method for the magical character "Potter"
            mago.lanzarHechizo();

            // Call the 'atacar' method for the physical character "Seiya"
            guerrero.atacar();

            // Call the 'usarHabilidadFisica' method for the physical character "Seiya"
            guerrero.usarHabilidadFisica();

            // Call the 'atacar' method for the magical character "Mago2"
            mago2.atacar();

            // Call the 'lanzarHechizo' method for the magical character "Mago2"
            mago2.lanzarHechizo();

            // Call the 'usarHabilidadFisica' method for the physical character "Guerrero2"
            guerrero2.usarHabilidadFisica();

            // Call the 'atacar' method for the physical character "Guerrero2"
            guerrero2.atacar();

        } catch (IllegalArgumentException e) {
            // Catch and handle an IllegalArgumentException if it occurs
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch and handle a RuntimeException if it occurs
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}


