package EjercicioHerencia2;

public class Main {
    public static void main(String[] args) {
        try {
            PersonajeMagico mago = new PersonajeMagico("Potter", 18);
            PersonajeFisico guerrero = new PersonajeFisico("Seiya", 15);
            PersonajeMagico mago2 = new PersonajeMagico("Mago2", 8);
            PersonajeFisico guerrero2 = new PersonajeFisico("Guerrero2", 3);

            mago.atacar();
            mago.lanzarHechizo();

            guerrero.atacar();
            guerrero.usarHabilidadFisica();

            mago2.atacar();
            mago2.lanzarHechizo();

            guerrero2.usarHabilidadFisica();
            guerrero2.atacar();
            
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}


